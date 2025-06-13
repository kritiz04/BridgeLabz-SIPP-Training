import java.util.Scanner;

public class ques13 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int a, b, c;

        System.out.print("Enter value for a: ");
        a = input.nextInt();
        System.out.print("Enter value for b: ");
        b = input.nextInt();
        System.out.print("Enter value for c: ");
        c = input.nextInt();

        int result1 = a + b * c;       // b * c first, then add a
        int result2 = a * b + c;       // a * b first, then add c
        int result3 = c + a / b;       // a / b first, then add c
        int result4 = a % b + c;       // a % b first, then add c

        System.out.println("The results of Int Operations are:");
        System.out.println("a + b * c = " + result1);
        System.out.println("a * b + c = " + result2);
        System.out.println("c + a / b = " + result3);
        System.out.println("a % b + c = " + result4);

        input.close();
    }
}
