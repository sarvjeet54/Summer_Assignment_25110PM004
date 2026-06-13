import java.util.Scanner;

public class PalindromeFunction {

    static void checkPalindrome(int n) {
        int original = n;
        int rev = 0;

        while (n > 0) {
            rev = rev * 10 + n % 10;
            n = n / 10;
        }

        if (original == rev)
            System.out.println("Palindrome Number");
        else
            System.out.println("Not a Palindrome Number");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        checkPalindrome(n);
    }
}
