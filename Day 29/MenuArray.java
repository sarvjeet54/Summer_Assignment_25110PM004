import java.util.Scanner;

class ArrayOperations {
    int arr[] = new int[5];
    Scanner sc = new Scanner(System.in);

    void input() {
        System.out.println("Enter 5 elements:");
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }
    }

    void display() {
        System.out.println("Array Elements:");
        for (int i = 0; i < 5; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    void sum() {
        int s = 0;
        for (int i = 0; i < 5; i++) {
            s += arr[i];
        }
        System.out.println("Sum = " + s);
    }

    void largest() {
        int max = arr[0];
        for (int i = 1; i < 5; i++) {
            if (arr[i] > max)
                max = arr[i];
        }
        System.out.println("Largest Element = " + max);
    }
}

public class MenuArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayOperations a = new ArrayOperations();

        System.out.println("1. Input Array");
        System.out.println("2. Display Array");
        System.out.println("3. Find Sum");
        System.out.println("4. Find Largest");

        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        if (choice >= 2 && choice <= 4)
            a.input();

        switch (choice) {
            case 1:
                a.input();
                break;
            case 2:
                a.display();
                break;
            case 3:
                a.sum();
                break;
            case 4:
                a.largest();
                break;
            default:
                System.out.println("Invalid Choice");
        }
    }
}
