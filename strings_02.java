package strings;
import java.util.*;
public class strings_02 {

	public static void main(String[] args)
	{
		//print all the even characters from the string 
		String line;int i;
		Scanner shubham=new Scanner(System.in);
		System.out.println("enter the line");
		line=shubham.nextLine();
		for (i=0; i<line.length(); i++) //i=i+2
		{  
		     if(i%2==0)
		        System.out.println("Char at "+i+" place "+line.charAt(i));  
		   
		}
	}

}
