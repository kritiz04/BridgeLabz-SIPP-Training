import java.util.Scanner;

public class ques1 {

    public static void generateException(String input) {
        System.out.println("Generating exception...");
        char ch = input.charAt(input.length()); 
        System.out.println("Character at index " + input.length() + ": " + ch);
    }

    public static void handleException(String input) {
        System.out.println("\nHandling exception using try-catch...");
        try {
            char ch = input.charAt(input.length()); 
            System.out.println("Character at index " + input.length() + ": " + ch);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught Exception: " + e);
            System.out.println("Message: Attempted to access index outside the string's range.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String userInput = scanner.nextLine();


        generateException(userInput); 

        handleException(userInput);
    }
}
