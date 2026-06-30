import java.util.Scanner;

class Calculator {
    int a, b;

    void input() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        a = sc.nextInt();

        System.out.print("Enter second number: ");
        b = sc.nextInt();
    }

    void add() {
        System.out.println("Addition = " + (a + b));
    }

    void subtract() {
        System.out.println("Subtraction = " + (a - b));
    }

    void multiply() {
        System.out.println("Multiplication = " + (a * b));
    }

    void divide() {
        if (b != 0)
            System.out.println("Division = " + (a / b));
        else
            System.out.println("Cannot divide by zero");
    }
}

public class MenuCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator c = new Calculator();

        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");

        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        c.input();

        switch (choice) {
            case 1:
                c.add();
                break;
            case 2:
                c.subtract();
                break;
            case 3:
                c.multiply();
                break;
            case 4:
                c.divide();
                break;
            default:
                System.out.println("Invalid Choice");
        }
    }
}
