import java.util.Scanner;

public class LargestPrimeFactor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        long n = sc.nextLong();

        long largestFactor = 1;

        for (int i = 2; i <= n; i++) {
            while (n % i == 0) {
                largestFactor = i;
                n = n / i;
            }
        }

        System.out.println("Largest Prime Factor = " + largestFactor);
    }
}