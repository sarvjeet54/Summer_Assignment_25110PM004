import java.util.Scanner;

public class QuizApplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] questions = {
                "1. What is the capital of India?",
                "2. Which language is used for Android development?",
                "3. How many days are there in a week?"
        };

        String[][] options = {
                {"1. Mumbai", "2. Delhi", "3. Chennai", "4. Kolkata"},
                {"1. Python", "2. Java", "3. C", "4. HTML"},
                {"1. 5", "2. 6", "3. 7", "4. 8"}
        };

        int[] answers = {2, 2, 3};

        int score = 0;

        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);

            for (int j = 0; j < 4; j++) {
                System.out.println(options[i][j]);
            }

            System.out.print("Enter your answer (1-4): ");
            int choice = sc.nextInt();

            if (choice == answers[i]) {
                System.out.println("Correct!\n");
                score++;
            } else {
                System.out.println("Wrong!\n");
            }
        }

        System.out.println("Quiz Completed!");
        System.out.println("Your Score = " + score + "/" + questions.length);

        sc.close();
    }
}
