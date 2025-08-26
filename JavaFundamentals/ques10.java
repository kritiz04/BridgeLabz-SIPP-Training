import java.util.Scanner;

public class ques10 {
    public static void main(String[] args) {
        double km; 
        Scanner input = new Scanner(System.in); 
        System.out.print("Enter distance in kilometers: ");
        km = input.nextDouble();
        double miles = km / 1.6;

        System.out.println("Distance in miles: " + String.format("%.2f", miles));

        input.close();
    }
}
