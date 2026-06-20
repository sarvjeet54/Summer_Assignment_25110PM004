public class TransposeMatrix {
    static void main(String[] args) {
        int[][] arr = {{2, 8, 3, 4}, {7, 2, 1, 6}, {5, 5, 4, 1}, {3, 1, 8, 2}};
        print(arr);
        int row = arr.length, col = arr[0].length;
        int[][] brr = new int[col][row];              // for sq matrix no need of new matrix
        for (int i = 0; i < brr.length; i++) {
            for (int j = 0; j < brr[0].length; j++) {
                brr[i][j] = arr[j][i];
            }
        }
        System.out.println();
        print(brr);
    }

    public static void print(int[][] arr) {
        for (int[] a : arr) {
            for (int ele : a) {
                System.out.print(ele + " ");
            }
            System.out.println();

        }
    }
}
