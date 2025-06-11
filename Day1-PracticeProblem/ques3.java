import java.util.*;

public class ques3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter temp in Celsius:");
        
        float Celsius = sc.nextFloat();  // Fixed this line
        
        float ftemp = (Celsius * 9 / 5) + 32;
        System.out.println("Temperature in Fahrenheit: " + ftemp);
    }
}
