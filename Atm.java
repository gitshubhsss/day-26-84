package strings;
import java.util.*;
public class Atm {

	public static void main(String[] args) {
//		i/p 
//		cpin=1234,camount=10000
//		pin,a/c type,choice,amount
//		pin,switch(a/c type),switch(show balance,withdrwal,deposite),amount
        
		int cpin=1234,pin,newpin;
		int camount=10000;
		int amount,deductedamount,remainsamount;
		int ch;
		int deposite,totalbalance;
		Scanner shubham=new Scanner(System.in);
		System.out.println("please enter your pin");
		pin=shubham.nextInt();
		if(pin==cpin)
		{
			
		do
		{
			
			System.out.println("welcome : ");
			System.out.println("1:check balance\n2:widrawal\n3:deposite\n4:account type\n5:change pin");
			System.out.println("enter your choise");
			ch=shubham.nextInt();
			
			switch(ch)
			{
			case 1:System.out.println("balance :"+camount);
			break;
			case 2:System.out.println("Enter the amount ");
			       amount=shubham.nextInt();
			       if(amount>10000)
			       {
			    	   System.out.println("insufficient balanse");
			       }
			       else
			       {
			       System.out.println("deducted amount ="+amount);
			       remainsamount=camount-amount;
			       System.out.println("remains amount ="+remainsamount);
			       }
			       
			       
			       break;
			case 3:System.out.println("Enter the deposite amount");
			       deposite=shubham.nextInt();
			       System.out.println(deposite+": has been credited");
			       totalbalance=camount+deposite;
			       System.out.println(totalbalance+": is your total balance");
			       break;
			case 4 : 
				do
			{
				System.out.println("1: saving\n2:current");
				ch=shubham.nextInt();
				switch(ch)
				{
				case 1:System.out.println("your acount is saving");
				break;
				
				case 2:System.out.println("your acount is current");
				break;
				}
			}while(ch>=2);
			case 5:System.out.println("please enter the pin");
			      cpin=shubham.nextInt();
			      if(cpin==1234)
			      {
			    	  System.out.println("enter the new pin");
			    	  newpin=shubham.nextInt();
			    	  System.out.println("your pin chage succesfully\nnew pin - "+newpin);
			    	  
			      }
			      else {
			    	  System.out.println("invalid pin");
			      }
			      break;
			
			}
			
		}while(ch>=6);
	}
		else 
		{
			System.out.println("invalid pin");
		}

}
}


