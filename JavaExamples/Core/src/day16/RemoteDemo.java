package day16;

public class RemoteDemo
{
    public static void main(final String[] args) {
        final Remote r = (Remote)new Tv();
        r.On();
        r.Off();
    }
}

