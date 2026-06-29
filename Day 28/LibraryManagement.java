import java.util.Scanner;

class Library {
    int bookId;
    String bookName;
    String author;
    boolean issued;


    void input() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Book ID: ");
        bookId = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Book Name: ");
        bookName = sc.nextLine();

        System.out.print("Enter Author Name: ");
        author = sc.nextLine();

        issued = false;
    }


    void issueBook() {
        if (!issued) {
            issued = true;
            System.out.println("Book Issued Successfully.");
        } else {
            System.out.println("Book is Already Issued.");
        }
    }


    void returnBook() {
        if (issued) {
            issued = false;
            System.out.println("Book Returned Successfully.");
        } else {
            System.out.println("Book is Already Available.");
        }
    }

    void display() {
        System.out.println("\nBook ID : " + bookId);
        System.out.println("Book Name : " + bookName);
        System.out.println("Author : " + author);

        if (issued)
            System.out.println("Status : Issued");
        else
            System.out.println("Status : Available");
    }
}

public class LibraryManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Library b = new Library();

        int choice;

        do {
            System.out.println("\n----- LIBRARY MANAGEMENT SYSTEM -----");
            System.out.println("1. Add Book");
            System.out.println("2. Issue Book");
            System.out.println("3. Return Book");
            System.out.println("4. Display Book");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    b.input();
                    break;

                case 2:
                    b.issueBook();
                    break;

                case 3:
                    b.returnBook();
                    break;

                case 4:
                    b.display();
                    break;

                case 5:
                    System.out.println("Thank You!");
                    break;

                default:
                    System.out.println("Invalid Choice.");
            }

        } while (choice != 5);
    }
}