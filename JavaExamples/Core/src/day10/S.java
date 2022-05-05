package day10;

import java.util.Scanner;

public class S
{
    private String name;
    private int age;
    private String schoolName;
    
    public void SetData() {
        final Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name: ");
        this.name = sc.next();
        System.out.println("Enter the age: ");
        this.age = sc.nextInt();
        System.out.println("Enter the school name: ");
        this.schoolName = sc.next();
    }
    
    public void Display() {
        System.out.println("Name is :  " + this.name);
        System.out.println("Age is is :  " + this.age);
        System.out.println("Schoolname is :  " + this.schoolName);
    }
}