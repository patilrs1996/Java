

import java.util.*;

import java.lang.*;

import java.io.*;



class BubbleSort
{

	public static void main (String[] args) throws Exception

	{

		Scanner sc=new Scanner(System.in);

		BubbleSort c=new BubbleSort();

		int a[]=new int[10];

		System.out.println("Enter size of array :");

		int n=sc.nextInt();

		System.out.println("Enter array elements :");

		for(int i=0;i<n;i++)

		{

		    a[i]=sc.nextInt();

		}

		int[] d=c.bubble_sort(a,n);

		
	}

	
public int[] bubble_sort(int []a,int s)
	{

	    int temp;

	
	    for(int i=0;i<s;i++)

	    {
		for(int j=i+1;j<s;j++)
		{
			
	        	if(a[i]>a[j])

	        	{	

	            		temp=a[j];

	            		a[j]=a[i];

	            		a[i]=temp;

	        	}

		}
	    }

	
	    System.out.println("Array elements after sorting:");

		for(int i=0;i<s;i++)

		{

		    System.out.println(a[i]);

		}
	return a;
	}

}
