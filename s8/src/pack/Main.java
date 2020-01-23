package pack;
import java.util.*;

public class Main {
	public static void main(String args[])
	{	
		try
		{
		int a,b,c;
		Scanner s=new Scanner(System.in);
		a=s.nextInt();
		b=s.nextInt();
		c=a/b;
		System.out.println("result:"+c);
		System.out.println("enter a and b value");
		
		}
		catch(Exception e)
	
		{
			System.out.println("error: try with some other inputs instead of zero");
		}
		
	}

}
