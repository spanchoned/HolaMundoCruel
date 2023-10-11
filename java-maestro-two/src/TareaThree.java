public class TareaThree {
    public static void main(String[] args) {
        int[][] ar = {{2, 3, 7, 8, 9, 999, 0}, {14, 4, 5, 6, 7, 99, 67}};

        int totalLength = ar[0].length + ar[1].length;
        int[] arr = new int[totalLength];

        for (int i = 0; i < ar[0].length; i++) {
            arr[i] = ar[0][i];
        }
        for (int i = 0; i < ar[1].length; i++) {
            arr[i + ar[0].length] = ar[1][i];
        }
        System.out.println("El nuevo arreglo unido es:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
