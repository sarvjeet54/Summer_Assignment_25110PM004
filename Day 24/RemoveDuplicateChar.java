import java.util.Scanner;

public class RemoveDuplicateChar {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        int[] freq = new int[256];

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (freq[ch] == 0) {
                System.out.print(ch);
                freq[ch] = 1;
            }
        }

    }
}
