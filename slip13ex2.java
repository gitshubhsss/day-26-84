package strings;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.*;
public class slip13ex2 {

	public static void main(String[] args) 
	{
	   SimpleDateFormat sdf1=new SimpleDateFormat("dd/mm/yyyy");
	   Date date=new Date();
	   String cal=sdf1.format(date);
	   System.out.println("cureent date is:"+cal);
	   
	   SimpleDateFormat sdf2=new SimpleDateFormat("MM/dd/yyyy");
	   String month=sdf2.format(date);
	   System.out.println("current date is:"+month);
		
	   SimpleDateFormat sdf3 = new SimpleDateFormat("EEEEE MMMMM dd yyyy"); 
	   String year= sdf3.format(date); 
	   System.out.println("current date is :"+year); 
	   
	   SimpleDateFormat sdf4=new SimpleDateFormat("EEEEE MMMMM dd HH:mm:ss z yyyy");
	   String divas=sdf4.format(date);
	   System.out.println("cureent date is :"+divas);

	   SimpleDateFormat sdf5=new SimpleDateFormat("dd/MM/yyyy HH:mm:ss a +0530");
	   String ratra=sdf5.format(date);
	   System.out.println("cureent date is:"+ratra);
	}

}
