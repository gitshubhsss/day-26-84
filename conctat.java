package strings;
import java.util.*;
public class conctat {

	public static void main(String[] args) {
		Scanner shubham=new Scanner(System.in);
		System.out.println("Enter 2 string");
		String string1=shubham.next();
		String string2=shubham.next();
		string1=string1.concat(string2);
		System.out.println("Concatenated String="+string1);
		
	}

}
