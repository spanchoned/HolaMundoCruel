import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        
        System.out.println("Ingrese un numero real, plis");
        double num1= scanner.nextDouble();
        
        System.out.println("otro mas plis");
        double num2= scanner.nextDouble();

        double multi= num1 * num2;

        System.out.println("ahora ingrese un numero entero");
        int num3= scanner.nextInt();

        System.out.println("uno mas");
        int num4= scanner.nextInt();

        int multi2= num3* num4;

        double suma= multi + multi2;

        System.out.println("la suma de " + multi + " y " + multi2 + " es " + suma );
        scanner.close();
    }
}
