import java.util.Scanner;
public class Assigment4 {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            int[] numbers = new int[7];
            System.out.println("Enter 7 integers:");
            for (int i = 0; i < numbers.length; i++) {
                System.out.print("Number " + (i + 1) + ": ");
                numbers[i] = input.nextInt();
            }

            int largest = Integer.MIN_VALUE;
            int secondLargest = Integer.MIN_VALUE;
            for (int num : numbers) {
                if (num > largest) {
                    secondLargest = largest;
                    largest = num;
                } else if (num > secondLargest && num != largest) {
                    secondLargest = num;
                }
            }
            if (secondLargest == Integer.MIN_VALUE) {
                System.out.println("All numbers are the same. No second largest.");
            } else {
                System.out.println("The second largest number is: " + secondLargest);
            }


        }
    }


