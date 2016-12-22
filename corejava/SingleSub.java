package corejava;


public class SingleSub extends SingleSuper
{
	public void sub()
	{
		System.out.println("hello, am from sub class");
	}

	public static void main(String[] args)
	{
		
		SingleSub ss=new SingleSub();
		ss.sup();
		ss.sub();

	}

}
