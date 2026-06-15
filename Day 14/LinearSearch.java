import java.util.Scanner;

public class LinearSearch {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size Of Array : ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.print("Enter Elements Of Array : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int target = 5;
        int found = -1;
        for (int i = 0; i < n ; i++) {
            if(arr[i] == target){
                found = i;
                break;
            }
        }
        if(found!=-1) System.out.println("Target exists in array at position = "+found);
        else System.out.println("Target Missing in Array");

    }
}
