import java.util.Scanner;

public class Tarea5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un número, por favor:");
        int n = scanner.nextInt();
        int sumita = 0;

        System.out.print("Los números naturales hasta " + n + " son: ");
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
            sumita += i;
        }
        System.out.println();
        System.out.println("La suma de los números naturales hasta " + n + " es: " + sumita);
        scanner.close();
    }
}
