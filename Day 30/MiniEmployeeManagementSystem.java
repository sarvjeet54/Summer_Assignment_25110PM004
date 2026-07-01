import java.util.Scanner;

class Employee2 {
    int empId;
    String name;
    double salary;


    Employee2(int empId, String name, double salary) {
        this.empId = empId;
        this.name = name;
        this.salary = salary;
    }


    void display() {
        System.out.println("Employee ID : " + empId);
        System.out.println("Name        : " + name);
        System.out.println("Salary      : " + salary);
        System.out.println("----------------------------");
    }
}

class EmployeeManagement {

    Scanner sc = new Scanner(System.in);

    Employee2 employees[] = new Employee2[100];
    int count = 0;


    void addEmployee() {

        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Employee Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Salary: ");
        double salary = sc.nextDouble();

        employees[count] = new Employee2(id, name, salary);
        count++;

        System.out.println("Employee added successfully.");
    }


    void displayEmployees() {

        if (count == 0) {
            System.out.println("No employee records found.");
        } else {

            System.out.println("\n===== Employee Records =====");

            for (int i = 0; i < count; i++) {
                employees[i].display();
            }
        }
    }


    void searchEmployee() {

        System.out.print("Enter Employee ID to Search: ");
        int searchId = sc.nextInt();

        boolean found = false;

        for (int i = 0; i < count; i++) {

            if (employees[i].empId == searchId) {

                System.out.println("\nEmployee Found");
                employees[i].display();
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Employee not found.");
        }
    }


    void menu() {

        int choice;

        do {

            System.out.println("\n===== Mini Employee Management System =====");
            System.out.println("1. Add Employee");
            System.out.println("2. Display Employees");
            System.out.println("3. Search Employee");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    addEmployee();
                    break;

                case 2:
                    displayEmployees();
                    break;

                case 3:
                    searchEmployee();
                    break;

                case 4:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 4);
    }
}

public class MiniEmployeeManagementSystem {

    public static void main(String[] args) {

        EmployeeManagement obj = new EmployeeManagement();
        obj.menu();

    }
}
