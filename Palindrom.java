import java.util.*;
public class Palindrom  
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String ");
		String str=sc.next();
		int i;
		String revstr="";
		for(i=str.length()-1;i>=0;--i)
		{
			revstr +=str.charAt(i);
		}
		if(revstr.equalsIgnoreCase(str))
			{
			System.out.println("String is palindrom");
			}		
		else
			{
			System.out.println("String is not palindrom");
			}
	}
}

************************OUTPUT**********************

F:\Java>java Palindrom
Enter String
MADAM
String is palindrom

F:\Java>java Palindrom
Enter String
GDTHSK
String is not palindrom