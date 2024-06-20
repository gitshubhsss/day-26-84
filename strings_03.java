package strings;
import java.util.*;
public class strings_03 {

	public static void main(String[] args) 
	{
		//to count the number of wovels in the string
		String line;int i;
		Scanner shubham=new Scanner(System.in);
		System.out.println("enter the line");
		line=shubham.nextLine();
		int count=0;
		for(i=0;i<=line.length()-1;i++)
		{
			char ch=line.charAt(i);//we have acepted the characters from the string 
			if(ch =='a'|| ch == 'A'|| ch=='e'||ch=='E'||ch=='i'||ch=='I'||ch=='o'||ch=='O'||ch=='u'||ch=='U')
			{
				count++;
			}
			
		}
		System.out.println("total number of wovels in the strings = "+count);

	}

}
