package Day_1;
public class string { 
	public static void main(String[] args) {
	String s= "HelloWorld";
	String v="";
	String c="";
	for(int i=0;i<s.length();i++) {
		char x =s.charAt(i);
		if(x=='a'||x=='e'||x=='o'||x=='u'||x=='A'||x=='E'||x=='I'||x=='O'||x=='U') {
			v+=x;
		}
		else {
			c+=x;
			
		}
	}
	System.out.println(v);
	System.out.println(c);
	
	}
}
