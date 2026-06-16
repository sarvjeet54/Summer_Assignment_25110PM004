import java.util.Scanner;

public class ReverseArray {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size Of Array : ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.print("Enter Elements Of Array : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int i = 0, j = n-1;
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        System.out.print("Reversed Elements Are : ");
        for (int k = 0; k < n; k++) {
            System.out.print(arr[k]+" ");

        }

        }

    }

