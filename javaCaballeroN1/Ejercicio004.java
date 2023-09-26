package javaCaballeroN1;

import java.util.Scanner;

public class Ejercicio004 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("ingrese la cantidad de libras estarlinas porfa: ");
        int librasEstarlinas=scanner.nextInt();
        double dolar=1.40;
        final double TASA_CAMBIO=librasEstarlinas*dolar;

        System.out.println("Usted cuenta actualmente con " + TASA_CAMBIO + " dolares.");
    }
}
