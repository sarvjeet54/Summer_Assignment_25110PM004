import java.util.Scanner;

public class StringCompression {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        char[] arr = str.toCharArray();

        int count = 1;

        for (int i = 0; i < arr.length; i++) {

            if (i < arr.length - 1 && arr[i] == arr[i + 1]) {
                count++;
            } else {
                System.out.print(arr[i]);
                System.out.print(count);
                count = 1;
            }
        }

    }
}
