import java.util.Scanner;
public class Assigment5 {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            String[] words = new String[5];
            System.out.println("Enter 5 strings:");
            for (int i = 0; i < words.length; i++) {
                System.out.print("String " + (i + 1) + ": ");
                words[i] = input.nextLine();
            }
            System.out.println("\nStrings in UPPERCASE:");
            for (String word : words) {
                System.out.println(word.toUpperCase());
            }

        }
    }


