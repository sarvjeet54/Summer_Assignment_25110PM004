import java.util.Scanner;

public class FunctionPrime{

        static void checkPrime(int n) {
            if (n <= 1) {
                System.out.println("Not a Prime Number");
                return;
            }

            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    System.out.println("Not a Prime Number");
                    return;
                }
            }

            System.out.println("Prime Number");
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter a number: ");
            int n = sc.nextInt();

            checkPrime(n);
        }
    }

