import java.util.Scanner;

public class sumUntilZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float sum = 0;
        while(true){
            float n = sc.nextFloat();
            if(n == 0 || n<0){
                break;
            }
            sum+=n;
        }
        System.out.println(sum);
        sc.close();
    }
}
