import java.util.Scanner;

public class largestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        int number3 = sc.nextInt();

        if(number1>number2 && number1>number3){
            System.out.println("first number is the largest "+number1);
        }else if(number2>number1 && number2 > number3){
            System.out.println("second number is the largest " + number2);
        }else{
            System.out.println("third number is the largest " + number3);
        }
        sc.close();
    }
}
