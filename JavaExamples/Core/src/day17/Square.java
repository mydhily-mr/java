package day17;

import java.util.Scanner;

class Square
{
    float length;
    float area;
    
    public void input() {
        final Scanner s = new Scanner(System.in);
        System.out.println("enter the length of square: ");
        this.length = s.nextFloat();
    }
    
    public void compute() {
        this.area = this.length * this.length;
    }
    
    public void disp() {
        System.out.println("the area of the square is : " + this.area);
    }
}