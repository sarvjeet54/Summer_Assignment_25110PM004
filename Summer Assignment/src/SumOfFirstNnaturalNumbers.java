import java.util.Scanner;
public class SumOfFirstNnaturalNumbers {


        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter the Number : ");
            int num = sc.nextInt();

            int sum = 0;

            for (int i = 1; i <= num; i++) {
                sum += i;
            }

            System.out.println("Sum of First N Natural Numbers is = " + sum);
        }


}
