package corejava;

public class ClassStructure 
{
	int x,y;
	public ClassStructure()
	{
		x=10;y=20;
	}
	public int methodOne()
	{
		return x+y;
	}
	public void methodDisplay()
	{
		System.out.println("the adding values of x and y="+methodOne());
	}
	public static void main(String args[])
	{
		ClassStructure objRef=new ClassStructure();
		objRef.methodDisplay();
	}
}
