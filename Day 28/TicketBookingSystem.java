import java.util.Scanner;

class Ticket {
    String name;
    int seats;
    double price;
    double total;


    void input() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Customer Name: ");
        name = sc.nextLine();

        System.out.print("Enter Number of Tickets: ");
        seats = sc.nextInt();

        System.out.print("Enter Price per Ticket: ");
        price = sc.nextDouble();

        total = seats * price;
    }


    void display() {
        System.out.println("\n----- Ticket Details -----");
        System.out.println("Customer Name : " + name);
        System.out.println("Tickets Booked: " + seats);
        System.out.println("Price per Ticket: " + price);
        System.out.println("Total Amount: " + total);
    }
}

public class TicketBookingSystem {
    public static void main(String[] args) {
        Ticket t = new Ticket();

        t.input();
        t.display();
    }
}