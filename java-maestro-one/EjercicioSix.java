import java.util.Scanner;

public class EjercicioSix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la velocidad inicial (en m/s) y el tiempo transcurrido (en segundos):");

        double v_i = scanner.nextDouble();
        double t = scanner.nextDouble();

        final double G = 9.81;
        double v_f = v_i + (G * t);
        System.out.println("La velocidad final del objeto en caída libre es " + v_f + " m/s.");
        scanner.close();
    }
}
