import java.util.*;
public class FourDigAdd
{
	public static void main(String[] args)
	{
		int n,r,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 4 Digit Number :");
		n=sc.nextInt();
		while(n!=0)
		{
			r=n%10;
			n=n/10;
			sum=sum+r;
		}
		System.out.println("Sum is "+sum);
	}
} 

******************OUTPUT***************

F:\Java>java FourDigAdd
Enter 4 Digit Number :
4356
Sum is 18