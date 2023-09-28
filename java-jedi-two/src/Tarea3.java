import java.util.Scanner;

public class Tarea3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("ingrese un número plis, para determinar si es par o no :D");

        int num=scanner.nextInt();
        int div=num%2;

        if (div==0) {
            System.out.println("Es un número par :D");
        } else {
            System.out.println("No es un número par :(");
        }
        scanner.close();

    }
}
