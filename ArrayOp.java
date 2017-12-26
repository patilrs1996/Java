import java.util.*;
public class ArrayOp
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int[][] a=new int[10][10];
		int b[][]=new int[10][10];
		int c[][]=new int [10][10];
		
		System.out.println("Enter size of array :");
		int n1=sc.nextInt();
		
		System.out.println("Enter  array1 :");
		for(int i=0;i<n1;i++)
		{
			for(int j=0;j<n1;j++)
			{
				a[i][j]=sc.nextInt();
			}	
		}
		System.out.println("Enter  array2 :");
		for(int k=0;k<n1;k++)
		{
			for(int l=0;l<n1;l++)
			{
				b[k][l]=sc.nextInt();
			}	
		}
		System.out.println("Addition of Two arrays is :");
		for(int m=0;m<n1;m++)
		{
			for(int n=0;n<n1;n++)
			{
				c[m][n]=a[m][n]+b[m][n];
				System.out.println(c[m][n]);
			}	
		}
		
	}
}

**************************OUTPUT*************************



F:\Java>java ArrayOp
Enter size of array :
3
Enter  array1 :
1
2
3
4
5
6
7
8
9
Enter  array2 :
10
23
4
52
31
3
67
54
21
Addition of Two arrays i
11
25
7
56
36
9
74
62
30