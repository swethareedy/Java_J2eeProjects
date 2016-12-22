package strings;

import java.util.Scanner;


public class ScannerExample
{
	public static void main(String args[])
	{
		System.out.println("enter a id for employee :");
		Scanner sc=new Scanner(System.in);
		int id=sc.nextInt();
		System.out.println("enter a name for employee :");
		Scanner sc1=new Scanner(System.in);
		String name=sc1.next();
		System.out.println("enter employee salary :");
		Scanner sc2=new Scanner(System.in);
		float salary=sc2.nextFloat();
		
		System.out.println("employee id is:"+id);
		System.out.println("employee name is:"+name);
		System.out.println("employee salary is:"+salary);
		
		
		
	}
}
