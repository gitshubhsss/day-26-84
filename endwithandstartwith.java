package strings;
import java.util.*;
public class endwithandstartwith {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
	     System.out.println("Enter 1 string");
	     String str=sc.next();  
	     System.out.println("Enter 2 string which u want to check");
	     String str1=sc.next();  
       if(str.startsWith(str1)) 

           	System.out.println("String starts with "+str1);       
      else 
	System.out.println("String not  starts with "+str1);  


 if(str.endsWith(".")) 
	
           System.out.println("String ends with  fullstop");  
       	
else 
	System.out.println("String not  ends with  fullstop ");  
   }  
		
	

}
