import java.util.Scanner;

public class ages {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("age1:");
        int age1 = sc.nextInt();
        System.out.println("age2:");
        int age2 = sc.nextInt();
        System.out.println("age3:");
        int age3 = sc.nextInt();

        System.out.println("height1");
        float height1 = sc.nextFloat();
        System.out.println("height2");
        float height2 = sc.nextFloat();
        System.out.println("height3");
        float height3 = sc.nextFloat();

        if(age1 > age2 && age1 > age3){
            System.out.println(age1);
        }else if(height2 > height1 && height2 > height3){
            System.out.println(age2);
        }else{
            System.out.println(age3);
        }


        if(height1 > height2 && height1 > height3){
            System.out.println(height1);
        }else if(height2 > height1 && height2 > height3){
            System.out.println(height2);
        }else{
            System.out.println(height3);
        }
        sc.close();
    }
}
