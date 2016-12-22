package corejava;

public class TypeCasting
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		// implicit type casting
		int x=4;
		long l=x;
		float f=x;
		System.out.println("value of x is:"+x);
		System.out.println("value of l is:"+l);
		System.out.println("value of f is:"+f);
		// explicit type casting
		long s=5;
		int i=(int)s;
		long y=(int)i;
		System.out.println("value of s is:"+s);
		System.out.println("value of i is:"+i);
		System.out.println("value of y is:"+y);
		
		
	}

}
