import java.util.Scanner;
public class SumOfDigitsOfaNumber {

    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number : ");
            int num = sc.nextInt();
            int sum = 0;

            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }

            System.out.print("Sum of Digits of a Number is : " + sum);
        }
    }

