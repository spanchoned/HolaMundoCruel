import java.util.Scanner;

public class Tarea03 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("ingrese un num para calcular su factorial");

        int numero = scanner.nextInt();
        long factorial = 1;

        for (int i = 1; i <= numero; i++) {
            factorial *= i;
        }

        System.out.println("El factorial de " + numero + " es " + factorial);
    }

}

