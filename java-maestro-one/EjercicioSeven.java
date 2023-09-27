import java.util.Scanner;

public class EjercicioSeven {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("ingrese plis, para calcular la fuerza centrípeda, 1ro la masa, 2do la velocidad angular y 3ro el radio de la trayectoria :) ");
        double m=scanner.nextDouble();
        double v=scanner.nextDouble();
        double r=scanner.nextDouble();

        final double F_C= m * (v*v) / r;
        System.out.println("la fuerza centrípeta necesaria para\r\n" + //
                "mantener un objeto en una trayectoria circular es " + F_C);
    }
}
