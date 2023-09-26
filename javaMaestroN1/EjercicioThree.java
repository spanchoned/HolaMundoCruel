import java.util.Scanner;

public class EjercicioThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la longitud del cateto a: ");
        double a = scanner.nextDouble();

        System.out.print("Ingrese la longitud del cateto b: ");
        double b = scanner.nextDouble();

        double hipotenusa = Math.sqrt(a * a + b * b);
        System.out.println("La hipotenusa del triángulo rectángulo es: " + hipotenusa);

        scanner.close();
    }
}







