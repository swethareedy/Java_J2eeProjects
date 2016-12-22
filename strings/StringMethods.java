package strings;

import java.util.Scanner;

public class StringMethods 
{
	public static void main(String args[])
	{
		// intilizing a value for string1
		System.out.println("enter a value for str1");
		Scanner sc=new Scanner(System.in);
		String str1=sc.next();
		System.out.println("the value of str1 is:"+str1);
		
		// intilizing a value for string2
		System.out.println("enter a value for str2");
		Scanner sc1=new Scanner(System.in);
		String str2=sc.next();
		System.out.println("the value of str2 is:"+str2);
		
		// intilizing a value for string3
		System.out.println("enter a value for str3");
		Scanner sc2=new Scanner(System.in);
		String str3=sc.next();
		System.out.println("the value of str3 is:"+str3);
		
		// intilizing a value for string4
		System.out.println("enter a value for str4");
		Scanner sc3=new Scanner(System.in);
		String str4=sc.next();
		System.out.println("the value of str4 is:"+str4);
				
		System.out.println(".................");
		System.out.println(".................");
		
		// charAt()
		System.out.println("charAt method");
		char ch=str1.charAt(4);//returns the char value at the 4th index  
		System.out.println("the value at 4th position is:"+ch); 
		char ch1=str2.charAt(0);//returns the char value at the 0th index  
		System.out.println("the value at 0th position is:"+ch1); 
		
		System.out.println(".................");
		System.out.println(".................");
		
		//compareTo()
		System.out.println("compareTo method");
		System.out.println(str1.compareTo(str2));
		System.out.println(str2.compareTo(str3));
		System.out.println(str3.compareTo(str4));
		System.out.println(str4.compareTo(str1));

		System.out.println(".................");
		System.out.println(".................");
		
		//concat()
		System.out.println("concat method");
		String str5=str3.concat(str4);
		System.out.println("the value after concatination is:"+str5);

		System.out.println(".................");
		System.out.println(".................");
		
		//contains()
		System.out.println("contains method");
		String str6="dhatri info solutions at madhapur";
		System.out.println(str6.contains("dhatri"));  
		System.out.println(str1.contains("pinky"));  
		System.out.println(str6.contains("at madhapur"));

		System.out.println(".................");
		System.out.println(".................");
		
		//endsWith()
		System.out.println("endsWith method");
		System.out.println(str6.endsWith("r"));
		System.out.println(str6.endsWith("madhapur"));
		System.out.println(str1.endsWith("e"));  

		System.out.println(".................");
		System.out.println(".................");
		
		//equals()
		System.out.println("equals method");
		String str7="SWETHA";  
		System.out.println(str1.equals(str2));//true because content and case is same  
		System.out.println(str1.equals(str7));//false because case is not same  
		System.out.println(str1.equals(str4));//false because content is not same  

		System.out.println(".................");
		System.out.println(".................");
		
		//equalsIgnoreCase()
		System.out.println("equalsIgnoreCase method");
		System.out.println(str1.equalsIgnoreCase(str2));//true because content and case both are same  
		System.out.println(str1.equalsIgnoreCase(str7));//true because case is ignored  
		System.out.println(str1.equalsIgnoreCase(str4));//false because content is not same 

		System.out.println(".................");
		System.out.println(".................");
		
		//isEmpty()
		System.out.println("isEmpty method");
		String str8="";
		System.out.println(str1.isEmpty());  
		System.out.println(str8.isEmpty()); 

		System.out.println(".................");
		System.out.println(".................");
		
		//lastIndexOf()
		System.out.println("lastIndexOf method");
		System.out.println(str6.lastIndexOf('s'));

		System.out.println(".................");
		System.out.println(".................");
		
		//length()
		System.out.println("length method");
		System.out.println("string length is: "+str1.length());// is the length of str1 string  
		System.out.println("string length is: "+str6.length());// is the length of str6 string

		System.out.println(".................");
		System.out.println(".................");
		
		//replace()
		System.out.println("replace method");
		String str9="welcome to dhatri info soln at madhapur";  
		String str10=str9.replace('a','e');//replaces all occurrences of 'a' to 'e'  
		String str11=str9.replace("to","at");
		System.out.println(str10); 
		System.out.println(str11); 

		System.out.println(".................");
		System.out.println(".................");
		
		//startsWith()
		System.out.println("startsWith method");
		System.out.println(str9.startsWith("we"));  
		System.out.println(str9.startsWith("welcome")); 
		System.out.println(str9.startsWith("java"));

		System.out.println(".................");
		System.out.println(".................");
		
		//subString()
		System.out.println("subString method");
		System.out.println(str9.substring(2,10));
		System.out.println(str9.substring(0)); 

		System.out.println(".................");
		System.out.println(".................");
		
		//toLowercase()
		System.out.println("toLowerCase method");
		String str12=str7.toLowerCase();  
		System.out.println(str12); 

		System.out.println(".................");
		System.out.println(".................");
		
		//toUppercase()
		System.out.println("toUpperCase method");
		String str13=str9.toUpperCase();  
		System.out.println(str13);  

		System.out.println(".................");
		System.out.println(".................");
		
		//trim()
		System.out.println("trim method");
		System.out.println(str9+"  oop dmart lane");//without trim()  
		System.out.println(str9.trim()+"oop dmart lane");//with trim()

		System.out.println(".................");
		System.out.println(".................");
		
		//valueOf()
		System.out.println("valueOf method");
		String str14="working" ;
		String str15=String.valueOf(str14);  
		System.out.println(str1+str15);//concatenating string str1 with string str14 and storing in string str15

		System.out.println(".................");
		System.out.println(".................");
		
		//toCharArray()
		System.out.println("toCharArray method");
		char[] ch11=str9.toCharArray();  
		for(int i=0;i<ch11.length;i++)
		{  
		System.out.print(ch11[i]); 
		}	
		System.out.println(".................");
		System.out.println(".................");
				
		}
		

}
