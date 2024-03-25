package G2;

public class Employee extends Person{
    private int empId;
    private double salary;

    public Employee(String name, String dob, int empId, double salary) {
        super(name, dob);
        this.empId = empId;
        this.salary = salary;
    }

    public void displayEmployeeDetails() {
        displayPersonName();
        displayAge();
        System.out.println("Employee ID: " + empId);
        System.out.println("Salary: $" + salary);
    }
    public static void main(String[] args) {
        // Create a Person object
        Person person = new Person("John Doe", "1990-05-15");
        // Display person name
        person.displayPersonName();
        // Display person age
        person.displayAge();

        // Create an Employee object
        Employee employee = new Employee("Jane Smith", "1985-10-20", 1001, 50000);
        // Display employee details
        employee.displayEmployeeDetails();
    }
} 