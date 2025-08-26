import java.util.Scanner;

public class ques13 {

        public static int findLength(String text) {
        int count = 0;

        try {
            while (true) {
                text.charAt(count); 
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
                    }

        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

               System.out.print("Enter a string: ");
        String input = scanner.next();

              int customLength = findLength(input);

               int builtInLength = input.length();

               System.out.println("\nCustom Length (without length()): " + customLength);
        System.out.println("Built-in Length (with length()): " + builtInLength);
    }
}
