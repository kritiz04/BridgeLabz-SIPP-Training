import java.util.Scanner;

public class ques10 {

        public static String convertToUpperCase(String text) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                result.append((char)(ch - 32)); 
            } else {
                result.append(ch); 
            }
        }

        return result.toString();
    }

        public static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length()) return false;

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String inputText = scanner.nextLine();

        String builtInUpper = inputText.toUpperCase();
        String manualUpper = convertToUpperCase(inputText);

        boolean areEqual = compareStrings(builtInUpper, manualUpper);

        
        System.out.println("\nBuilt-in toUpperCase(): " + builtInUpper);
        System.out.println("Manual conversion:     " + manualUpper);
        System.out.println("Are both conversions equal? " + areEqual);
    }
}
