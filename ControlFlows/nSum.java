import java.util.Scanner;

public class nSum{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();

        int formulaSum = (n*(n+1))/2;
        int sum=0;
        // sum using loop 
        while(n>0){
            sum+=n;
            n--;
        }

        if(formulaSum == sum){
            System.out.println(sum);
        }else{
            System.out.println("not equal");
        }
        sc.close();
    }
}