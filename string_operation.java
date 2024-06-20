package strings;
import java.util.*;
public class string_operation {

	public static void main(String[] args)
	{
		//accept n numbers of conrtys and display it in a assending order 
		String name;
		int i,n,j;
		String temp;
		Scanner shubham=new Scanner(System.in);
		System.out.println("Enter the number of records");
		n=shubham.nextInt();
		System.out.println("Enter "+n+" number of contries");
		String str[]=new String[n];
		for(i=0;i<n;i++)
		{
			str[i]=shubham.next();//String accept
		}
		System.out.println("Unsorted contries are");
		for(i=0;i<n;i++)
		{
			System.out.println("\t"+str[i]);
		}
		System.out.println("Sorted contries ");
		for(i=0;i<n;i++)
		{
			for(j=i+1;j<n;j++)
			{
				if(str[i].compareTo(str[j])>0)
				{
					temp=str[i];
					str[i]=str[j];
					str[j]=temp;
				}
			}
		}
		for(i=0;i<n;i++)
		{
			System.out.println("\t"+str[i]);
		}
}
}
