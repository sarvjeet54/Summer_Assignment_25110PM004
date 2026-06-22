public class MatrixMultiplication {
    static void main(String[] args) {
        int[][] A = {{1, 2, 3}, {4, 5, 6}};
        int[][] B = {{7, 8}, {9, 10}, {11, 12}};
        int rowA = A.length;
        int colA = A[0].length;
        int colB = B[0].length;

        int[][] C = new int[rowA][colB];
        for (int i = 0; i < rowA; i++) {
            for (int j = 0; j < colB; j++) {
                for (int k = 0; k < colA; k++) {
                    C[i][j] += A[i][k] * B[k][j];

                }

            }

        }
        System.out.print("Product Matrix : ");
        for (int i = 0; i < rowA; i++) {
            for (int j = 0; j < colB; j++) {
                System.out.print(C[i][j] + " ");
            }
            System.out.println();


        }
    }
}

