import java.util.Scanner;

public class RotateArrayLeft {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size Of Array : ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.print("Enter elements of Array : ");
        for (int i = 0; i < 5 ; i++) {
            arr[i] = sc.nextInt();

        }
        int d = 2;

        d = d % n;

        reverse(arr, 0, d-1);
        reverse(arr, d, n-1);
        reverse(arr, 0, n-1);

        for (int ele : arr) System.out.print(ele+ " ");


    }

    static void reverse(int[] arr, int i, int j) {
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}