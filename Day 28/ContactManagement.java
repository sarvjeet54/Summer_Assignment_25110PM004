import java.util.Scanner;

class Contact {
    String name;
    String phone;

    void input(Scanner sc) {
        System.out.print("Enter Name: ");
        name = sc.nextLine();

        System.out.print("Enter Phone Number: ");
        phone = sc.nextLine();
    }

    void display() {
        System.out.println("Name : " + name);
        System.out.println("Phone: " + phone);
    }
}

public class ContactManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Contact[] contacts = new Contact[5];

        System.out.print("How many contacts do you want to add? ");
        int n = sc.nextInt();
        sc.nextLine();


        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter Details of Contact " + (i + 1));
            contacts[i] = new Contact();
            contacts[i].input(sc);
        }
        
        System.out.println("\n----- Contact List -----");
        for (int i = 0; i < n; i++) {
            System.out.println("\nContact " + (i + 1));
            contacts[i].display();
        }
    }
}