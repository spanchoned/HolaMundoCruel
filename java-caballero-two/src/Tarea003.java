import java.util.Scanner;

public class Tarea003 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de amigos: ");
        int cantidadAmigos = scanner.nextInt();

        String[] nombres = new String[cantidadAmigos];
        int[] edades = new int[cantidadAmigos];
        int edadMayor = Integer.MIN_VALUE;
        String nombreAmigoMayor = "";

        for (int i = 0; i < cantidadAmigos; i++) {
            scanner.nextLine();
            System.out.print("Nombre del amigo #" + (i + 1) + ": ");
            nombres[i] = scanner.nextLine();

            System.out.print("Edad del amigo #" + (i + 1) + ": ");
            edades[i] = scanner.nextInt();

            if (edades[i] < 18) {
                System.out.println("Lo siento, " + nombres[i] + " eres menor de edad, no puedes estar en pantalla");
            } else {
                System.out.println("Nombre: " + nombres[i]);
                System.out.println("Edad: " + edades[i]);

                if (edades[i] > edadMayor) {
                    edadMayor = edades[i];
                    nombreAmigoMayor = nombres[i];
                }
            }
        }

        if (!nombreAmigoMayor.isEmpty()) {
            System.out.println("\nEl amigo de mayor edad es: " + nombreAmigoMayor);
            System.out.println("Edad: " + edadMayor);
        } else {
            System.out.println("\nNo se ingresaron amigos mayores de edad.");
        }

        scanner.close();
    }
}

