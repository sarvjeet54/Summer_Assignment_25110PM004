import java.util.Scanner;

class Book {
    int bookId;
    String title;
    String author;
    boolean issued;


    Book(int bookId, String title, String author) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.issued = false;
    }


    void display() {
        System.out.println("Book ID : " + bookId);
        System.out.println("Title   : " + title);
        System.out.println("Author  : " + author);
        System.out.println("Status  : " + (issued ? "Issued" : "Available"));
        System.out.println("----------------------------");
    }
}

class Library2 {

    Scanner sc = new Scanner(System.in);

    Book books[] = new Book[100];
    int count = 0;


    void addBook() {

        System.out.print("Enter Book ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Book Title: ");
        String title = sc.nextLine();

        System.out.print("Enter Author Name: ");
        String author = sc.nextLine();

        books[count] = new Book(id, title, author);
        count++;

        System.out.println("Book added successfully.");
    }


    void displayBooks() {

        if (count == 0) {
            System.out.println("No books available.");
        } else {

            System.out.println("\n===== Book List =====");

            for (int i = 0; i < count; i++) {
                books[i].display();
            }
        }
    }


    void searchBook() {

        System.out.print("Enter Book ID to Search: ");
        int searchId = sc.nextInt();

        boolean found = false;

        for (int i = 0; i < count; i++) {

            if (books[i].bookId == searchId) {
                System.out.println("\nBook Found");
                books[i].display();
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Book not found.");
        }
    }


    void issueBook() {

        System.out.print("Enter Book ID to Issue: ");
        int issueId = sc.nextInt();

        boolean found = false;

        for (int i = 0; i < count; i++) {

            if (books[i].bookId == issueId) {

                if (!books[i].issued) {
                    books[i].issued = true;
                    System.out.println("Book issued successfully.");
                } else {
                    System.out.println("Book is already issued.");
                }

                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Book not found.");
        }
    }

    // Menu
    void menu() {

        int choice;

        do {

            System.out.println("\n===== Mini Library System =====");
            System.out.println("1. Add Book");
            System.out.println("2. Display Books");
            System.out.println("3. Search Book");
            System.out.println("4. Issue Book");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    addBook();
                    break;

                case 2:
                    displayBooks();
                    break;

                case 3:
                    searchBook();
                    break;

                case 4:
                    issueBook();
                    break;

                case 5:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 5);
    }
}

public class MiniLibrarySystem {

    public static void main(String[] args) {

        Library obj = new Library();
        obj.menu();

    }
}
