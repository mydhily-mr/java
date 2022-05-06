package day27;

class CustomerDemo
{
    public static void main(final String[] args) {
        final Customer c = new Customer();
        System.out.println("balance before the transcation is: " + c.balance);
        c.start();
        try {
            synchronized (c) {
                c.wait();
            }
            // monitorexit(c)
        }
        catch (InterruptedException ex) {}
        System.out.println("balance after the transcation is: " + c.balance);
    }
}