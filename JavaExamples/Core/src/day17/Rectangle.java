package day17;

import java.util.Scanner;

class Rectangle
{
    float length;
    float breadth;
    float area;
    
    public void input() {
        final Scanner s = new Scanner(System.in);
        System.out.println("enter the length of rectangle: ");
        this.length = s.nextFloat();
        System.out.println("enter the breadth of rectangle: ");
        this.breadth = s.nextFloat();
    }
    
    public void compute() {
        this.area = this.length * this.breadth;
    }
    
    public void disp() {
        System.out.println("the area of the rectangle is : " + this.area);
    }
}