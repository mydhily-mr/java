package day33;

interface Sayable
{
    String say();
}

public class LambdaNoParameter
{
    public static void main(String[] args) 
    {
    	
        Sayable s = () -> {
        	return "I Have nothing to say.";
        };
        System.out.println(s.say());
    }
}
