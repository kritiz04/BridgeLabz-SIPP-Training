import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(n>0){
            int m = (n*(n+1))/2;
            System.out.printf("The sum of %d natural numbers is %d", n,m);
        }else{
            System.out.printf("The number %d is not a natural number",n);
        }
        sc.close();
    }
}
