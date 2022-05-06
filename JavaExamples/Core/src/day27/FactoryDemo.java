//consider Factory, producer, Consumer & FactoryDemo

package day27;

public class FactoryDemo
{
    public static void main(final String[] args) {
        final Factory f = new Factory();
        final Producer p = new Producer(f);
        final Consumer c = new Consumer(f);
        p.start();
        c.start();
    }
}