import java.util.Scanner; //se importa la clase scanner para darle entrada al usuario

public class Ejercicio2 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in); // se objeto Scanner para leer la entrada del usuario

        System.out.print("Ingrese el primer número entero: ");
        int num1 = scanner.nextInt(); //en el entero ingresado se aloja en la variable

        System.out.print("Ingrese el segundo número entero: ");
        int num2 = scanner.nextInt();

        int suma = num1 + num2;

        String mensaje = (suma % 2 == 0) ? "par" : "impar";

        System.out.println("El resultado es " + suma + " y es un número " + mensaje);

        scanner.close();
    }
}
