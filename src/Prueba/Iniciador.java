package Prueba;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.internal.bind.util.ISO8601Utils;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Iniciador extends main_2 {
    private static String prefijoA;
    private static String prefijoB;

    public String getPrefijoA() {
        System.out.println("Escriba el prefijo de la moneda que desea convertir: ");
        Scanner entradaA = new Scanner(System.in);

        return prefijoA;
    }

    public void setPrefijoA() {
        this.prefijoA = prefijoA;
    }

    public String getPrefijoB() {
        System.out.println("Escriba el prefijo de la moneda a la que desea convertir: ");
        Scanner input = new Scanner(System.in);

        return prefijoB;
    }

    public void setPrefijoB() {
        this.prefijoB = prefijoB;
    }




    public static void main(String[] args) throws IOException, InterruptedException {
        Iniciador inputA = new Iniciador();
        Iniciador inputB = new Iniciador();
        inputA.getPrefijoA();
        inputB.getPrefijoB();
        Gson gson = new GsonBuilder()
                .setPrettyPrinting().create();
        String direccion = "https://v6.exchangerate-api.com/v6/d790cc48659cc1c4cebb4b4f/pair/" +prefijoA + "/" +prefijoB;
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(direccion))
                .build();

        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        String json = response.body();
        System.out.println(json);

        catching miconversion = gson.fromJson(json, catching.class);

    }
}