import java.util.Scanner;

class Inventory {
    int id, quantity;
    String name;

    void input() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Product ID: ");
        id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Product Name: ");
        name = sc.nextLine();

        System.out.print("Enter Quantity: ");
        quantity = sc.nextInt();
    }

    void display() {
        System.out.println("\n--- Product Details ---");
        System.out.println("Product ID: " + id);
        System.out.println("Product Name: " + name);
        System.out.println("Quantity: " + quantity);
    }
}

public class InventoryManagement {
    public static void main(String[] args) {
        Inventory p = new Inventory();

        p.input();
        p.display();
    }
}
