package Prueba;

import java.util.Scanner;

public class Calculos {

    private int valorUsuario;

    public int getValorUsuario() {
        System.out.println("ingrese la cantidad a convertir: ");
        Scanner lectura = new Scanner(System.in);
        valorUsuario = lectura.nextInt();
        return valorUsuario;
    }

    public void setValorUsuario(int valorUsuario) {
        this.valorUsuario = valorUsuario;
    }

    public void mostrarCantidad(){
        System.out.println("La cantidad es igual a: "+ valorUsuario);
    }


}
