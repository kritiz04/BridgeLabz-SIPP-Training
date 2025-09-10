import java.util.Scanner;

public class ques8 {

        public static char[] getCharsManual(String text) {
        char[] result = new char[text.length()];
        for (int i = 0; i < text.length(); i++) {
            result[i] = text.charAt(i);
        }
        return result;
    }

       public static boolean compareCharArrays(char[] arr1, char[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.next();

       
        char[] manualArray = getCharsManual(input);
        char[] builtInArray = input.toCharArray();

        boolean areEqual = compareCharArrays(manualArray, builtInArray);

        
        System.out.println("\nManual character array:");
        for (char c : manualArray) {
            System.out.print(c + " ");
        }

        System.out.println("\n\nBuilt-in toCharArray() array:");
        for (char c : builtInArray) {
            System.out.print(c + " ");
        }

        System.out.println("\n\nAre both arrays equal? " + areEqual);
    }
}
