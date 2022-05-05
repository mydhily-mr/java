package day8;

public class Student
{
    private String name;
    private int age;
    private int roll_no;
    
    public void SetName(final String sname) {
        this.name = sname;
    }
    
    public void SetAge(final int sage) {
        this.age = sage;
    }
    
    public void SetRoll_no(final int sroll_no) {
        this.roll_no = sroll_no;
    }
    
    public String getName() {
        return this.name;
    }
    
    public int getAge() {
        return this.age;
    }
    
    public int getRoll_no() {
        return this.roll_no;
    }
}