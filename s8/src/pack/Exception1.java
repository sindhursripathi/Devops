package pack;
	import java.*;


	public class Exception1
	{
		public static void main(String com[])
		
			{
			try
			{
				
		
				int a,b,c;
			
				System.out.println("enter a and b value)");
				a=Integer.parseInt(com[0]);
				b=Integer.parseInt(com[1]);
				c=a/b;
				System.out.println("result:+c");
				
				}
		catch(ArithmeticException e)
		
		{
			System.out.println("error: try with some other inputs instead of zero");
		}		
			}
			
			

		
		




}
