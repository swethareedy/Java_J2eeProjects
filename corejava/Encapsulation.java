package corejava;

public class Encapsulation {
	

	private String id;
	private String name;
	public String getId()
	{
		return id;
	}
	public void setId(String id)
	{
		this.id=id;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		Encapsulation e=new Encapsulation();
		e.setId("117Z1A0595");
		e.setName("swetha");
		System.out.println("your id-no is:"+e.getId());
		System.out.println("your name is:"+e.getName());
	}

}
