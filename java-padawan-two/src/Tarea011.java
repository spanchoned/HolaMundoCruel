import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Tarea011 {
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

       while (true){
           if (!Objects.equals(equipoA, entrenadorB)){
               System.out.println("El equipo A es: " + equipoA + " y su entrenador es " + entrenadorA + " , su equipo son " + Arrays.toString(jugadoresA));
               System.out.println("El equipo A es: " + equipoB + " y su entrenador es " + entrenadorB + " , su equipo son " + Arrays.toString(jugadoresB));
           } else {
               System.out.println("Ese equipo no existe pana :(");
           } break;
       }
    }
}
