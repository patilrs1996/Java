import java.util.*;
public class NumPalindrom  
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number ");
		int n=sc.nextInt();
		int org=n;
		int r,rev=0;
		while(org!=0)
		{
			r=org%10;
			rev=rev*10+r;
			org=org/10;	
		}
		if(n==rev)
			{
			System.out.println("Number is palindrom");
			}		
		else
			{
			System.out.println("Number is not palindrom");
			}
	}
}

**************************OUTPUT************************

F:\Java>java NumPalindrom
Enter number
1234321
Number is palindrom

F:\Java>java NumPalindrom
Enter number
12345566
Number is not palindrom