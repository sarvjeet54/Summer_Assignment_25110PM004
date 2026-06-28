import java.util.Scanner;

class EmployeeSalary {
    int id;
    String name;
    double basicSalary;
    double hra;
    double da;
    double totalSalary;


    void input() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee ID: ");
        id = sc.nextInt();
        sc.nextLine(); // Consume newline

        System.out.print("Enter Employee Name: ");
        name = sc.nextLine();

        System.out.print("Enter Basic Salary: ");
        basicSalary = sc.nextDouble();
    }


    void calculateSalary() {
        hra = basicSalary * 0.20; // 20% HRA
        da = basicSalary * 0.10;  // 10% DA
        totalSalary = basicSalary + hra + da;
    }


    void display() {
        System.out.println("\n----- Employee Salary Details -----");
        System.out.println("Employee ID   : " + id);
        System.out.println("Employee Name : " + name);
        System.out.println("Basic Salary  : " + basicSalary);
        System.out.println("HRA           : " + hra);
        System.out.println("DA            : " + da);
        System.out.println("Total Salary  : " + totalSalary);
    }
}

public class SalaryManagementSystem {
    public static void main(String[] args) {

        EmployeeSalary emp = new EmployeeSalary();

        emp.input();
        emp.calculateSalary();
        emp.display();
    }
}