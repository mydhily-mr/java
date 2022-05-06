package day33;

@FunctionalInterface
interface Drawable1
{
    public void draw();
}

public class LambdaExpression
{
    public static void main(String[] args) {
       
    	int width = 20;
        
    	//with Lambda
        Drawable1 d2 = () ->{
        	System.out.println("Drawing " + width);
        };
        d2.draw();
    }
}