import java.util.Scanner;

public class EjercicioFour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese 3 números:");

        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        int n3 = scanner.nextInt();

        final double K = 3.0;
        double media = (n1 + n2 + n3) / K;

        System.out.println("La media aritmética es " + media);
        scanner.close();
    }
}