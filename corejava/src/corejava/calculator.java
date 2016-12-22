package corejava;

public abstract class calculator
{
	int a,b;
	public int add(int a, int b)
	{
		this.a=a;
		this.b=b;
		return this.a+this.b;
		
	}
	public int sub(int a, int b)
	{
		this.a=a;
		this.b=b;
		return this.a+this.b;
		
	}
	public abstract  int mul(int a, int b);
	public abstract int div(int a, int b);

}
