import java.util.Arrays;

public class Three {
    public static void main(String[] args) {
        int[] myArray = {84, 85, 86, 87, 85, 90, 85, 83, 23, 45, 84, 1, 2, 0};

        int primer = Integer.MIN_VALUE;
        int secon = Integer.MIN_VALUE;

        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] > primer) {
                secon = primer;
                primer = myArray[i];
            } else if (myArray[i] > secon && myArray[i] != primer) {
                secon = myArray[i];
            }
        }
        int[] result = {primer, secon};
        System.out.println("Los dos valores más grandes son: " + Arrays.toString(result));
    }
}
