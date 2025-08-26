import java.util.Scanner;

public class ques6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] heights = new double[11];
        double sum = 0.0;

        System.out.println("Enter the height of 11 football players:");
        for (int i = 0; i < heights.length; i++) {
            System.out.print("Player " + (i + 1) + " height: ");
            heights[i] = scanner.nextDouble();
            sum += heights[i];
        }

        double mean = sum / heights.length;
        System.out.println("\nMean height of the football team: " + mean);

        scanner.close();
    }
}
