package pack;

 class MyException  extends Exception
 {
	int a,b;
	
	MyException(int a,int b)
	{
		this.a=a;
		this.b=b;

	}
public String Tostring()
{
return "error:the value should not be greater than 20";

}
 }
public class Exception2 {
	public static void calculate(int a,int b) throws Exception
	{
	int sum=a+b;
	if(sum>20)
		throw new MyException(a,b);
		System.out.println("the result is "+sum);
}

public static void Exception2(String args[]) throws Exception
{
		try
		{
			calculate(3,4);
			calculate(11,15);
			
		}
		catch(MyException e)
		{
		System.out.println(e);
			
		}
	}
}


