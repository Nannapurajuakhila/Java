package Day7;

public class Demo_2 implements Runnable{
	public void run() {
		System.out.println("hi");
	}
	
		public static void main(String[] args) {
			Demo_2 t1 = new Demo_2();
			Demo_2 t2 = new Demo_2();
			Thread p1=new Thread(t1);
			Thread p2=new Thread(t2);
			System.out.println("hello");
			p1.start();
			p2.start();
	}

}
