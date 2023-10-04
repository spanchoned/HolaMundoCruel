import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Tarea012 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese 2 equipos de futbol :D");
        String equipoA = scanner.nextLine();
        String equipoB = scanner.nextLine();

        System.out.println("Ahora ingrese sus entrenadores :P");
        String entrenadorA= scanner.nextLine();
        String entrenadorB = scanner.nextLine();

        String[] jugadoresA = {"Messi", "DiMaria", "Martinez"};
        String[] jugadoresB = {"Mbappe", "Griezman", "Mouni"};

        jugadoresA[0] = equipoA;
        jugadoresB[0] = equipoB;

        Scanner entrada=new Scanner(System.in);
        System.out.println("Ahora indique en que equipo esa interesado? \n1: \n2:");
        int option=entrada.nextInt();
        int trueOption=10;

        switch (option){
            case 1:
                System.out.println("El equipo A es: " + equipoA + " y su entrenador es " + entrenadorA + " , su equipo son " + Arrays.toString(jugadoresA));
                break;
            case 2:
                System.out.println("El equipo B es: " + equipoB + " y su entrenador es " + entrenadorB + " , su equipo son " + Arrays.toString(jugadoresB));
                break;
            default:
                System.out.println("ese equipo no exxiste pana.");
        }

    }
}
