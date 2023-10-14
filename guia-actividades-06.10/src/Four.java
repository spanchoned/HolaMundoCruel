import java.util.Arrays;

public class Four {
    public static void main(String[] args) {
        int[] arregloOriginal = {1, 2, 2, 3, 4, 4, 5, 6, 6, 7, 8, 8, 9};
        Arrays.sort(arregloOriginal);

        int[] arregloUnico = new int[arregloOriginal.length];
        int tamañoArregloUnico = 0;

        for (int i = 0; i < arregloOriginal.length - 1; i++) {
            if (arregloOriginal[i] != arregloOriginal[i + 1]) {
                arregloUnico[tamañoArregloUnico] = arregloOriginal[i];
                tamañoArregloUnico++;
            }
        }
        arregloUnico[tamañoArregloUnico] = arregloOriginal[arregloOriginal.length - 1];
        int[] resultado = Arrays.copyOf(arregloUnico, tamañoArregloUnico + 1);
        System.out.println("Arreglo con elementos únicos: " + Arrays.toString(resultado));
    }
}
