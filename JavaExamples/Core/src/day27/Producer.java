//consider Factory, producer, Consumer & FactoryDemo
package day27;

class Producer extends Thread
{
    Factory f;
    
    public Producer(final Factory f) {
        this.f = f;
    }
    
    @Override
    public void run() {
        try {
            for (int i = 0; i <= 10; ++i) {
                this.f.production();
            }
        }
        catch (InterruptedException ex) {}
    }
}