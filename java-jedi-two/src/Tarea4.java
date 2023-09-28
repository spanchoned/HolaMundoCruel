import java.util.Scanner;

public class Tarea4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un num, vamos a ver si es negativo, positvo ó un buen cero");
        double num = scanner.nextDouble();

        if (num > 0) {
            System.out.println("su numero " + num + " es positivo");
        } else if (num < 0) {
            System.out.println("su numero" + num + " es negativo");
        } else if (num == 0) {
            System.out.println("su numero " + num + " es 0");
        } else {
            System.out.println("Intente nuevamente, porque no es un número XD");
        }
        scanner.close();

    }
}