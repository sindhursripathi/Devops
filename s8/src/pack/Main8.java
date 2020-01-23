package pack;
import java.util.*;
public class Main8
{
	public static void main(String[] args)
	{
		Map m=new HashMap();
		m.put("one",1);
		m.put("2","blue");
		m.put(3,"sat");
		m.put("3","mon");
		System.out.println(m);
		System.out.println(m.keySet());
		System.out.println(m.values());
		System.out.println(m.get(3));
		System.out.println(m.entrySet());
			
	}
}


