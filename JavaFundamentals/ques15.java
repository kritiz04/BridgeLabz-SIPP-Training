import java.util.Scanner;

public class ques15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the base of the triangle in cm: ");
        double base = input.nextDouble();

        System.out.print("Enter the height of the triangle in cm: ");
        double height = input.nextDouble();

        double areaCm = 0.5 * base * height;

        double areaInches = areaCm / (2.54 * 2.54);

        System.out.println("The Area of the triangle in sq in is " +
            String.format("%.2f", areaInches) + " and sq cm is " + String.format("%.2f", areaCm));

        input.close();
    }
}
