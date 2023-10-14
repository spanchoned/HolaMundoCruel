public class TareaFive {
    public static void main(String[] args) {
        int[][] arreglito = {{5, 7, 78, 90}, {12, 56, 33, 99}};
        int[][] invertida = invertir(arreglito);
        for (int i = 0; i < invertida.length; i++) {
            for (int j = 0; j < invertida[0].length; j++) {
                System.out.print(invertida[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] invertir(int[][] matriz) {
        int filas = matriz.length;
        int columnas = matriz[0].length;
        int[][] matrizInvertida = new int[columnas][filas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matrizInvertida[j][i] = matriz[i][j];
            }
        }

        return matrizInvertida;
    }
}
