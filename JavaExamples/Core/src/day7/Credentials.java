package day7;

class Credentials
{
    private String un;
    private String pwd;
    
    void setUn(final String username) {
        this.un = username;
    }
    
    void setPwd(final String password) {
        this.pwd = password;
    }
    
    String getUn() {
        return this.un;
    }
    
    String getPwd() {
        return this.pwd;
    }
}