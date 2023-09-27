import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el primer número:");
        int num1 = scanner.nextInt();
        
        System.out.println("Ingrese el segundo número:");
        int num2 = scanner.nextInt();

        int resultado = num1 % num2;

        if (resultado == 0) {
            System.out.println("El primer número es divisible por el segundo número. El resultado es " + (num1 / num2));
        } else {
            System.out.println("El primer número no es divisible, el resultado es " + (num1 / num2));
        }
        scanner.close();
    }
}
