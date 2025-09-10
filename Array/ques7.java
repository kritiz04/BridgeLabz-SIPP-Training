import java.util.Scanner;

public class ques7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a positive number: ");
        int num = sc.nextInt();

        if (num <= 0) {
            System.out.println("Invalid input! Enter a positive number.");
            return;
        }

        String[] result = new String[num + 1]; // +1 to include 0

        for (int i = 0; i <= num; i++) {
            if (i % 3 == 0 && i % 5 == 0 && i != 0)
                result[i] = "FizzBuzz";
            else if (i % 3 == 0 && i != 0)
                result[i] = "Fizz";
            else if (i % 5 == 0 && i != 0)
                result[i] = "Buzz";
            else
                result[i] = String.valueOf(i);
        }

        for (int i = 1; i <= num; i++) {
            System.out.println("Position " + i + " = " + result[i]);
        }

        sc.close();
    }
}
