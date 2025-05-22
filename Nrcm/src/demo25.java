package day_5;
interface I1 {
      abstract void add();
      void sub();
}

public class demo24 implements I1{
	public void add() {
		System.out.println("hi");
	}
	public void sub() {
		System.out.println("hello");
	}
	 public static void main(String[] args) {
		 demo24 tl=new demo24();
		 tl.add();
		 tl.sub();
	 }
}


