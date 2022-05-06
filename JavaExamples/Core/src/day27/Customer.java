package day27;

class Customer extends Thread
{
    int balance;
    
    Customer() {
        this.balance = 15000;
    }
    
    @Override
    public void run() {
        for (int i = 1; i <= 10; ++i) {
            System.out.println("Transcation started...!");
            try {
                Thread.sleep(2000L);
            }
            catch (InterruptedException ex) {}
        }
        for (int i = 1; i <= 10; ++i) {
            this.balance -= 1000;
            System.out.println("Withdraw is completed...!");
            try {
                Thread.sleep(2000L);
            }
            catch (InterruptedException ex2) {}
        }
        synchronized (this) {
            this.notify();
        }
        for (int i = 1; i <= 10; ++i) {
            this.balance -= 1000;
            System.out.println("Transcation closed...!");
            try {
                Thread.sleep(2000L);
            }
            catch (InterruptedException ex3) {}
        }
    }
}