package javaCaballeroN1;

import java.util.Scanner;

public class Ejercicio003 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("ingrese la cantidad de euros porfa: ");
        int euro=scanner.nextInt();
        double dolar=1.20;
        final double TASA_CAMBIO=euro*dolar;

        System.out.println("Usted cuenta actualmente con " + TASA_CAMBIO + " dolares.");
    }
}
