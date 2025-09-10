import java.util.Scanner;
public class armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = n;
        int count=0;

        while(m>0){
            m/=10;
            count++;
        }

        int k = n;
        int sum=0;
        while(k>0){
            int l=k%10;
            sum = sum + (int)Math.pow(l,count);
            k/=10;
        }

        if(sum == n){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
        sc.close();
    }
}