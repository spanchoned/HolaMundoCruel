import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        
        System.out.println("ingrese un numero por favor");
        int num1=scanner.nextInt();

        System.out.println("otro mas por favor");
        int num2=scanner.nextInt();

        int multi= num1*num2/1;
        int multi2= num1*num2/2;
        int multi3= num1*num2/3;
        int multi4= num1*num2/4;
        int multi5= num1*num2/5;
        int multi6= num1*num2/6;
        int multi7= num1*num2/7;
        int multi8= num1*num2/8;
        int multi9= num1*num2/9;
        int multi10= num1*num2/10;
        int multi11= num1*num2/11;
        int multi12= num1*num2/12;
        int multi13= num1*num2/13;
        int multi14= num1*num2/14;
        int multi15= num1*num2/15;

        System.out.println("las multiplicaciones son " + multi + " " + multi2 + " " + multi3 + " " + multi4 + " " + multi5 + " " + multi6 + " " + multi7
        + " " + multi8 + " " + multi9 + " " + multi10 + " " + multi11 + " " + multi12 + " " + multi13 + " " + multi14 + " " + multi15);
        scanner.close();
    }
}
