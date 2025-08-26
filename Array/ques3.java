import java.util.Scanner;

public class ques3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive number: ");
        int num = sc.nextInt();

        if (num <= 0) {
            System.out.println("Invalid input.");
            return;
        }

        int maxSize = 10, index = 0;
        int[] factors = new int[maxSize];

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                if (index == maxSize) {
                    maxSize *= 2;
                    int[] temp = new int[maxSize];
                    System.arraycopy(factors, 0, temp, 0, index);
                    factors = temp;
                }
                factors[index++] = i;
            }
        }

        System.out.println("Factors of " + num + ":");
        for (int i = 0; i < index; i++) System.out.print(factors[i] + " ");

        sc.close();
    }
}
