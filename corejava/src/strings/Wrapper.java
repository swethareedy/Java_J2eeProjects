package strings;

public class Wrapper
{
	  
		 int data=50;  
		  
		public void change(Wrapper op)
		{  
		 op.data=op.data+100;//changes will be in the instance variable  
		 }  
		     
		    
		 public static void main(String args[])
		 {  
			 Wrapper op=new Wrapper();  
		  
		   System.out.println("before change "+op.data);  
		   op.change(op);//passing object  
		   System.out.println("after change "+op.data);  
		  
		 }  
		  
}
