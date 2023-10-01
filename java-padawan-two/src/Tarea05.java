public class Tarea05 {
    public static void main(String[] args) {
        System.out.println("Números enteros positivos menores que 100 divisibles por 7:");

        for (int i = 1; i < 100; i++) {
            if (i % 7 == 0) {
                System.out.println(i);
            }
        }
    }
}

