import java.util.Locale;
import java.util.Scanner;

public class Ejercicio006 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US); // Configurar el Locale a US

        double bitcoin = 0.0;
        final double TASA_CAMBIO = 50000;

        System.out.println("Ingrese sus bitcoins: ");

        while (true) {
            if (scanner.hasNextDouble()) {
                bitcoin = scanner.nextDouble();
                break;
            } else {
                System.out.println("No es valido, intente nuevamente.");
                scanner.next();
            }
        }
        double equivalenteDolares = bitcoin * TASA_CAMBIO;
        System.out.println("En dólares serian: $" + equivalenteDolares);

        scanner.close();
    }
}

