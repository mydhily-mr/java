package day17;

interface InRule12
{
    void add(final int p0, final int p1);
}

interface calculate12
{
    void add(final int p0, final int p1);
}
/*error code
class calculator12 implements InRule12, calculate12
{
	public void add(int x, int y) {
        int c;
        c = x + y;
        System.out.println(c);
    } 
    
    public int add(int a, int b) {
        final int c;
        c= a + b;
        return c;
    }}
    error code uncomment till this */
	


	/*correct code from github class file
    public void add12(final int x, final int y) {
        final int c = x + y;
        System.out.println(c);
    }
    
    @Override
    public void add(final int a, final int b) {
        final int c = a + b;
    }*/
    
   