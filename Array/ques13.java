import java.util.Scanner;

public class ques13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int num = sc.nextInt();

        int[][] marks = new int[num][3];     
        double[] percentage = new double[num];
        char[] grade = new char[num];

        for (int i = 0; i < num; i++) {
            System.out.println("\nEnter marks for student " + (i + 1) + ":");

            for (int j = 0; j < 3; j++) {
                String subject = (j == 0) ? "Physics" : (j == 1) ? "Chemistry" : "Maths";

                int mark;
                do {
                    System.out.print(subject + " marks (0-100): ");
                    mark = sc.nextInt();
                    if (mark < 0 || mark > 100) {
                        System.out.println("Invalid! Please enter a value between 0 and 100.");
                    }
                } while (mark < 0 || mark > 100);

                marks[i][j] = mark;
            }

            int total = marks[i][0] + marks[i][1] + marks[i][2];
            percentage[i] = total / 3.0;

            if (percentage[i] >= 80)
                grade[i] = 'A';
            else if (percentage[i] >= 70)
                grade[i] = 'B';
            else if (percentage[i] >= 60)
                grade[i] = 'C';
            else if (percentage[i] >= 50)
                grade[i] = 'D';
            else if (percentage[i] >= 40)
                grade[i] = 'E';
            else
                grade[i] = 'R';
        }

        System.out.println("\nResults:");
        System.out.println("--------------------------------------------------------");
        System.out.println("Student | Physics | Chemistry | Maths | %     | Grade");
        System.out.println("--------------------------------------------------------");

        for (int i = 0; i < num; i++) {
            System.out.printf("   %d    |   %3d   |    %3d    |  %3d  | %.2f |   %c\n",
                    (i + 1), marks[i][0], marks[i][1], marks[i][2], percentage[i], grade[i]);
        }

        sc.close();
    }
}
