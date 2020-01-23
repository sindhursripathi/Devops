package pack;

 class Exception2  extends Exception
 {
	int a,b;
	
	Exception2(int a,int b)
	{
		this.a=a;
		this.b=b;

	}
public String Tostring()
{
return "error:the value should not be greater than 20";

}
 }
public class MyException {
	public static void calculate(int a,int b) throws Exception
	{
	int sum=a+b;
	if(sum>20)
		throw new Exception2(a,b);
		System.out.println("the result is "+sum);
}

public static void Exception2(String args[]) throws Exception
{
		try
		{
			calculate(3,4);
			calculate(11,15);
			
		}
		catch(Exception2 e)
		{
		System.out.println(e);
			
		}
	}
}