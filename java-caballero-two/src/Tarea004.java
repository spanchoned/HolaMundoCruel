import java.util.Scanner;
import java.util.Arrays;

public class Tarea004 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de números: ");
        int cantidadNumeros = scanner.nextInt();

        double[] numeros = new double[cantidadNumeros];

        for (int i = 0; i < cantidadNumeros; i++) {
            System.out.print("Ingrese el número #" + (i + 1) + ": ");
            numeros[i] = scanner.nextDouble();
        }

        Arrays.sort(numeros);
        System.out.println("\nNúmeros ordenados de forma ascendente:");
        for (double numero : numeros) {
            System.out.println(numero);
        }

        scanner.close();
    }
}
