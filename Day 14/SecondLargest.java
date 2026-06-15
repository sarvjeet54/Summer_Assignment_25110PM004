import java.util.Scanner;

public class SecondLargest {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size Of Array : ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.print("Enter Elements Of Array : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int max = Integer.MIN_VALUE;
        int smax = Integer.MIN_VALUE;

        // to calculate max
        for (int i = 0; i < n ; i++) {
            if(arr[i]>max)  max = arr[i];
        }
        // to calculate smax
        for (int i = 0; i < n ; i++) {
            if(arr[i]>smax && arr[i] != max)  smax = arr[i];
        }

        System.out.println("Largest Element is = "+max);
        System.out.println("Second Largest Element is = "+smax);

    }
}
