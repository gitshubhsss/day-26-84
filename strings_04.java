package strings;
import java.util.*;
public class strings_04 {

	public static void main(String[] args)
	{
		//count the total numbers of digits from the strings
		String line;
		
		Scanner shubham=new Scanner(System.in);
		System.out.println("enter the line");
		line=shubham.nextLine();
		int i,count=0;
		for(i=0;i<=line.length();i++)
		{
			 char ch=line.charAt(i);
			 
			if(ch==0)
			{
				
				count++;
			}
		}
		System.out.println(" "+count);
		
		
		
	}

}
