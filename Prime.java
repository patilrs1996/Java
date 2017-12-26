import java.util.*;
public class Prime
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number :");
		int n=sc.nextInt();
		int flag=0;
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
			{
			 flag=1;break;	
			}
			
		}
		if(flag==1)
			System.out.println("Not prime");
		else
			System.out.println("Prime");
			
	}
}

**********************OUTPUT********************

F:\Java>java Prime
Enter number :
12
Not prime

F:\Java>java Prime
Enter number :
23
Prime