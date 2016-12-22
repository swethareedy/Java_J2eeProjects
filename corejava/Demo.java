package corejava;

public class Demo 
{
	int x,y;
	static float f1,f2;
	Demo(int x , int y)
	{
		this.x=x;
		this.y=y;
		
	}
	public int functionOne(int x , int y)
	{
		f1=x+y;
		f2=x*y;
		return(int)(f1+f2);
		
	}
	public static Demo functionOne(float f1,float f2)
	{
		Demo demo=new Demo(2,5);
		int k=demo.functionOne((int)f1, (int)f2);
		Demo.f1=Demo.f1+f1;
		Demo.f2=Demo.f2+f2;
		System.out.println("k value="+k);
		return demo;
		
	}
	
	public static void main(String args[])
	{
		Demo demoref=Demo.functionOne(1.5f,2.5f);
		System.out.println("x value="+demoref.x);
		System.out.println("y value="+demoref.y);
		System.out.println("f1 value="+f1);
		System.out.println("f2 value="+Demo.f2);
		System.out.println("demo reference="+demoref);
		
	}
	
	
	
	
	
}
