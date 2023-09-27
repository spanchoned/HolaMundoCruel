import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer número entero: ");
        int num1 = scanner.nextInt();

        System.out.print("Ingrese el segundo número entero: ");
        int num2 = scanner.nextInt();

        int suma = num1 + num2;

        String mensaje = (suma % 2 == 0) ? "par" : "impar";

        System.out.println("El resultado es " + suma + " y es un número " + mensaje);

        scanner.close();
    }
}
