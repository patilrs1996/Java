import java.io.*;
import java.util.*;
public class Factorial	
{
	static public void main(String args[])throws IOException
	{
		int fact=1;
		Scanner sc=new Scanner(System.in);  
		System.out.println("\n Enter num :");
		int n1=sc.nextInt();
		for(int i=1;i<=n1;i++)
		{
			fact=fact*i;
		}
	System.out.println("\n Factorial is :"+fact);
	}
}

********************OUTPUT*******************

F:\Java>java Factorial

 Enter num :
5

 Factorial is :120

F:\Java>java Factorial

 Enter num :
4

 Factorial is :24