package day9;

public class EmployeeApp
{
    public static void main(final String[] args) {
        final Employee e3 = new Employee("ramu", 124, 50.45f);
        System.out.println(e3.getName());
        System.out.println(e3.getId());
        System.out.println(e3.getSalary());
    }
}