import java.util.Scanner;

public class EmployeeTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt for employee one's information
        System.out.print("Enter Employee One's first name: ");
        String firstName1 = scanner.nextLine();

        System.out.print("Enter Employee One's last name: ");
        String lastName1 = scanner.nextLine();

        System.out.print("Enter Employee One's monthly salary: ");
        double monthlySalary1 = scanner.nextDouble();

        // Clear the input buffer
        scanner.nextLine();

        // Prompt for employee two's information
        System.out.print("Enter Employee Two's first name: ");
        String firstName2 = scanner.nextLine();

        System.out.print("Enter Employee Two's last name: ");
        String lastName2 = scanner.nextLine();

        System.out.print("Enter Employee Two's monthly salary: ");
        double monthlySalary2 = scanner.nextDouble();

        // Create Employee objects
        Employee employee1 = new Employee(firstName1, lastName1, monthlySalary1);
        Employee employee2 = new Employee(firstName2, lastName2, monthlySalary2);

        // Display employee information
        System.out.println("\nEmployee One’s name: " + employee1.getlastName() + ", " + employee1.getfirstName());
        System.out.printf("Employee One’s yearly salary: $%.2f%n", employee1.getyearlySalary());

        System.out.println("\nEmployee Two’s name: " + employee2.getlastName() + ", " + employee2.getfirstName());
        System.out.printf("Employee Two’s yearly salary: $%.2f%n", employee2.getyearlySalary());

        scanner.close();
    }
}
