package corejava;

class A{  
A(){  
System.out.println("parent class constructor invoked");  
}  
}  
class Bike7 extends A{  
	Bike7(){  
//super();  
System.out.println("child class constructor invoked");  
}  
  
{System.out.println("instance initializer block is invoked");}  
  
public static void main(String args[]){  
	Bike7 b=new Bike7();  
}  
}  