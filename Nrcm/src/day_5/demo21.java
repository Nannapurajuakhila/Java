package day_5;

public class demo21 { 
	void add() {
	System.out.println("hi");
}
   void add(int a) {
    System.out.println("a");
}
	void add(int a,int b) {
	System.out.println("a+b");
}
	void add(int a,int b,double dl) {
		System.out.println(a+b-dl);
	}
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		demo21 dl=new demo21();
		dl.add();
		dl.add(34);
		dl.add(2, 7);
		dl.add(4, 6, 8.8);

	}

}
