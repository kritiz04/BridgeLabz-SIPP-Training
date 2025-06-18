import java.util.Scanner;

public class ques10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Take number input
        System.out.print("Enter a number to get its multiplication table from 6 to 9: ");
        int number = sc.nextInt();

        // Step 1: Create array to store results
        int[] multiplicationResult = new int[4]; 

        // Step 2: Compute multiplication from 6 to 9 and store in array
        for (int i = 6, j = 0; i <= 9; i++, j++) {
            multiplicationResult[j] = number * i;
        }

        // Step 3: Display the result
        System.out.println("\nMultiplication Table of " + number + " from 6 to 9:");
        for (int i = 6, j = 0; i <= 9; i++, j++) {
            System.out.println(number + " * " + i + " = " + multiplicationResult[j]);
        }

        sc.close();
    }
}
