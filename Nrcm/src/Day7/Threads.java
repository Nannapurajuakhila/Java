package Day7;

public class Threads extends Threads
{
	String s;
	public Threads(String name){
		s=name;
	}
	public void run()
	{
		//checking whether the thread is Daemon or not
		if(Thread.currentThread().isDaemon())
{
	System.out.println(s+"is Daemon Thread");
	
}
else
{
	System.out.println(s+"is user Thread");

}
	}

}
