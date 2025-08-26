import java.util.Scanner;

public class ques14 {

    public static String getCharType(char ch) {
      
        if (ch >= 'A' && ch <= 'Z') {
            ch = (char)(ch + 32);
        }

                if (ch >= 'a' && ch <= 'z') {
            // Check for vowel
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                return "Vowel";
            } else {
                return "Consonant";
            }
        }

        return "Not a Letter";
    }

   
    public static String[][] analyzeString(String text) {
        int len = text.length();
        String[][] result = new String[len][2];

        for (int i = 0; i < len; i++) {
            char ch = text.charAt(i);
            result[i][0] = String.valueOf(ch);
            result[i][1] = getCharType(ch);
        }

        return result;
    }

       public static void displayResult(String[][] data) {
        System.out.printf("%-10s | %-15s\n", "Character", "Type");
        System.out.println("-----------------------------");

        for (int i = 0; i < data.length; i++) {
            System.out.printf("%-10s | %-15s\n", data[i][0], data[i][1]);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        
        String[][] result = analyzeString(input);

               displayResult(result);
    }
}
