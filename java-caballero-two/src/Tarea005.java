import java.util.Scanner;

public class Tarea005 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de elementos para el 1er arreglo: ");
        int cantidad1 = scanner.nextInt();
        Double[] arreglito = new Double[cantidad1];

        for (int i = 0; i < cantidad1; i++) {
            System.out.print("Ingrese el elemento #" + (i + 1) + ": ");
            arreglito[i] = scanner.nextDouble();
        }

        System.out.print("Ingrese la cantidad de elementos para el 2do arreglo: ");
        int cantidad2 = scanner.nextInt();
        Double[] arreglito2 = new Double[cantidad2];

        for (int i = 0; i < cantidad2; i++) {
            System.out.print("Ingrese el elemento #" + (i + 1) + ": ");
            arreglito2[i] = scanner.nextDouble();
        }

        int longitudResultado = Math.max(cantidad1, cantidad2);
        Double[] resultado = new Double[longitudResultado];

        for (int i = 0; i < longitudResultado; i++) {
            double valor1 = (i < cantidad1) ? arreglito[i] : 0;
            double valor2 = (i < cantidad2) ? arreglito2[i] : 0;

            double resta = valor1 - valor2;
            resultado[i] = (resta < 0) ? 0 : resta;
        }

        System.out.println("\nResultado de la resta con restricción a cero para negativos:");
        for (int i = 0; i < longitudResultado; i++) {
            System.out.println("Elemento #" + (i + 1) + ": " + resultado[i]);
        }

        scanner.close();
    }
}
