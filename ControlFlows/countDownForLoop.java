import java.util.Scanner;

public class countDownForLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number:");
        int counter = sc.nextInt();

        for(int i=counter;i>=1;i--){
            System.out.println(i);
        }

        sc.close();
    }
}
