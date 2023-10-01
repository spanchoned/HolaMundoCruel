import java.util.Scanner;

public class Tarea04 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Ingrese 2 numeros, para empezar");
        int num=scanner.nextInt();
        int num2=scanner.nextInt();
        int suma=0;

        for (int i = num; i <= num2; i++){
            if (i % 2 !=0) {
                suma += i;
            }
        }
        System.out.println("la suma de los numero s imparres son " + suma);
    }
}
