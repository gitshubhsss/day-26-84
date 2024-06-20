package strings;
import java.util.*;
public class strings_1 {

	public static void main(String[] args)
	{
		Scanner shubham=new Scanner(System.in);
        //concatination
		 String firstname,lastname,fullname;
		 System.out.println("enter first name");
		 firstname=shubham.next();
		 System.out.println("enter second name");
		 lastname=shubham.next();
		 fullname=firstname + " "+lastname;
		 System.out.println("full name :"+fullname);
		 //lengh
	     System.out.println("leght of the string "+fullname.length());
	     //charAt
	     for(int i=0;i<fullname.length();i++)
	     {
	    	 System.out.println(fullname.charAt(i));
	     }
	} 

}
