package Day7; 
class cheppanuException extends Exception {
public cheppanuException (String message) {
	super(message);
}
}
public class java {
	public static void agecheck(int age) throws cheppanuException {
	if(age>18) {
		throw new cheppanuException("nenu cheppanu");
	}else {
		System.out.println("na age 18 below");
	}
	}
    
    
   public static void main(String[] args) {
	try {
		agecheck(489);
	}
	catch(cheppanuException e) {
		System.out.println("e.getmessage()");
	}finally {
		System.out.println("happy coding");
	}
}
}
