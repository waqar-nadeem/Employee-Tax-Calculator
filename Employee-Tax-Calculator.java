import java.util.Scanner;
class Employee {
    private String name;
    private int id;
    private String department;
    private double salary;

    public Employee() {
        this.name = "";
        this.id = 0;
        this.department = "";
        this.salary = 0.0;
    }

    public Employee(String name, int id, String department, double salary) {
        this.name = name;
        this.id = id;
        this.department = department;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String newname) {
        this.name = newname;
    }

    public int getId() {
        return id;
    }

    public void setId(int newid) {
        this.id = newid;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String newdepartment) {
        this.department = newdepartment;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double newsalary) {
        this.salary = newsalary;
    }

    public double calculateTax() {
        double taxRate = 0.0;
        if (salary > 50000) {
            taxRate = 0.05;  
        } else if (salary >= 30000 && salary <= 50000) {
            taxRate = 0.03; 
        } else if (salary < 30000) {
            taxRate = 0.02;
        }
        return salary * taxRate;
    }

    public void displayEmployeeInfo() {
        System.out.println("Employee Information:");
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + salary);
    }
}

public class EmployeeTaxCalculator {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("\n===== Employee Tax Calculator ====\n");
        System.out.print("Enter employee name: ");
        String name = s.nextLine();
        System.out.print("Enter employee ID: ");
        int id = s.nextInt();
        s.nextLine();
        System.out.print("Enter employee department: ");
        String department = s.nextLine();
        System.out.print("Enter employee salary: ");
        double salary = s.nextDouble();
        Employee empl = new Employee(name, id, department, salary);
        empl.displayEmployeeInfo();
        double tax = empl.calculateTax();
        System.out.println("Calculated Tax: " + tax);
    }
}
