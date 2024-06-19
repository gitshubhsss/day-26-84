package strings;
import java.util.*;
public class login {

	public static void main(String[] args) 
	{
		String user;
		String pass;
		Scanner shubham=new Scanner(System.in);
		System.out.println("enter the username and password");
		String s1=shubham.nextLine();
		String s2=shubham.nextLine();
		if(s1.equals(s2)==true)
		{
			System.out.println("enter the username");
			user=shubham.next();
		}
		else if(s2.equals(s1)==true)
		{
			System.out.println("enter the password");
			pass=shubham.next();
		}
		else if(s1.equals("shubham")==true && s2.equals("dhoni")==true)
		{
			System.out.println("Login success");
		}
		else 
		{
			System.out.println("please try again");
		}
	}

}
