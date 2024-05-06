package Prueba;

import java.io.IOException;

public class main_2 {

    public static void main(String[] args) throws IOException, InterruptedException {
        Calculos pCalculo = new Calculos();
        pCalculo.getValorUsuario();
        pCalculo.mostrarCantidad();

        Iniciador iniciar = new Iniciador();

        iniciar.getPrefijoA();
        iniciar.getPrefijoB();
    }
}
