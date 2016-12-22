package corejava;

public class MulThree extends MulTwo
{
	public void display()
	{
		
		System.out.println("addition of a and b from MulOne class:"+c);
		System.out.println("subtraction of b and a from MulTwo class:"+d);
		
	}
	public static void main(String args[])
	{
		MulThree mt=new MulThree();
		mt.add();
		mt.sub();
		mt.display();
		System.out.println("this is from Main method of MulThree class");
		
	}
}
