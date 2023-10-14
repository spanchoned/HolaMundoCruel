import java.util.Arrays;

public class One {
    public static void main(String[] args) {
        int [] uno={1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        if (uno.length < 3) {
            System.out.println("El array original es demasiado corto para eliminar elementos del medio.");

        } else {int[] middleElements = Arrays.copyOfRange(uno, 1, uno.length - 1);

            for (int element : middleElements) {
                System.out.print(element + " ");
            }
        }
    }
}
