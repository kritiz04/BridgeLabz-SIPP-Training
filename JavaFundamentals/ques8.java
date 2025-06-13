import java.util.Scanner;

public class ques8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the course fee (INR): ");
        double fee = scanner.nextDouble();

        System.out.print("Enter the university discount percentage: ");
        double discountPercent = scanner.nextDouble();

        double discount = (discountPercent / 100) * fee;
        double finalFee = fee - discount;

        System.out.println("The discount amount is INR " + String.format("%.2f", discount) +
                           " and final discounted fee is INR " + String.format("%.2f", finalFee));
        
        scanner.close();
    }
}
