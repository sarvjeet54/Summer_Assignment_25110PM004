import java.util.Scanner;

public class ArrayInputDisplay {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of Array : ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.print("Enter Array Elements : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Array Elements are : ");
        for (int i = 0; i < n ; i++) {
            System.out.print(arr[i]+" ");

        }
    }
}
