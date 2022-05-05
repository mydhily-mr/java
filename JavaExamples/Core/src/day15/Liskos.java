package day15;

public class Liskos
{
    public void play() throws RuntimeException {
        System.out.println("dancing");
    }
    
    class child extends Liskos
    {
        @Override
        public void play() {
            System.out.println("playing");
        }
    }
}



/*package day15;

class child extends Liskos
{
    child(final Liskos this$0) {
        this.this$0 = this$0;
    }
    
    public void play() {
        System.out.println("playing");
    }
}*/