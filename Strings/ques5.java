import java.util.Scanner;

public class ques5 {

    public static void generateException(String input) {
        System.out.println("Generating IllegalArgumentException...");
       
        String result = input.substring(5, 2);     }


    public static void handleException(String input) {
        System.out.println("\nHandling IllegalArgumentException with try-catch...");
        try {
            String result = input.substring(5, 2); 
            System.out.println("Substring result: " + result);
        } catch (IllegalArgumentException e) {
            System.out.println("Caught IllegalArgumentException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String userInput = scanner.nextLine();

              generateException(userInput); // Comment this line to see handled output only

             handleException(userInput);
    }
}
