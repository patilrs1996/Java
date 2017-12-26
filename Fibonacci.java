import java.util.*;
public class Fibonacci
{
	public static void main(String args[])
	{
		int fno=0,sno=1,res;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter num :");
		int n=sc.nextInt();
		System.out.println("\n Fibonacci Series is :");
		for(int i=0;i<n;i++)
		{
			System.out.println(fno);
			res=fno+sno;
			fno=sno;
			sno=res;
			
			
		}

	}
}

*******************OUTPUT*********************

F:\Java>java Fibonacci
Enter num :
8

 Fibonacci Series is :
0
1
1
2
3
5
8
13