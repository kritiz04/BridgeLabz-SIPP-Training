import java.util.Scanner;

public class ques1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] ages = new int[10];

        for (int i = 0; i < ages.length; i++) {
            System.out.print("Enter age of student " + (i + 1) + ": ");
            ages[i] = scanner.nextInt();
        }

        System.out.println("Voting Eligibility Check ---");

        for (int i = 0; i < ages.length; i++) {
            int age = ages[i];

            if (age < 0) {
                System.out.println("The student with the age " + age + " has an invalid age.");
            } else if (age >= 18) {
                System.out.println("The student with the age " + age + " can vote.");
            } else {
                System.out.println("The student with the age " + age + " cannot vote.");
            }
        }

        scanner.close();
    }
}

  