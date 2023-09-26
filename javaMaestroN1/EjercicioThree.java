import java.util.Scanner;

public class EjercicioThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la longitud del cateto a: ");
        double a = scanner.nextDouble();

        System.out.print("Ingrese la longitud del cateto b: ");
        double b = scanner.nextDouble();

        double hipotenusa = Math.sqrt(a * a + b * b);
        System.out.println("La hipotenusa del triángulo rectángulo es: " + hipotenusa);

        scanner.close();
    }
}











/*La hipotenusa de un triángulo rectángulo se calcula utilizando el teorema de Pitágoras. En un triángulo rectángulo,
tienes dos catetos (los lados que forman el ángulo recto) y una hipotenusa (el lado opuesto al ángulo recto).
El teorema de Pitágoras establece lo siguiente:
En un triángulo rectángulo, la suma de los cuadrados de los dos catetos es igual al cuadrado de la hipotenusa.
Matemáticamente, esto se expresa de la siguiente manera:

a^2 + b^2 = c^2

Donde:
"a" y "b" son las longitudes de los catetos.
"c" es la longitud de la hipotenusa.
Para calcular la hipotenusa, simplemente toma la raíz cuadrada de la suma de los cuadrados de los catetos:
c = √(a^2 + b^2)*/