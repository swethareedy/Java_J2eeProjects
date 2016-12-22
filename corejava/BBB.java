package corejava;

class AAA
{
	int speed=80;
}

public class BBB extends AAA
{
	
	int speed=180;
	void display()
	{
		System.out.println(speed);
	
		System.out.println(super.speed);
	}
	
	public static void main(String args[])
	{
		BBB b=new BBB();
		b.display();
	}
}
