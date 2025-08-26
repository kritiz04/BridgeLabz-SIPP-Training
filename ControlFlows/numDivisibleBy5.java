import java.util.Scanner;
public class numDivisibleBy5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(n%5==0){
            System.out.printf("Is the number %d divisible by 5? true\r",n);
        }else{
            System.out.printf("Is the number %d divisible by 5? false\r",n);
        }
        sc.close();
    }
}
