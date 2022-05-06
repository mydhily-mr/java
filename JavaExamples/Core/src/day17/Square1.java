package day17;

import java.util.Scanner;

class Square1 extends Shape
{
    @Override
    public void input() {
        final Scanner s = new Scanner(System.in);
        System.out.println("enter the length of square1: ");
        this.length = s.nextFloat();
    }
    
    @Override
    public void compute() {
        this.area = this.length * this.length;
    }
    
    @Override
    public void disp() {
        System.out.println("the area of the square1 is :" + this.area);
    }
}