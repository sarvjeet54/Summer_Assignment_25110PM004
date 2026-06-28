import java.util.Scanner;

class Employee {
    int id;
    String name;
    double salary;


    void input() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee ID: ");
        id = sc.nextInt();
        sc.nextLine(); // Consume newline

        System.out.print("Enter Employee Name: ");
        name = sc.nextLine();

        System.out.print("Enter Employee Salary: ");
        salary = sc.nextDouble();
    }


    void display() {
        System.out.println("\nEmployee Details");
        System.out.println("Employee ID : " + id);
        System.out.println("Employee Name : " + name);
        System.out.println("Employee Salary : " + salary);
    }
}

public class EmployeeManagementSystem {
    public static void main(String[] args) {

        Employee emp = new Employee();

        emp.input();
        emp.display();
    }
}
