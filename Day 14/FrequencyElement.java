import java.util.Scanner;

public class FrequencyElement {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size Of Array : ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.print("Enter Elements Of Array : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter element to find frequency : ");
        int x = sc.nextInt();
        int count = 0;

        for (int i = 0; i < n; i++) {
            if(arr[i] == x){
                count++;
            }
            
        }
        System.out.print("Frequency of "+ x + " = " + count);
    }
}
