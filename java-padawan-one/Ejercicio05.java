import java.util.Scanner;

public class Ejercicio05 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("ingrese por favor sus libras ");
        double libra1=scanner.nextDouble();

        System.out.println("Ingrese una mas");
        double libra2=scanner.nextDouble();

        System.out.println("y una última ");
        double libra3= scanner.nextDouble();

        final double KILOGRAMO=0.45359237;
        System.out.println("la conversion de sus libras es " + (KILOGRAMO*libra1) + " kg,  " + (KILOGRAMO*libra2) + " kg, " + (KILOGRAMO*libra3) + " kg");
        scanner.close();
    }
}