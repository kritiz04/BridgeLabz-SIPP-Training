import java.util.Scanner;

public class greatestFactor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int greatestFactor = 1;
        int m = n;
        while(n>=1){
            int counter = n - 1;
            if(m%counter==0){
                greatestFactor = counter;
                break;
            }
        }

        System.out.println(greatestFactor);
        sc.close();
    }
}
