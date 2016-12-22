package corejava;

class New1
{
	public void run1()
	{
		System.out.println(" this is from new1 class");
		
	}

}
public class New extends New1
{
	public void run()
	{
		System.out.println(" this is from new class");
		
	}
	public static void main(String arg[])
	{
		New n=new New();
		n.run();
		n.run1();
	}
}