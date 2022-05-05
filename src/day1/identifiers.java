package day1;

public class identifiers {   //-->"identifiers" here is a user defined class->1st letter shd be capital for class

	public static void main(String[] args) 
		
			
			{
		int x = 10;     //assign value 10 in memory piece x
		int virat = 18; //assign value 18 in memory piece virat
		int VIRAT = 2;   //--> case sensitive
		int Virat = 3;
	   	int ViRaT = 40;
	   	int Integer = 5; //Integer is a valid literal, not a reserved key word
		int uishdiusahoisajudoiauoiauakxjlk=55; //-->no length limit for identifiers
		// int 16anil = 20;   --> to show syntax error - invalid identifier
		int Exception=0; // all inbuilt/predefined class can be used as identifier in JAVA( other than "System")
		
		String String="String"; //string is an inbuilt class for data type
		
		//int System=10;
		//System.out.println(System); //system is a predefined class which we cannot use as identifier  all others can be used
	    
		System.out.println(x);	//-->print value in memory x
		System.out.println(virat); 
		System.out.println(VIRAT);
		System.out.println(Virat);
		System.out.println(ViRaT);
		System.out.println(Integer);
		System.out.println(uishdiusahoisajudoiauoiauakxjlk); 
		System.out.println(Exception);
		System.out.println(String);

			}

		}