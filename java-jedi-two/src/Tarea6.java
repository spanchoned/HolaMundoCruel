import java.util.Scanner;

public class Tarea6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de num pares que disea, para realizar un print: ");
        int N = scanner.nextInt();

        int contador = 0;
        int numero = 2;

        System.out.print("Los primeros " + N + " números pares son: ");
        while (contador < N) {
            System.out.print(numero + " ");
            numero += 2;
            contador++;
        }

        scanner.close();
    }
}
