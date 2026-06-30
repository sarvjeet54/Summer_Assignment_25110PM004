import java.util.Scanner;

class StringOperations {
    String str;
    Scanner sc = new Scanner(System.in);

    void input() {
        System.out.print("Enter a string: ");
        str = sc.nextLine();
    }

    void length() {
        System.out.println("Length = " + str.length());
    }

    void uppercase() {
        System.out.println("Uppercase = " + str.toUpperCase());
    }

    void lowercase() {
        System.out.println("Lowercase = " + str.toLowerCase());
    }

    void reverse() {
        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }
        System.out.println("Reverse = " + rev);
    }
}

public class MenuString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringOperations s = new StringOperations();

        System.out.println("1. Find Length");
        System.out.println("2. Convert to Uppercase");
        System.out.println("3. Convert to Lowercase");
        System.out.println("4. Reverse String");

        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();
        sc.nextLine();   // Consume newline

        s.input();

        switch (choice) {
            case 1:
                s.length();
                break;
            case 2:
                s.uppercase();
                break;
            case 3:
                s.lowercase();
                break;
            case 4:
                s.reverse();
                break;
            default:
                System.out.println("Invalid Choice");
        }
    }
}
