import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Como se llama su mascota actualmente?");
        String ultMascota = scanner.nextLine();

        System.out.println("Cual es la ultima pelicula que vio?");
        String ultPelicula = scanner.nextLine();

        System.out.println("Nombre de la próxima bebida es " + ultMascota + " " + ultPelicula);
    }
}
