import java.util.Scanner;

public class gradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int physics, chemistry, maths;

        // Input marks
        System.out.print("Enter marks in Physics: ");
        physics = sc.nextInt();
        System.out.print("Enter marks in Chemistry: ");
        chemistry = sc.nextInt();
        System.out.print("Enter marks in Maths: ");
        maths = sc.nextInt();

        // Calculate total and percentage
        int total = physics + chemistry + maths;
        double percentage = total / 3.0;

        // Display grade
        System.out.println("Percentage: " + percentage + "%");

        if (percentage >= 80) {
            System.out.println("Grade: A (Level 4, above agency-normalized standards)");
        } else if (percentage >= 70) {
            System.out.println("Grade: B (Level 3, at agency-normalized standards)");
        } else if (percentage >= 60) {
            System.out.println("Grade: C (Level 2, below but approaching agency-normalized standards)");
        } else if (percentage >= 50) {
            System.out.println("Grade: D (Level 1, well below agency-normalized standards)");
        } else if (percentage >= 40) {
            System.out.println("Grade: E (Level 1-, too below agency-normalized standards)");
        } else {
            System.out.println("Grade: R (Remedial standards)");
        }
        sc.close();
    }
}
