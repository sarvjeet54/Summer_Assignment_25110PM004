import java.util.Scanner;
public class ReverseOfANumber {

    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number : ");
            int num = sc.nextInt();
            int reverse = 0;

            while (num > 0) {
                reverse = reverse * 10 + (num % 10);
                num /= 10;
            }

            System.out.println("Reverse of a Number is : " + reverse);
        }
    }

