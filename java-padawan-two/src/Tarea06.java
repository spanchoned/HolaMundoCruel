import java.util.Scanner;

public class Tarea06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un número por favar :");
        int num = scanner.nextInt();
        int suma = 0;

        for (int i = 1; i <= num; i++) {
            suma += i;
        }
        System.out.println("La suma de los números desde 1 hasta " + num + " es " + suma);
    }
}
