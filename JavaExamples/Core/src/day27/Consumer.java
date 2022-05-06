//consider Factory, producer, Consumer & FactoryDemo

package day27;

class Consumer extends Thread
{
    Factory f;
    
    public Consumer(final Factory f) {
        this.f = f;
    }
    
    @Override
    public void run() {
        try {
            for (int i = 0; i <= 10; ++i) {
                this.f.consumption();
            }
        }
        catch (InterruptedException ex) {}
    }
}
