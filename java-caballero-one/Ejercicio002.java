import java.util.Scanner;

public class Ejercicio002 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("ingrese la cantidad de dolares porfa: ");
        int dolar=scanner.nextInt();
        int peso=20;
        final int TASA_CAMBIO=peso*dolar;

        System.out.println("Usted cuenta actualmente con " + TASA_CAMBIO + " pesos.");



    }
}
