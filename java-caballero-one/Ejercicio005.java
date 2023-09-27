import java.util.Scanner;
public class Ejercicio005 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double pesos;
        double euros;
        final double TASA_CAMBIO = 20;

        System.out.println("Ingrese la cantidad de pesitos: ");
        pesos = scanner.nextDouble();

        euros = pesos / TASA_CAMBIO;
        System.out.println("Actualmente tiene tantos euros: " + euros);
    }

}
