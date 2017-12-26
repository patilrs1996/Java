import java.util.*;
public class AltArrayAdd
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array :");
		int n=sc.nextInt();
		System.out.println("Enter array Elements:");
		int a[]=new int[10];
		int i,add=0,sum=0;
		for( i=0;i<n;i++)
		{
			a[i]=sc.nextInt();	
		}
		System.out.println("Addition of alternate array elements is :");
		for( i=0;i<n/2;i++)
		{
			add=a[i]+a[i+2];
			sum=sum+add;
		}
		System.out.println(sum);
			
	}
}

*********************OUTPUT***********************

F:\Java>java AltArrayAdd
Enter size of array :
5
Enter array Elements:
2
3
4
5
6
Addition of alternate array elements is :
14


**********************************************

Addition of a[0]+a[0+2]    => 2+4=6     
                               +
Addition of a[1]+a[1+3]    => 3+5=8
                               =
                              14
--------------------------------------------

