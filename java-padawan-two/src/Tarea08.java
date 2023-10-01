import java.util.Scanner;

public class Tarea08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese sus amigos :D");
        int cantidadAmigos = scanner.nextInt();
        String[] nombres = new String[cantidadAmigos];
        int[] edades = new int[cantidadAmigos];

        for (int i = 0; i < cantidadAmigos; i++) {
            System.out.println("Cómo se llama su pana? " + (i + 1) + ":");
            nombres[i] = scanner.next();
            System.out.println("Y su edad? " + nombres[i] + ":");
            edades[i] = scanner.nextInt();
        }

        for (int i = 0; i < cantidadAmigos; i++) {
            if (edades[i] >= 18) {
                System.out.println("Es mayor dd edad: " + nombres[i]);
            } else {
                System.out.println("Es menor pa: " + nombres[i] + ". No se muestra por pantalla.");
            }
        }
    }
}
