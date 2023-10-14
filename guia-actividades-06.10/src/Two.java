public class Two {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int suma = 0;

        for (int i = 0; i < matrix.length; i++) {
            suma += matrix[i][i];
        }
        System.out.println("La suma de los elementos en la diagonal es: " + suma);
    }
}
