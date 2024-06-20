package strings;
import java.util.*;

public class strings_01 {

	public static void main(String[] args) 
	{
		String str;int i;
		System.out.println("Enter the String ");
		Scanner shubham=new Scanner(System.in);
		str=shubham.nextLine();
		for(i=0;i<=str.length();i++)
		{
			System.out.println(str.charAt(i));
		}

	}

}
