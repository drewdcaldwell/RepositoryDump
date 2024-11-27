class Developer extends Employee
{
    public Developer(String name, double salary)
    {
        super(name, salary);
    }
    
    public void print()
    {
        System.out.println("-------------");
        System.out.println("Name ="+getName());
        System.out.println("Salary ="+getSalary());
        System.out.println("-------------");
    }
}