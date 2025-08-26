import java.util.Scanner;

public class countDown{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number:");
        int counter = sc.nextInt();

        while(counter >= 1){
            System.out.println(counter);
            counter--;
        }

        sc.close();
    }
}