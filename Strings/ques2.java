import java.util.Scanner;

public class ques2 {

    public static void generateException(String input) {
        System.out.println("Generating NumberFormatException...");
        int number = Integer.parseInt(input); 
        System.out.println("Parsed Number: " + number);
    }

    public static void handleException(String input) {
        System.out.println("\nHandling NumberFormatException with try-catch...");
        try {
            int number = Integer.parseInt(input);
            System.out.println("Parsed Number: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Caught NumberFormatException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught Generic RuntimeException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a numeric string: ");
        String userInput = scanner.nextLine();

        generateException(userInput); // Will crash if input is not numeric

        handleException(userInput);
    }
}
