import java.util.Scanner;

public class Tarea010 {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        System.out.println("elige una opción: \n1: \n2: \n3: \n4:" );
        int option=entrada.nextInt();
        int trueOption=10;

        while (true){
            if (option==trueOption){
                System.out.println("es correcto");
            } else {
                System.out.println("Usted eligio la opción " + option + " es incorrecta se detiene el proceso :S");
            } break;
        }

    }
}
