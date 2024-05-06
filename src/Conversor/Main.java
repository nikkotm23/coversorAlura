/*package Conversor;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
      /*1
       Gson gson = new GsonBuilder()
                .setPrettyPrinting().create();

        String direccion = "https://v6.exchangerate-api.com/v6/d790cc48659cc1c4cebb4b4f/pair/MXN/EUR";
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(direccion))
                .build();

        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        String json = response.body();
        System.out.println(json);

        DataConversor miconversion = gson.fromJson(json, DataConversor.class);
        System.out.println(miconversion);*/
       /* while (true) {
            int i= 0;
            System.out.println("\nBienvenido al conversor de monedas!!!");

            System.out.println("********************************************************");
            System.out.println("Elija la opcion correcta");
            System.out.println("1. Peso Mexicano (MXN) a Euro (EUR)");
            System.out.println("2. Peso Mexicano (MXN) a Dolar (USD)");
            System.out.println("3. Dolar(USD) a Real Brasieño (BRL)");
            System.out.println("4. Libra Esterlina (GBP) a Franco Suizo (CHF)");
            System.out.println("5. Peso Argentino (ARS) a Quetzal GUatemala (GTD)");
            System.out.println("6. Salir.");
            System.out.println("********************************************************");
            System.out.println("Elija una opcion valida");
            Scanner lectura = new Scanner(System.in);
            i = lectura.nextInt();
            if (i == 6) break;
            else if ( i==1) {
                String A = "MXN";
                String B = "EUR";
                System.out.println("Escriba en valor en pesos que desea convertir a Dolares: ");
                Scanner money = new Scanner(System.in);
                var valor = money.nextLine();
                Gson gson = new GsonBuilder()
                        .setPrettyPrinting().create();

                String direccion = "https://v6.exchangerate-api.com/v6/d790cc48659cc1c4cebb4b4f/pair/"+A+"/"+B;
                HttpClient client = HttpClient.newHttpClient();
                HttpRequest request = HttpRequest.newBuilder()
                        .uri(URI.create(direccion))
                        .build();

                HttpResponse<String> response = client
                        .send(request, HttpResponse.BodyHandlers.ofString());

                String json = response.body();
                //System.out.println(json);
                //List<DataConversor>monedas = new (System.in);
                DataConversor miDataConversor = gson.fromJson(json, DataConversor.class);
                //Conversor.Main.Conversiones miConversion = new Conversor.Main.Conversiones(DataConversor);
                Conversiones miConversion = new Conversiones(miDataConversor);
                System.out.println(miConversion);

            }
        }
    }

    public static class Conversiones implements Comparable<Conversiones>{
        @SerializedName("Base_Code")
        private String monedaAConvertir;
        @SerializedName("Target_Code")
        private String monedaDestino;

        public void setValorAdquirido(int valorAdquirido) {
            this.valorAdquirido = valorAdquirido;
        }

        @SerializedName("Converion_Rate")
        private String monedaConvertida;

        public int getValorAdquirido() {
            return valorAdquirido;
        }


        private int valorAdquirido;

        public String getMonedaAConvertir(){
            return monedaAConvertir;
        }

        public String getMonedaDestino(){
            return monedaDestino;
        }

        public String getMonedaConvertida(){
            return monedaConvertida;
        }



        public Conversiones(DataConversor miDataConversor){
            this.monedaAConvertir = miDataConversor.base_code();
            this.monedaDestino = miDataConversor.target_code();
            this.monedaConvertida = miDataConversor.conversion_rate();
        }

        @Override
        public int compareTo(Conversiones otraConversion) {
            return this.getMonedaAConvertir().compareTo(otraConversion.getMonedaAConvertir());
        }

        public String toString(){
            //int Valor=0;
            //int cantidad = Valor;
            //int aux = Integer.parseInt(monedaConvertida)*Valor;
            //monedaConvertida=String.valueOf(aux);
            return "Moneda a Convertir: " +monedaAConvertir
                    + "\nMoneda Destino: " +monedaDestino
                    +"\nMoneda COnvertida: " + monedaConvertida;
        }

        public String valor(String Valor)
        {
            int aux = Integer.parseInt(Valor);
            int monedaInt = Integer.parseInt(monedaConvertida)*aux;
            //int resultado = monedaConvertida
            //System.out.println("LA conversion es: " Valor*monedaConvertida);
            return String.valueOf(Integer.parseInt("Moneda convertida es igual a : " + monedaInt));
        }
    }
}*/