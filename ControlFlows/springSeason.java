import java.util.Scanner;

public class springSeason {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please the month in Integer form");
        int month = sc.nextInt();
        System.out.println("enter the date of the month");
        int day = sc.nextInt();

        boolean isSpring = false;

        // Check if the date is in the Spring Season
        if ((month == 3 && day >= 20 && day <= 31) ||
            (month == 4 && day >= 1 && day <= 30) ||
            (month == 5 && day >= 1 && day <= 31) ||
            (month == 6 && day >= 1 && day <= 20)) {
            isSpring = true;
        }

        if (isSpring) {
            System.out.println("It's a Spring Season");
        } else {
            System.out.println("Not a Spring Season");
        }
        sc.close();
    }
}
