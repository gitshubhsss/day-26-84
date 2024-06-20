package strings;
import java.util.*;
public class strings05 {
	public static void main(String []args)
	{

		String line;
		char ch;
		
		Scanner shubham=new Scanner(System.in);
		System.out.println("Enter string ");
		line=shubham.nextLine();
		for(int i=0;i<=line.length()-1;i++)
		{
			 ch=line.charAt(i);
			 if(ch>='A'&&ch<='Z')
			 {
				 ch=(char)(ch+32);
				 System.out.println(""+ch);
				 
			 }
			 else if(ch>='a'&&ch<='z')
			 {
				 ch=(char)(ch-32);
				 System.out.println(""+ch);
			 }
			
			
		}
		

	}
}
