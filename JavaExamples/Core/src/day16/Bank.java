package day16;

abstract class Bank
{
    abstract void roi();
}

class sbi extends Bank
{
    @Override
    void roi() {
        System.out.println("Interest rate is 7.5%");
    }
}

class hdfc extends Bank
{
    @Override
    void roi() {
        System.out.println("Interest rate is 8.5%");
    }
}

class icici extends Bank
{
    @Override
    void roi() {
        System.out.println("Interest rate is 9.5%");
    }
}