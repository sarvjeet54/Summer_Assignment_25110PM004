import java.util.Scanner;

class Student {
    int rollNo;
    String name;
    double marks;


    Student(int rollNo, String name, double marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }


    void display() {
        System.out.println("Roll No : " + rollNo);
        System.out.println("Name    : " + name);
        System.out.println("Marks   : " + marks);
        System.out.println("----------------------");
    }
}

public class StudentRecordManagement {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Student[] students = new Student[100];
        int count = 0;
        int choice;

        do {
            System.out.println("\n===== Student Record Management System =====");
            System.out.println("1. Add Student");
            System.out.println("2. Display All Students");
            System.out.println("3. Search Student by Roll Number");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter Roll Number: ");
                    int roll = sc.nextInt();
                    sc.nextLine(); // Consume newline

                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Marks: ");
                    double marks = sc.nextDouble();

                    students[count] = new Student(roll, name, marks);
                    count++;

                    System.out.println("Student record added successfully.");
                    break;

                case 2:
                    if (count == 0) {
                        System.out.println("No records found.");
                    } else {
                        System.out.println("\nStudent Records:");
                        for (int i = 0; i < count; i++) {
                            students[i].display();
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter Roll Number to Search: ");
                    int searchRoll = sc.nextInt();

                    boolean found = false;

                    for (int i = 0; i < count; i++) {
                        if (students[i].rollNo == searchRoll) {
                            System.out.println("\nStudent Found:");
                            students[i].display();
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Student record not found.");
                    }
                    break;

                case 4:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid Choice.");
            }

        } while (choice != 4);

        sc.close();
    }
}