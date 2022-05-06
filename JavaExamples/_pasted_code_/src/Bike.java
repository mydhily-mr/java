class Bike implements Serializable
{
    String username;
    final transient int pwd = 5454;
    
    Bike() {
        this.username = "Mydhily M R";
    }
}