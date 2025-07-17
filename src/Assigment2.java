import java.util.Scanner;
public class Assigment2{
        public static String gradeCategory(int score) {
            if (score >= 85) {
                return "Excellent";
            } else if (score >= 70) {
                return "Good";
            } else if (score >= 50) {
                return "Average";
            } else {
                return "Fail";
            }
        }

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter your score: ");
            int score = input.nextInt();
            String category = gradeCategory(score);
            System.out.println("Your grade category is: " + category);

        }
    }


