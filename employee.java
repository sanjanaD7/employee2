import java.util.Scanner;

public class employee {

    public static class employee {
        private String name;
        private int id;
        private double salary;

        // Constructor to initialize employee details
        public Employee(String name, int id, double salary) {
            this.name = name;
            this.id = id;
            this.salary = salary;
        }

        // Method to display employee details
        public void displayDetails() {
            System.out.println("Employee Details:");
            System.out.println("Name: " + name);
            System.out.println("ID: " + id);
            System.out.println("Salary: $" + salary);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get employee details from the user
        System.out.print("Enter employee name: ");
        String name = scanner.nextLine();

        System.out.print("Enter employee ID: ");
        int id = scanner.nextInt();

        System.out.print("Enter employee salary: ");
        double salary = scanner.nextDouble();

        // Create an instance of the Employee class
        employee employee = new employee(name, id, salary);

        // Display employee details
        employee.displayDetails();

        // Close the scanner
        scanner.close();
    }
}
