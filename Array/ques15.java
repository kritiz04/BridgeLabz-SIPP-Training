import java.util.Scanner;

public class ques15{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int EMPLOYEE_COUNT = 10;

        double[][] employeeData = new double[EMPLOYEE_COUNT][2]; // [i][0] = salary, [i][1] = years of service

        double[] bonusAmount = new double[EMPLOYEE_COUNT];
        double[] newSalary = new double[EMPLOYEE_COUNT];

        double totalOldSalary = 0;
        double totalBonus = 0;
        double totalNewSalary = 0;

        for (int i = 0; i < EMPLOYEE_COUNT; i++) {
            System.out.println("\nEnter details for Employee " + (i + 1) + ":");

            System.out.print("Enter salary: ");
            double salary = sc.nextDouble();
            if (salary <= 0) {
                System.out.println("Invalid salary! Try again.");
                i--;
                continue;
            }

            System.out.print("Enter years of service: ");
            double years = sc.nextDouble();
            if (years < 0) {
                System.out.println("Invalid years of service! Try again.");
                i--;
                continue;
            }

            employeeData[i][0] = salary;
            employeeData[i][1] = years;
        }

        for (int i = 0; i < EMPLOYEE_COUNT; i++) {
            double salary = employeeData[i][0];
            double years = employeeData[i][1];

            double bonus = (years > 5) ? (salary * 0.05) : (salary * 0.02);
            double updatedSalary = salary + bonus;

            bonusAmount[i] = bonus;
            newSalary[i] = updatedSalary;

            totalOldSalary += salary;
            totalBonus += bonus;
            totalNewSalary += updatedSalary;
        }

        System.out.println("\n--- Bonus Report ---");
        System.out.printf("%-10s %-10s %-10s %-10s %-10s\n", "Emp#", "Salary", "Years", "Bonus", "NewSalary");
        for (int i = 0; i < EMPLOYEE_COUNT; i++) {
            System.out.printf("%-10d %-10.2f %-10.1f %-10.2f %-10.2f\n",
                    (i + 1), employeeData[i][0], employeeData[i][1], bonusAmount[i], newSalary[i]);
        }

        System.out.println("\nTotal Old Salary: ₹" + totalOldSalary);
        System.out.println("Total Bonus Payout: ₹" + totalBonus);
        System.out.println("Total New Salary to be Paid: ₹" + totalNewSalary);

        sc.close();
    }
}
