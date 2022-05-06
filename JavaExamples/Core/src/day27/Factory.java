//consider Factory, producer, Consumer & FactoryDemo

package day27;

class Factory
{
    int item;
    
    Factory() {
        this.item = 0;
    }
    
    public synchronized void production() throws InterruptedException {
        ++this.item;
        System.out.println("item" + this.item + "under production");
        Thread.sleep(1000L);
        System.out.println("item" + this.item + "produced");
        Thread.sleep(1000L);
        this.notify();
        this.wait();
    }
    
    public synchronized void consumption() throws InterruptedException {
        System.out.println("item" + this.item + "under consumption");
        Thread.sleep(1000L);
        System.out.println("item" + this.item + "consumed");
        Thread.sleep(1000L);
        this.notify();
        this.wait();
    }
}
