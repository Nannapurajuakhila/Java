package day_5;
interface I2{
	void add();
	
}
interface I3{
	void sub();
	
}
interface I4 extends I2, I3{
	void mul();
}
class sample2{
	void div() {
System.out.println("Div");
    }
}
public class day_6 extends sample2 implements I3{
	public void add() {
		System.out.println("Add");
	}
	public void sub() {
		System.out.println("Sub");
	}
	public void mul() {
		System.out.println("Mul");
	}
	public static void main(String[] args) {
		// TODO Auto-generated constructor stub
		day_6 d=new day_6();
		d.add();
		d.sub();
		d.mul();
		d.div();
		
	}

}
