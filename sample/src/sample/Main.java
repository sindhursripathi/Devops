package sample;
import java.util.*;
public class Main {
	public String say()
	{
		return "helloworld";
		
	}
public static String reverseWord(String str)
{
StringBuilder result=new StringBuilder();
StringTokenizer tokenizer=new StringTokenizer(str," ");
while(tokenizer.hasMoreTokens())	
{
StringBuilder sb=new StringBuilder();
sb.append(tokenizer.nextToken());
sb.reverse();
result.append(sb);
result.append(" ");
}
return result.toString();

}
}
