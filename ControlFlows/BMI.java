import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int weight = sc.nextInt();
        float height = sc.nextInt();
        height = height / 100;

        float bmi = weight/(height*height);

        if(bmi<=18.4){
            System.out.println("UnderWieght");
        }else if(bmi>=18.5 && bmi<=24.9){
            System.out.println("Normal");
        }else if(bmi>=25.0 && bmi<=39.9){
            System.out.println("OverWeight");
        }else{
            System.out.println("Obese");
        }
        sc.close();
    }
}
