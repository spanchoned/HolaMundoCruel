import java.util.Scanner;

public class TareaFour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese una posición y luego la cantidad de traslados:");
        int posicion = scanner.nextInt();
        int traslado = scanner.nextInt();

        int[] arreglino = {13, 89, 4, 77, 19, 34, 52, 97};

        if (posicion >= 0 && posicion < arreglino.length) {
            int elementoTrasladado = arreglino[posicion];

            if (traslado >= arreglino.length) {
                System.out.println("El traslado es mayor o igual al tamaño del arreglo. No se puede realizar :(");
            } else {
                for (int i = posicion; i < posicion + traslado; i++) {
                    int siguientePosicion = (i + 1) % arreglino.length;
                    int temp = arreglino[siguientePosicion];
                    arreglino[siguientePosicion] = elementoTrasladado;
                    elementoTrasladado = temp;
                }

                System.out.println("El arreglo tras los traslados es:");
                for (int elemento : arreglino) {
                    System.out.print(elemento + " ");
                }
            }
        } else {
            System.out.println("La posición ingresada está fuera de rango.");
        }

        scanner.close();
    }
}
