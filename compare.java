package strings;
import java.util.*;
public class compare {

	public static void main(String[] args) 
	{
		comparision of two strings
		 s1>s2:+ve value
		 s1=s2:0
		s1<s2:-ve value
				System.out.println("enter first name");
	firstname=shubham.next();
		System.out.println("enter last name");
		lastname=shubham.next();
		if(firstname.compareTo(lastname)==0)
		{
			//System.out.println("String are equl");
		}
		else 
		{
			System.out.println("Strings are not equal");
		}
		
		if(firstname==lastname)
		{
			System.out.println("String are equl");
		}
		else 
		{
			System.out.println("Strings are not equal");
		}
		String sentence="this is my laptop";
		String name=sentence.substring(6);
		System.out.println(name);
	}

}
