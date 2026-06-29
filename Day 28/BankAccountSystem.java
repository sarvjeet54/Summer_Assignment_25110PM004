import java.util.Scanner;

class BankAccount {
    int accountNumber;
    String accountHolder;
    double balance;


    void createAccount() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Account Number: ");
        accountNumber = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Account Holder Name: ");
        accountHolder = sc.nextLine();

        System.out.print("Enter Initial Balance: ");
        balance = sc.nextDouble();
    }


    void deposit() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Deposit Amount: ");
        double amount = sc.nextDouble();

        balance = balance + amount;
        System.out.println("Deposit Successful.");
    }


    void withdraw() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Withdraw Amount: ");
        double amount = sc.nextDouble();

        if (amount <= balance) {
            balance = balance - amount;
            System.out.println("Withdrawal Successful.");
        } else {
            System.out.println("Insufficient Balance.");
        }
    }


    void display() {
        System.out.println("\n----- Account Details -----");
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Account Holder : " + accountHolder);
        System.out.println("Balance        : " + balance);
    }
}

public class BankAccountSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount b = new BankAccount();

        int choice;

        do {
            System.out.println("\n===== BANK ACCOUNT SYSTEM =====");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Display Account");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    b.createAccount();
                    break;

                case 2:
                    b.deposit();
                    break;

                case 3:
                    b.withdraw();
                    break;

                case 4:
                    b.display();
                    break;

                case 5:
                    System.out.println("Thank You!");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 5);
    }
}