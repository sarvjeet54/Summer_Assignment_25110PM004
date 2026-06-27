import java.util.Scanner;

public class ATMSimulation {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int pin = 1234;
        double balance = 10000;
        int enteredPin;

        System.out.print("Enter ATM PIN: ");
        enteredPin = sc.nextInt();

        if (enteredPin == pin) {

            int choice;

            do {
                System.out.println("\n===== ATM MENU =====");
                System.out.println("1. Check Balance");
                System.out.println("2. Deposit Money");
                System.out.println("3. Withdraw Money");
                System.out.println("4. Exit");
                System.out.print("Enter your choice: ");
                choice = sc.nextInt();

                if (choice == 1) {
                    System.out.println("Current Balance = ₹" + balance);
                }

                else if (choice == 2) {
                    System.out.print("Enter amount to deposit: ");
                    double amount = sc.nextDouble();
                    balance = balance + amount;
                    System.out.println("Amount Deposited Successfully.");
                    System.out.println("Updated Balance = ₹" + balance);
                }

                else if (choice == 3) {
                    System.out.print("Enter amount to withdraw: ");
                    double amount = sc.nextDouble();

                    if (amount <= balance) {
                        balance = balance - amount;
                        System.out.println("Withdrawal Successful.");
                        System.out.println("Remaining Balance = ₹" + balance);
                    } else {
                        System.out.println("Insufficient Balance.");
                    }
                }

                else if (choice == 4) {
                    System.out.println("Thank you for using ATM.");
                }

                else {
                    System.out.println("Invalid Choice.");
                }

            } while (choice != 4);

        } else {
            System.out.println("Incorrect PIN.");
        }

        sc.close();
    }
}
