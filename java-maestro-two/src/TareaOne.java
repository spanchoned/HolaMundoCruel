import java.util.Scanner;

public class TareaOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un número para buscar en el arreglo:");
        int num = scanner.nextInt();

        int[] numeros = {25, 28, 22, 34, 12, 55, 90};
        boolean encontrado = false;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == num) {
                for (int j = i; j < numeros.length - 1; j++) {
                    numeros[j] = numeros[j + 1];
                }
                encontrado = true;
                break;
            }
        }
        if (encontrado) {
            System.out.println("Número eliminado. Nuevo arreglo:");
            for (int i = 0; i < numeros.length - 1; i++) {
                System.out.print(numeros[i] + " ");
            }
            System.out.println();
        } else {
            System.out.println("El número no se encontró en el arreglo.");
        }

        scanner.close();
    }
}
