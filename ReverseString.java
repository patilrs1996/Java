import java.util.*;
import java.text.*;
public class ReverseString
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String :");	
		String str=sc.nextLine();
		String str1="";
	
		char ch;
		int len=str.length();
	
		for(int i=len-1;i>=0;i--)
		{
			ch=str.charAt(i);
			str1=str1+ch;	
			
		}
		System.out.println("Reverse String :");	
		System.out.println(str1);
		
		int chr='a';  //ASCII values can be displayed
		System.out.println(chr);
		SimpleDateFormat sdt=new SimpleDateFormat("HH:mm:ss.SSS");
		System.out.println("Current system time is :"+sdt.format(System.currentTimeMillis()));
	}
}

***********************OUTPUT****************

F:\Java>javac ReverseString.java

F:\Java>java ReverseString
Enter String :
ABCDEFG
Reverse String :
GFEDCBA
97
Current system time is :11:33:51.915