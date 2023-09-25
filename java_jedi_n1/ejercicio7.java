import java.util.Scanner;

public class ejercicio7 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        
        System.out.println("Ingrese un numero real, plis");
        double num1= scanner.nextDouble();
        
        System.out.println("otro mas plis");
        double num2= scanner.nextDouble();

        double Multi= num1 * num2;

        System.out.println("ahora ingrese un numero entero");
        int num3= scanner.nextInt();

        System.out.println("uno mas");
        int num4= scanner.nextInt();

        int Multi2= num3* num4;

        double suma= Multi + Multi2;

        System.out.println("la suma de " + Multi + " y " + Multi2 + " es " + suma );
    }
}
