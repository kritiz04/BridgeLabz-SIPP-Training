import java.util.Scanner;

public class powerWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number n: ");
        int n = sc.nextInt();
        System.out.println("enter the power: ");
        int power = sc.nextInt();
        int result = 1;
        int counter = 0;

        while(counter != power)
        {
            result*=n;
            counter++;
        }

        System.out.println("power of n is eqaul to: "+result);
        sc.close();

    }
}