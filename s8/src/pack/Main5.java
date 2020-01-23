package pack;

public class Main5 {
	public static void main(String[] args)
	{
		try
		{
		function1();
		System.out.println("a");
		}
		catch(RuntimeException e)
		{
			System.out.println("b");
		}
		catch(Exception e)
		{
			System.out.println("c");
		}
		finally
		{
			System.out.println("d");	
		}
	}
		public static void function1()
		{
			throw new RuntimeException();
		}
	}


