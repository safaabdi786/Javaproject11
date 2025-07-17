import java.util.Scanner;
public class Assigment3 {
        public static int sumArray(int[] numbers) {
            int sum = 0;
            for (int num : numbers) {
                sum += num;
            }
            return sum;
        }

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            int[] numbers = new int[5];
            System.out.println("Enter 5 integers:");

            for (int i = 0; i < numbers.length; i++) {
                System.out.print("Number " + (i + 1) + ": ");
                numbers[i] = input.nextInt();
            }
            int total = sumArray(numbers);
            System.out.println("The sum of the numbers is: " + total);


        }
    }


