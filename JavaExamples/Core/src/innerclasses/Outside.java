package innerclasses;

class Outside {
    int a = 0;
    
class Inside
    {
	int b=5;
    }

    public class Innerclass 
    {
        public void main(String[] args) 
        {
            Outside o = new Outside();
            Outside.Inside i = o.new Inside();
            System.out.println(o.a);
            System.out.println(i.b);
        }
    }
}

    