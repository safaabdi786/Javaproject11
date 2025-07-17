import java.util.Scanner;
public class Assigment1 {
        public static double calculateBMI(double weight, double height) {
            return weight / (height * height);
        }

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter your weight in kilograms: ");
            double weight = input.nextDouble();
            System.out.print("Enter your height in meters: ");
            double height = input.nextDouble();
            double bmi = calculateBMI(weight, height);
            System.out.printf("Your BMI is: %.2f%n", bmi);

        }
    }


