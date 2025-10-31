import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//    creation new object empt1
        Employee emp1 = new Employee();

        System.out.println("Enter employee name: ");
        emp1.name = sc.nextLine();
        System.out.println("Enter the employee gross salary: ");
        emp1.GrossSalary = sc.nextDouble();
        System.out.println("enter the tax of employee salary: ");
        emp1.tax = sc.nextDouble();

        System.out.println("Employee: " + emp1);
    }
}