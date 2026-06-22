public class SymmetricMatrix {
    public static void main(String[] args) {

        int[][] arr = {
                {1, 2, 3},
                {2, 4, 5},
                {3, 5, 6}
        };

        boolean symmetric = true;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i][j] != arr[j][i]) {
                    symmetric = false;
                    break;
                }
            }
        }

        System.out.println(symmetric ?
                "Symmetric Matrix" :
                "Not a Symmetric Matrix");
    }
}
