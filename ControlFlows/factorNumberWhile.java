import java.util.Scanner;

public class factorNumberWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int counter = 1;
        if(n>0){
            while(counter<n){
                if(n%counter==0){
                    System.out.println(counter);
                }
                counter++;
            }
        }
        sc.close();
    }
}