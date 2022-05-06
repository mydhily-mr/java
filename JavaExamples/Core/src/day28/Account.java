//Consider Account & CustSerializeDemo

package day28;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Account implements Serializable
{
    String username;
    String pwd;
    
    Account() {
        this.username = "Mydhily";
        this.pwd = "895413";
    }
    
    private void writeObject(final ObjectOutputStream os) throws Exception {
        os.defaultWriteObject();
        final String epwd = "6732" + this.pwd;
        os.writeObject(epwd);
    }
    
    private void readObject(final ObjectInputStream is) throws Exception {
        is.defaultReadObject();
        final String epwd = (String)is.readObject();
        this.pwd = epwd.substring(4);
    }
}