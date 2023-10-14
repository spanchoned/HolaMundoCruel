import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TareaFive1 {
    public static void main(String[] args) {
        int[][] arreglito = {{5, 7, 78, 90}, {12, 56, 33, 99}};

        List<int[]> filas = Arrays.asList(arreglito);
        Collections.reverse(filas);
        System.out.println(Arrays.deepToString(arreglito));
    }
}
