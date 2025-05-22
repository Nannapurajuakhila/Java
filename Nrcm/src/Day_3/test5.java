package Day_3;

public class test5 {
	int a=89;
	public void add() {
System.out.println("add");
	}
	public void sub() {
		this.add();
		System.out.println(this.a);
	}
	public static void main(String[] args) {
		//TODO Auto-generated method stub
		test5 t1=new test5();
		t1.sub();
		
	}

}
