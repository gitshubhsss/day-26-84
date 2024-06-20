//Write a program to create parent class College(cno, cname, caddr) and derived class 
//Department(dno, dname) from College. Write a necessary methods to display College details.

//Write a program to create parent class College(cno, cname, caddr) and derived class 
//Department(dno, dname) from College. Write a necessary methods to display College details.

package strings;
import java.util.*;
class Collage
{
	int cno;
	String cname;
	String cadd;
	
}
class Department extends Collage
{
	int dno;
	String  dname;
	Scanner shubham=new Scanner(System.in);
	void accept()
	{
		Scanner shubham=new Scanner(System.in);
		System.out.println("Enter the collage number ");
		cno=shubham.nextInt();
		System.out.println("Enter the collage name ");
		cname=shubham.next();
		System.out.println("Enter the collage address");
		cadd=shubham.next();
		System.out.println("Enter the department number");
		dno=shubham.nextInt();
		System.out.println("Enter the department name");
		dname=shubham.next();
		
	}
	void display()
	{
		System.out.println("collage number :"+cno);
		System.out.println("collage name : "+cname);
		System.out.println("collage address : "+cadd);
		System.out.println("department number :"+dno);
		System.out.println("department name :"+dname);
	}
}
public class slip12ex1 {

	public static void main(String[] args) 
	{
		Department d1=new Department();
		d1.accept();
		d1.display();
	}

}

