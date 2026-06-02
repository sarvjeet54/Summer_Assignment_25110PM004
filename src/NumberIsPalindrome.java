import java.util.Scanner;
public class NumberIsPalindrome {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter The Number : ");
            int num = sc.nextInt();
            int original = num;
            int reverse = 0;

            while (num > 0) {
                reverse = reverse * 10 + (num % 10);
                num /= 10;
            }

            if (original == reverse)
                System.out.println("The Number is Palindrome");
            else
                System.out.println("The Number is Not Palindrome");
        }
    }


