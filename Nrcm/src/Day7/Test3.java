package Day7;
import java.io.*;  

public class Test3 {

	public static void main(String[] args) throws IOException{
		//Escape backlashes correctly
	 	File f1 = new File("c:\\user\\akhila\\Desktop\\sem2.test")
			if (f1.createNewFile()) {
	 System.out.println("created succes");
			} else {
				System.out.println("not created");
			}
	
	}

}
