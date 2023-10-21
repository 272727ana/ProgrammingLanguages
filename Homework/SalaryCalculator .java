import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
    }
    System.out.print("Enter employee name: ");
    String employeeName = scanner.nextLine();

    System.out.print("Enter gross salary: ");
    double grossSalary = scanner.nextDouble();

    double stateTaxes = Math.round(0.284 * grossSalary);

    double personalTaxes;
    if(grossSalary - stateTaxes - 7000 > 0) {
        personalTax = Math.round(0.1 * (grossSalary - stateTaxes - 7000));
    }
    else {
        personalTax = 0;
    }

    double netSalary = Math.round(grossSalary - stateTaxes - personalTax);

    System.out.print("Employee Name: " + employeeName);
    System.out.print("State Taxes: " + stateTaxes);
    System.out.print("Personal Tax: " + personalTax);
    System.out.print("Net Salary: " + netSalary);

scanner.close();
}
