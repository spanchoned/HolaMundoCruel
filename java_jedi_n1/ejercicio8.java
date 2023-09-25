import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Ingrese su nombre");
        String nombre= scanner.nextLine();

        System.out.println("ahora ingrese su edad");
        int edad= scanner.nextInt();

        System.out.println("Mi nombre es " + nombre);
        System.out.println("Mi edad es " + edad);

    }
}