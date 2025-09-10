import java.util.Scanner;

public class ques6{

    public static String createSubstringUsingCharAt(String text, int start, int end) {
        StringBuilder result = new StringBuilder();
        for (int i = start; i < end; i++) {
            result.append(text.charAt(i));
        }
        return result.toString();
    }

      public static boolean compareStringsUsingCharAt(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

               System.out.print("Enter a string: ");
        String inputText = scanner.next();

        System.out.print("Enter start index: ");
        int start = scanner.nextInt();

        System.out.print("Enter end index: ");
        int end = scanner.nextInt();


        String builtInSubstring = inputText.substring(start, end);


        String manualSubstring = createSubstringUsingCharAt(inputText, start, end);

        boolean isSame = compareStringsUsingCharAt(builtInSubstring, manualSubstring);


        System.out.println("\nBuilt-in substring: " + builtInSubstring);
        System.out.println("Manual substring:   " + manualSubstring);
        System.out.println("Are both substrings equal? " + isSame);
    }
}
