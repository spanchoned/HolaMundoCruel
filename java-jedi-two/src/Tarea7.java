import java.util.Scanner;

public class Tarea7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese sus notas por favarr: ");
        int nota = scanner.nextInt();
        int nota2 = scanner.nextInt();
        int nota3 = scanner.nextInt();
        int nota4 = scanner.nextInt();
        int aprobado=(nota+nota2+nota3+nota4)/4;

        if (aprobado>6){
            System.out.println("Felicidaes aprobaste beibe :D");
        }else {
            System.out.println("Desaprobaste bb, tu nota es " + aprobado + " y no llegas :(");
        }
        scanner.close();
    }
}
