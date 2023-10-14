import java.util.Scanner;

public class TareaSix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese una palabra para verificar si es un palíndromo:");
        String palabra = scanner.next();

        if (esPalindromo(palabra)) {
            System.out.println("Es un palíndromo.");
        } else {
            System.out.println("No es un palíndromo.");
        }
    }

    public static boolean esPalindromo(String palabra) {
        String palabraSinEspacios = palabra.replaceAll("\\s+", "");
        String palabraInvertida = new StringBuilder(palabraSinEspacios).reverse().toString();

        return palabraSinEspacios.equalsIgnoreCase(palabraInvertida);
    }
}
