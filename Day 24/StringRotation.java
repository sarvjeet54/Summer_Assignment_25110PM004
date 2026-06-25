import java.util.Scanner;

public class StringRotation {
    public static boolean isRotation(String s1, String s2) {

        if (s1.length() != s2.length()) {
            return false;
        }

        String temp = s1 + s1;

        return temp.contains(s2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s1 = sc.nextLine();
        String s2 = sc.nextLine();

        if (isRotation(s1, s2)) {
            System.out.println("Rotation");
        } else {
            System.out.println("Not Rotation");
        }

        sc.close();
    }
}
