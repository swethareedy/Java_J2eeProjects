package corejava;

public class Overload 
{
	int x,y;
	double a,b;
	public int methodOne(int x,int y)
	{
		this.x=x+y;
		this.y=this.x+(x*y);
		int z=this.x+this.y;
		return z;
		
	}
	public double methodOne(double a, double b)
	{
		this.a=a+b;
		this.b=a-b;
		double c = this.a*this.b;
		return c;
		
	}
	public void methodOne()
	{
		System.out.println(x+y);
		System.out.println(a+b);
		
	}
	public static void main(String args[])
	{
		Overload ol=new Overload();
		ol.methodOne(2, 5);
		ol.methodOne(2.5, 5.2);
		ol.methodOne();
		
		
		
	}
}




 class Override extends Overload
{
	int x;
	double y;
	public int methodOne(int x,int y)
	{
		this.x=x+y;
		y=this.x+super.y;
		this.x=y;
		super.x=this.x+y;
		int z=this.x+y;
		return z;
		
	}
	public double methodOne(double a, double b)
	{
		super.a=a+b;
		super.b=super.a+b;
		double c=a+b;
		return c;
		
	}
	public static void main(String args[])
	{
		Override or=new Override();
		int z = 0;
		z=or.methodOne(5, 7);
		or.methodOne(5.5, 4.6);
		or.methodOne();
		System.out.println(z);
		System.out.println(or.x);
		System.out.println(or.y);
		
		
	}
}