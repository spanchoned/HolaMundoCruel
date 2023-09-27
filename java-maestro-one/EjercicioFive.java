import java.util.Scanner;

public class EjercicioFive {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("ingrese en 1ro la masa y luego la velocidad del obj");
        double m=scanner.nextDouble();
        double v=scanner.nextDouble();

        final double E=(1.0/2)*m*(v*v);
        System.out.println("La energía cinética de su obj. en movimiento es: " +  E);
        scanner.close();
    }
}
