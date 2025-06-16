import java.util.Scanner;

public class ques25{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter From City: ");
        String fromCity = scanner.nextLine();

        System.out.print("Enter Via City: ");
        String viaCity = scanner.nextLine();

        System.out.print("Enter To City (Final Destination): ");
        String toCity = scanner.nextLine();


        System.out.print("Enter distance from " + fromCity + " to " + viaCity + " in miles: ");
        double fromToVia = scanner.nextDouble();

        System.out.print("Enter distance from " + viaCity + " to " + toCity + " in miles: ");
        double viaToFinalCity = scanner.nextDouble();


        System.out.print("Enter time from " + fromCity + " to " + viaCity + " in minutes: ");
        double timeFromToVia = scanner.nextDouble();

        System.out.print("Enter time from " + viaCity + " to " + toCity + " in minutes: ");
        double timeViaToFinalCity = scanner.nextDouble();


        double totalDistanceKm = (fromToVia + viaToFinalCity) * 1.60934;
        double totalTimeMinutes = timeFromToVia + timeViaToFinalCity;

        System.out.println("The Total Distance travelled by " + name + " from " + fromCity + " to " + toCity +
                           " via " + viaCity + " is " + totalDistanceKm + " km and the Total Time taken is " +
                           totalTimeMinutes + " minutes");

        scanner.close();
    }
}
