import java.util.Scanner;

public class EmployeeWage {
    public static int attendanceCheck(int wagePerHour, int maxHrMonth, int numWorkingDay) {
        int totalSalary = 0;
        int totalEmpHr = 0;
        int totalWorkingDay = 0;
        int empHr = 0;
        while (totalEmpHr < maxHrMonth && totalWorkingDay < numWorkingDay) {
            totalWorkingDay++;
            int empCheck = (int) (Math.random() * 3);

            switch (empCheck) {
                case 0:
                    empHr = 0;
                    break;

                case 1:
                    empHr = 8;    //Full day hours
                    break;

                case 2:
                    empHr = 4;    // Part time hours
                    break;
            }

            totalEmpHr += empHr;
        }
        totalSalary = totalEmpHr * wagePerHour;

        System.out.println("Total Number of Working days in a Month is  " + totalWorkingDay);
        System.out.println("Total Employee Hour in a month  is  " + totalEmpHr);
        System.out.println("The total Monthly Salary of the Employee is  " + totalSalary);

        return totalSalary;
    }

    public static void main(String[] args) {
        System.out.println("Welcome To Employee Wage Computation Problem");
        EmployeeWage obj1 = new EmployeeWage();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Wage Per Hours :-");
        int wagePerHour = sc.nextInt();
        System.out.println("Enter the Maximun Hours in a Month :-");
        int maxHrMonth = sc.nextInt();
        System.out.println("Enter Number of Working Day in a Month :-");
        int numWorkingDays = sc.nextInt();

        obj1.attendanceCheck(wagePerHour, maxHrMonth, numWorkingDays);
        System.out.println("");
    }
}

