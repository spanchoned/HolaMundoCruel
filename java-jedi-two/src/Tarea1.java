import static java.lang.System.*;
public class Tarea1 {
    public static void main(String[] args) {
        int altura = 6;

        for (int i = 1; i <= altura; i++) {
            for (int j = 1; j <= i; j++) {
                out.print("   *");
            }
            out.println();
        }
    }
}
