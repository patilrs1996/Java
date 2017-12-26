import java.util.*;

import java.lang.*;

import java.io.*;


public class ZigZagSum 
{
	
public static void main (String[] args)
{
	int i,j=0,k=0;
	int randomInt=0;
	Scanner sc=new Scanner(System.in);

	int a[][]=new int[10][10];

	System.out.println("Enter array size");

	int n=sc.nextInt();
	
	System.out.println("Enter array elements:");

	for( i=0;i<n;i++)
	
	{	
	 
       		for( j=0;j<n;j++)
	     
  		{
	
             		a[i][j]=sc.nextInt();
	

	        }
	
	}	
	System.out.println("Random Number :");
	Random num=new Random();
	for(int id=0;id<n;id++)
	
{
		randomInt=num.nextInt(a.length);
		System.out.println(randomInt);	
		k=k+randomInt;
	}
	System.out.println("Sum is "+k);
}


}