package day7;

class SettersGetters2
{
    private String name;
    private int age;
    private float height;
    
    void setName(final String sname) {
        this.name = sname;
    }
    
    void setAge(final int sage) {
        this.age = sage;
    }
    
    void setHeight(final float sheight) {
        this.height = sheight;
    }
    
    String getName() {
        return this.name;
    }
    
    int getAge() {
        return this.age;
    }
    
    float getHeight() {
        return this.height;
    }
    
    public static void main(final String[] args) {
        final SettersGetters2 s = new SettersGetters2();
        s.setName("sabu");
        s.setAge(24);
        s.setHeight(6.1f);
        System.out.println(s.getName());
        System.out.println(s.getAge());
        System.out.println(s.getHeight());
    }
}