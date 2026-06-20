import java.util.Scanner;

public class DiagonalSum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int r = sc.nextInt();

        System.out.print("Enter number of columns: ");
        int c = sc.nextInt();

        int[][] a = new int[r][c];

        System.out.println("Enter matrix elements:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        int sum = 0;

        for (int i = 0; i < r && i < c; i++) {
            sum += a[i][i];
        }

        for (int i = 0; i < r && i < c; i++) {
            sum += a[i][c - i - 1];
        }

        if (r == c && r % 2 == 1) {
            sum -= a[r / 2][r / 2];
        }

        System.out.println("Diagonal Sum = " + sum);
    }
}
