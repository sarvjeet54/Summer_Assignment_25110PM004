import java.util.Scanner;

public class CommonCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String s1 = sc.nextLine();

        System.out.print("Enter second string: ");
        String s2 = sc.nextLine();

        boolean[] present = new boolean[256];
        boolean[] printed = new boolean[256];

        for (int i = 0; i < s1.length(); i++) {
            present[s1.charAt(i)] = true;
        }

        System.out.print("Common characters: ");

        for (int i = 0; i < s2.length(); i++) {
            char ch = s2.charAt(i);

            if (present[ch] && !printed[ch]) {
                System.out.print(ch + " ");
                printed[ch] = true;
            }
        }

        sc.close();
    }
}
