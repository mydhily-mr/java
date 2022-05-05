package day16;

public class BankDemo
{
    public static void main(final String[] args) {
        Bank b = (Bank)new sbi();
        b.roi();
        b = (Bank)new hdfc();
        b.roi();
        b = (Bank)new icici();
        b.roi();
    }
}