package day33;

interface Drawable
{
    void draw();
}

public class LambdaExpressionExample
{
    public static void main(final String[] args) {
        final int width = 10;
        final Drawable d = new Drawable() {
            @Override
            public void draw() {
                System.out.println("Drawing " + width);
            }
        };
        d.draw();
    }
}