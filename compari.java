package strings;
import java.util.*;
public class compari {

	public static void main(String[] args)
	{
		Scanner shubham=new Scanner(System.in);
	     System.out.println("Enter 1 string");
	     String str=shubham.next();  
	     System.out.println("Enter 2 string which u want to check");
	     String str1=shubham.next();  
	             if(str.contains(str1)) 
	             {  
	                 System.out.println(str1+" is contains in "+str);  
	             }
	            else  
	                System.out.println(str1+" is not contains in "+str);      
   }  

	}


