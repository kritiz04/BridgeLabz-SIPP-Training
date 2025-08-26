import java.util.Scanner;

public class numCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(n== 0){
            System.out.println("zero.\r");
        }else if(n>0){
            System.out.println("positive\r");
        }else{
            System.out.println("negative.\r");
        }
        sc.close();
    }
}
