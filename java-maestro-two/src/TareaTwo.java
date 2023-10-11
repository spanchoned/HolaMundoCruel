import java.util.Scanner;

public class TareaTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un número para buscar en el arreglo:");
        int num = scanner.nextInt();

        int[] numeros = {21, 22, 42, 77, 11, 51, 909};
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
    }
}
