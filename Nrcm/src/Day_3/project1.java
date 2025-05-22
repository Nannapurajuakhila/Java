         Day_3;
package
public class project1 {
   private String firstName;
   private String lastName;
public void setFirstName(String fn) {
	firstName = fn;
}
public void setLastName(String ln) {
	lastName = ln;
}
public String getFirstName() {
	return firstName;
}
public String getLastName() {
	return lastName;
}
public static void main(String[] args) {
	project1 d1=new project1();
	d1.setFirstName("laharika");
	d1.setLastName("akhila");
	System.out.println(d1.getFirstName());
	System.out.println(d1.getLastName());
}
}