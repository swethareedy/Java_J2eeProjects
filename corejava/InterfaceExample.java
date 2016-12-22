package corejava;

public class InterfaceExample implements abc
{
	public void function()
	{
		int i=6;
		i=i+abc.i;
		System.out.println(i);
		
	}
	public void functionOne()
	{
		float f=abc.pi;
		System.out.println(f);
		
	}
	public static void main(String args[])
	{
		InterfaceExample ie=new InterfaceExample();
		ie.function();
		ie.functionOne();
	}

}
