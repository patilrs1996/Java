import java.util.*;

public class ArrayIndexSwap
{
	public static void main(String[] args)
	{
		int[] a={1,2,3,4};
		int temp;
		int len=a.length;
		int maxnum=0;
		System.out.println(len);
		System.out.println("Original Array");
		System.out.println();
		for(int i=0;i<len;i++)
		{	
			System.out.println("a["+i+"]->"+a[i]);
			System.out.println();
		}
		int max=a[0];
		for(int i=0;i<len;i++)
		{	
			if(a[i]>max)
			{
				max=a[i];
			}	 
			
		}
		
		try
		{
			System.out.println(maxnum);
      
			System.out.println("New Array");
			System.out.println();
			
			int i=0;				
			while(i<max)
			{
 				temp=a[i];
 				a[i]=i;
				i=temp;			
				System.out.println("a["+a[i]+"]->"+i);
				System.out.println();
					
			}
		}
		catch(ArrayIndexOutOfBoundsException ae)
		{
			System.out.println(ae);
		}
	}
}


/*
OUTPUT:

F:\Java>java ArrayIndexSwap
4
Original Array

a[0]->1

a[1]->2

a[2]->3

a[3]->4

New Array

a[2]->1

a[3]->2

a[4]->3

java.lang.ArrayIndexOutOfBoundsException: 4

F:\Java>  */