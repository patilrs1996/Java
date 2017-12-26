

/*
public class Pattern
{	
	public static void main(String args[])
	{
		
	
		for( int i=7;i>=1;i--)
		{
			
			for(int j=7;j>=i;j--)
			{
				System.out.print(j);	
			}
			
			System.out.println();
		}
		
	}
}
O/P

7
76
765
7654
76543
765432
7654321

public class Pattern
{	
	public static void main(String args[])
	{
		
	
		for( int i=1;i<=7;i++)
		{
			
			for(int j=7;j>=i;j--)
			{
				System.out.print(j);	
			}
			
			System.out.println();
		}
		
	}
}
O/P
7654321
765432
76543
7654
765
76
7

public class Pattern
{	
	public static void main(String args[])
	{
		
	
		for( int i=7;i>=1;i--)
		{
			
			for(int j=1;j<=i;j++ )
			{
				System.out.print(j);	
			}
			
			System.out.println();
		}
		
	}
}
O/P

1234567
123456
12345
1234
123
12
1
public class Pattern
{	
	public static void main(String args[])
	{
		
		for( int i=1;i<=7;i++)
		{
			
			for(int j=1;j<=i;j++ )
			{
				System.out.print(j);	
			}
			
			System.out.println();
		}
		for( int i=6;i>=1;i--)
		{
			
			for(int j=1;j<=i;j++ )
			{
				System.out.print(j);	
			}
			
			System.out.println();
		}
		
	}
}
O/P

1
12
123
1234
12345
123456
1234567
123456
12345
1234
123
12
1



public class Pattern
{	
	public static void main(String args[])
	{
		
		for( int i=1;i<=7;i++)
		{
			
			for(int j=1;j<=i;j++ )
			{
				System.out.print(i);	
			}
			System.out.println();
		}
		
		
	}
}

O/P

1
22
333
4444
55555
666666
7777777


public class Pattern
{	
	public static void main(String args[])
	{
		
		for( int i=1;i<=7;i++)
		{
			
			for(int j=1;j<=7-i;j++ )
			{
				System.out.print(1);	
			}
			for(int j=1;j<=i;j++ )
			{
				System.out.print(i);	
			}
			System.out.println();
		}
		
		
	}
}

O/P

1111111
1111122
1111333
1114444
1155555
1666666
7777777

public class Pattern
{	
	public static void main(String args[])
	{
		
		for( int i=1;i<=7;i++)
		{
			
			for(int j=1;j<=i;j++ )
			{
				System.out.print(j);	
			}
			System.out.println();
		}
		
		
	}
}
O/P:

1
12
123
1234
12345
123456
1234567

*/
import java.util.*;
public class Pattern
{	
	public static void main(String args[])
	{
		int i,j,n,num=1;
		System.out.println("Enter number :");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		for( i=1;i<=n;i++)
		{
			
			for( j=1;j<=i;j++)
			{
				if(j!=1)
				{
					System.out.print("*");
				}
				System.out.print(num+"\t");
				num=num+1;
			}
			System.out.println();
		}
		System.out.println();
		num=num-1;
		for( i=n;i>=1;i--)
		{
			
			for( j=1;j<=i;j++)
			{
				if(j!=1)
				{
					System.out.print("*");
				}
				System.out.print(num+"\t");
				num=num-1;
			}
			System.out.println();
		}

		
		
	}
}

/*
F:\Java>javac Pattern.java

F:\Java>java Pattern
Enter number :
5
1
2       *3
4       *5      *6
7       *8      *9      *10
11      *12     *13     *14     *15

15      *14     *13     *12     *11
10      *9      *8      *7
6       *5      *4
3       *2
1


F:\Java>java Pattern
Enter number :
7
1
2       *3
4       *5      *6
7       *8      *9      *10
11      *12     *13     *14     *15
16      *17     *18     *19     *20     *21
22      *23     *24     *25     *26     *27     *28

28      *27     *26     *25     *24     *23     *22
21      *20     *19     *18     *17     *16
15      *14     *13     *12     *11
10      *9      *8      *7
6       *5      *4
3       *2
1


  public class Pattern
{	
	public static void main(String args[])
	{
		int i,j;
		for(i=1;i<=6;i++)
		{
			
			for(j=i;j<=6;j++)
			{
				System.out.print(i);
			}
			System.out.println();
		}
	}
}

O/P:

F:\Java>java Pattern
111111
22222
3333
444
55
6

*/


