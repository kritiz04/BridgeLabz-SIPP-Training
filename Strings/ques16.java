import java.util.Scanner;

public class ques16 {

    
    public static String[] splitTextIntoWords(String text) {
        String[] words = new String[100];  // assuming max 100 words
        String word = "";
        int wordCount = 0;

        for (int i = 0; ; i++) {
            char ch;
            try {
                ch = text.charAt(i);
            } catch (StringIndexOutOfBoundsException e) {
                if (!word.equals("")) {
                    words[wordCount++] = word;
                }
                break;
            }

            if (ch == ' ') {
                if (!word.equals("")) {
                    words[wordCount++] = word;
                    word = "";
                }
            } else {
                word += ch;
            }
        }

        String[] finalWords = new String[wordCount];
        for (int i = 0; i < wordCount; i++) {
            finalWords[i] = words[i];
        }

        return finalWords;
    }

       public static int findLength(String word) {
        int count = 0;
        try {
            while (true) {
                word.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            return count;
        }
    }

        public static String[][] getWordLengthArray(String[] words) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(findLength(words[i]));
        }
        return result;
    }

        public static int[] findShortestAndLongest(String[][] wordLengthArray) {
        int minIndex = 0, maxIndex = 0;
        int minLength = Integer.parseInt(wordLengthArray[0][1]);
        int maxLength = minLength;

        for (int i = 1; i < wordLengthArray.length; i++) {
            int len = Integer.parseInt(wordLengthArray[i][1]);
            if (len < minLength) {
                minLength = len;
                minIndex = i;
            }
            if (len > maxLength) {
                maxLength = len;
                maxIndex = i;
            }
        }

        return new int[]{minIndex, maxIndex};
    }

        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a text: ");
        String input = scanner.nextLine();

        String[] words = splitTextIntoWords(input);
        String[][] wordLengthArray = getWordLengthArray(words);
        int[] indexes = findShortestAndLongest(wordLengthArray);

        System.out.println("\nWord\t\tLength");
        System.out.println("----------------------");
        for (String[] pair : wordLengthArray) {
            System.out.println(pair[0] + "\t\t" + pair[1]);
        }

        System.out.println("\nShortest Word: " + wordLengthArray[indexes[0]][0]);
        System.out.println("Longest Word: " + wordLengthArray[indexes[1]][0]);
    }
}
