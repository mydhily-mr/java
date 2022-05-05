package day12;

public class OS
{
    String name;
    int size;
    
    public OS(final String name, final int size) {
        this.name = name;
        this.size = size;
    }
    
    public String getName() {
        return this.name;
    }
    
    public int getSize() {
        return this.size;
    }
}