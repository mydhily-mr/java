/*package hibernatecrud;
import org.hibernate.HibernateException;

public class App {

	public static void main(String[] args) {
		SessionFactory sf = new Configuration().configure("hibernate.cfg.xml").addAnnotation;
		
		Session s = sf.getCurrentSession();
		try {
			//create object and sent to DB
			
			User u = new User("Sachin Tendulkar", "sachin", "tendulkar");
			
			//start transcation (java file and DB server)
			
			s.beginTranscation();
			
			//perform CRUD operation ----> create & update
			s.save(U);
		}

	}

}*/
