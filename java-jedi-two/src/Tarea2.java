import java.util.Scanner;

public class Tarea2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese su nombre para ver si está en la lista de mis amigos");
        String name = scanner.next();
        String[] amigos = {"rocio", "nati", "mariana", "moria"};

        for (String amigo : amigos) {
            if (amigo.equals(name)) {
                System.out.println("Si somos amigos :) " + amigo);
                break;
            } else {
                System.out.println("No sosmos amigos :(");
            }
        }
    }
}