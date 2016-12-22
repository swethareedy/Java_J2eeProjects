package corejava;

public class ThisExample {
int a,b;
public ThisExample()
{
	System.out.println("Default");
}
public ThisExample(int a)
{
	this(a,4);
	this.a=a;
	System.out.println("one parameter constructure");
}
public ThisExample(int a,int b)
{
	this();
	this.a=a;
	this.b=b;
	System.out.println("second parameter constructure");
}
void example()
{
	System.out.println("the value is:");
}
	public static void main(String[] args) {
		
		ThisExample example=new ThisExample(5);
	example.example();
		
	}

}
