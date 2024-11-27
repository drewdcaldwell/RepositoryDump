import java.util.ArrayList;
import java.util.Iterator;

class Manager extends Employee {
    // List to store subordinates (both Developer and Manager)
    private ArrayList<Employee> subordinates;

    // Constructor for Manager class
    public Manager(String name, double salary) {
        super(name, salary);  // Call the constructor of the superclass (Employee)
        subordinates = new ArrayList<>();  // Initialize the list of subordinates
    }

    // Print manager's information and the information of all subordinates
    public void print() {
        // Print the manager's own information
        System.out.println("-------------");
        System.out.println("Name = " + getName());
        System.out.println("Salary = " + getSalary());
        System.out.println("-------------");
        
        // Print the information of each subordinate (Developer or Manager)
        Iterator<Employee> iterator = subordinates.iterator();
        while (iterator.hasNext()) {
            Employee emp = iterator.next();
            emp.print();  // Delegate the print task to each employee (Developer or Manager)
        }
    }

    // Add an employee (Developer or Manager) to the list of subordinates
    public void add(Employee employee) {
        subordinates.add(employee);
    }

    // Remove an employee (Developer or Manager) from the list of subordinates
    public void remove(Employee employee) {
        subordinates.remove(employee);
    }
}
