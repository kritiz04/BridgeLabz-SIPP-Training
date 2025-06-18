import java.util.Scanner;

public class ques9 {

    
    public static void generateException(String[] names) {
        System.out.println("\nGenerating ArrayIndexOutOfBoundsException...");
        System.out.println("Accessing index " + names.length + ": " + names[names.length]); 
    }

   
    public static void handleException(String[] names) {
        System.out.println("\nHandling ArrayIndexOutOfBoundsException with try-catch...");
        try {
            System.out.println("Accessing index " + names.length + ": " + names[names.length]); 
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      
        System.out.print("Enter number of names: ");
        int size = scanner.nextInt();
        String[] names = new String[size];

        System.out.println("Enter " + size + " names:");
        for (int i = 0; i < size; i++) {
            names[i] = scanner.next();
        }

        generateException(names); 
        handleException(names);
    }
}
