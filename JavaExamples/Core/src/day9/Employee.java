package day9;

class Employee
{
    private String name;
    private int id;
    private float salary;
    
    public Employee(final String name) {
        this.name = name;
    }
    
    public Employee(final String name, final int id) {
        this.name = name;
        this.id = id;
    }
    
    public Employee(final String name, final int id, final float salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
    
    public String getName() {
        return this.name;
    }
    
    public int getId() {
        return this.id;
    }
    
    public float getSalary() {
        return this.salary;
    }
}