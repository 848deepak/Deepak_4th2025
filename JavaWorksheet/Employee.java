// Employee class with overloaded constructors
class Employee {
    private String name;
    private double salary;

    // Default constructor
    public Employee() {
        this.name = "Unknown";
        this.salary = 0;
    }

    // Overloaded constructor
    public Employee(String name) {
        this.name = name;
        this.salary = 30000; // Default salary
    }

    // Method to display employee details
    public void DisplayEmployeeDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Salary: " + salary);
    }

    public static void main(String[] args) {
        // Creating employees
        Employee emp1 = new Employee();
        Employee emp2 = new Employee("John Doe");

        System.out.println("Employee 1 Details:");
        emp1.DisplayEmployeeDetails();

        System.out.println("\nEmployee 2 Details:");
        emp2.DisplayEmployeeDetails();
    }
}
