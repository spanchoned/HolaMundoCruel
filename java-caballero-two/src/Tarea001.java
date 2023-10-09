import java.util.Scanner;
public class Tarea001 {
    public static void main(String[] args) {
        int aleatorio=(int)(Math.random()*100);
        Scanner entrada= new Scanner(System.in);
        int numero=0;
        int intentos=0;

        while(numero!= aleatorio){
            intentos++;
            System.out.println("introduce un número porfa");
            numero=entrada.nextInt();

            if (aleatorio<numero){
                System.out.println("intenta con un número más bajo");
            } else if (aleatorio>numero) {
                System.out.println("mmm intenta con un número más alto");
            }
        }
        System.out.println("El número ingresado es correcto, lo lograste en " + intentos + " intentos");
    }
}
