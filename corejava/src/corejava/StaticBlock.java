package corejava;

class StaticBlock
{
	
	static int i;
	
	
	static
	{
		i=20;
		int j=30;
		System.out.println("static block called");
		System.out.println("the value of j is:"+j);
		
		System.out.println("the value of k from static main:"+StaticMain.k);
		
	}
	static void method()
	{
		System.out.println("this is from static block method");
		
	}
	
	public static void main(String args[])
	{
		System.out.println("the value of i is:"+i);
		
		StaticBlock.method();
	}
	
}
