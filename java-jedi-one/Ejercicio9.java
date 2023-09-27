import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("ingrese un numero por favor");
        
        int num=scanner.nextInt();
        int cuadrado= num * num;
        int cubo= num * num * num;

        System.out.println("el cuadrado del numero es " + cuadrado);
        System.out.println("el cubo del numero es " + cubo);
        scanner.close();

}
}
