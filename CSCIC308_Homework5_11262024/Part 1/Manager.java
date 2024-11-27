import java.util.ArrayList;
import java.util.Iterator;

class Manager extends Employee
{
	//attributes
	private ArrayList<Employee> subordinates;
	
    public Manager(String name, double salary) // constructor
    {
        super(name, salary); //call constructor of parent class
		subordinates = new ArrayList<>();
    }

	public void print()
	{
		//print manager's info
		System.out.println("-------------");
		System.out.println("Name ="+getName());
		System.out.println("Salary ="+getSalary());
		System.out.println("-------------");
  
		// print info of all the employees belong to this manager
		Iterator<Employee> iterator = subordinates.iterator();
        while (iterator.hasNext()) {
            Employee emp = iterator.next();
            emp.print();  // Delegate the print task to each employee (Developer or Manager)
        }
	}
	
	public void add(Employee employee)
	{
		// add employee from this manager
		subordinates.add(employee);
	}

	public void remove(Employee employee)
	{
		// remove employee from this manager
		subordinates.remove(employee);
	}
}