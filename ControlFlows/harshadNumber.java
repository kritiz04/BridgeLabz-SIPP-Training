import java.util.Scanner;

public class harshadNumber {

    public static boolean checkHarshad(int n)
    {
        int sum = 0;
        for (int temp = n; temp > 0; temp /= 10)
            sum += temp % 10;
            
        return (n % sum == 0);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        System.out.println(checkHarshad(n));
        sc.close();
    }
}
