import java.util.Scanner;

public class EvenOddCount {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of Array : ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.print("Enter Array Elements : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int even = 0, odd = 0;
        for (int i = 0; i < n ; i++) {
            if(arr[i] % 2 == 0)
                even++;
            else
                odd++;

        }
        System.out.println("Even elements = " + even);
        System.out.println("Odd elements = " + odd);
    }
}
