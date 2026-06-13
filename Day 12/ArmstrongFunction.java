import java.util.Scanner;

public class ArmstrongFunction {

    static void checkArmstrong(int n) {
        int original = n;
        int sum = 0;

        while (n > 0) {
            int digit = n % 10;
            sum = sum +(digit * digit * digit);
            n = n / 10;
        }

        if (original == sum)
            System.out.println("Armstrong Number");
        else
            System.out.println("Not an Armstrong Number");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        checkArmstrong(n);
    }
}

