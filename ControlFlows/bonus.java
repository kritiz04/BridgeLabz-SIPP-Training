import java.util.Scanner;

public class bonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("salary of the employee");
        float salary = sc.nextInt();
        System.out.println("experience of an employee");
        int experience = sc.nextInt();
        float bonus = 0;
        if(experience > 5){
            bonus = (float)(5.0/100.0) * salary;
        }
        System.out.println("bonus of the employee in Rupees is: "+bonus);
        sc.close();
    }
}
