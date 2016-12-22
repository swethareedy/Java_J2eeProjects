package corejava;

public class Sample 
{
	
	//non-static variables
	int a,b;
	
	//static variables;
	
	static float f1,f2;
	
	public void functionOne()
	{
		//local variable
		
		int c=a+b;
		
		
	}
	public float functionTwo()
	{
		return f1+f2;
	}
	
	public static void main(String[] args)
	{
		f1=1.5f;
		f2=f1+0.5f;
		
		Sample sample=new Sample();
		sample.a=6;
		sample.b=sample.a+10;
		sample.functionOne();
		float f1=  sample.functionTwo();
		System.out.println("local f1="+f1);
		System.out.println(sample.a+" ,"+sample.b);
		System.out.println(sample.f1 +" ,"+sample.f2);
		
		
	}
	
	
	
	

}
