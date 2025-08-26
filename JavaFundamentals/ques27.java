import java.util.Scanner;

public class ques27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of chocolates: ");
        int numberOfChocolates = scanner.nextInt();

        System.out.print("Enter the number of children: ");
        int numberOfChildren = scanner.nextInt();

        if (numberOfChildren == 0) {
            System.out.println("Cannot divide chocolates among 0 children.");
        } else {

            int chocolatesPerChild = numberOfChocolates / numberOfChildren;
            int remainingChocolates = numberOfChocolates % numberOfChildren;

            System.out.println("The number of chocolates each child gets is " + chocolatesPerChild +
                               " and the number of remaining chocolates is " + remainingChocolates);
        }

        scanner.close();
    }
}
