import java.util.Scanner;

class StudentMarksheet {
    String name;
    int rollNo;
    int m1, m2, m3, m4, m5;

    void input() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Student Name: ");
        name = sc.nextLine();

        System.out.print("Enter Roll Number: ");
        rollNo = sc.nextInt();

        System.out.print("Enter Marks of Subject 1: ");
        m1 = sc.nextInt();

        System.out.print("Enter Marks of Subject 2: ");
        m2 = sc.nextInt();

        System.out.print("Enter Marks of Subject 3: ");
        m3 = sc.nextInt();

        System.out.print("Enter Marks of Subject 4: ");
        m4 = sc.nextInt();

        System.out.print("Enter Marks of Subject 5: ");
        m5 = sc.nextInt();
    }

    void displayMarksheet() {
        int total = m1 + m2 + m3 + m4 + m5;
        double percentage = total / 5.0;
        String grade;

        if (percentage >= 90)
            grade = "A+";
        else if (percentage >= 80)
            grade = "A";
        else if (percentage >= 70)
            grade = "B";
        else if (percentage >= 60)
            grade = "C";
        else if (percentage >= 50)
            grade = "D";
        else
            grade = "Fail";

        System.out.println("\n------ MARKSHEET ------");
        System.out.println("Name       : " + name);
        System.out.println("Roll No.   : " + rollNo);
        System.out.println("Subject 1  : " + m1);
        System.out.println("Subject 2  : " + m2);
        System.out.println("Subject 3  : " + m3);
        System.out.println("Subject 4  : " + m4);
        System.out.println("Subject 5  : " + m5);
        System.out.println("Total      : " + total + "/500");
        System.out.println("Percentage : " + percentage + "%");
        System.out.println("Grade      : " + grade);
    }
}

public class MarksheetGeneration {
    public static void main(String[] args) {
        StudentMarksheet s = new StudentMarksheet();

        s.input();
        s.displayMarksheet();
    }
}