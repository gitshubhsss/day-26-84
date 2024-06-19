package strings;
import java.util.*;
public class compare01 {

	public static void main(String[] args) 
	{
//		if s1 > s2, it returns positive number  
//		if s1 < s2, it returns negative number  
//		if s1 == s2, it returns 0
		
		Scanner shubham=new Scanner(System.in);
		System.out.println("enter two strings ");
		String s1=shubham.nextLine();
		String s2=shubham.nextLine();
		if(s1.compareTo(s2)==0)
		{
			System.out.println("both are equals");
		}
		else if(s1.compareTo(s2)>0)
		{
			System.out.println(s1 +"greater than "+s2);
			
		}
		else 
		{
			System.out.println("s2>s1");
		}

	}

}
