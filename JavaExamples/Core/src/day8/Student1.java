package day8;

class Student1
{
    private String name;
    private int age;
    private int roll_no;
    
    public void SetData(final String name, final int age, final int roll_no) {
        this.name = name;
        this.age = age;
        this.roll_no = roll_no;
    }
    
    public void SetName(final String name) {
        this.name = name;
    }
    
    public void SetAge(final int age) {
        this.age = age;
    }
    
    public void SetRoll_no(final int roll_no) {
        this.roll_no = roll_no;
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