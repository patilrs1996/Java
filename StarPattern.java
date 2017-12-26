/*import java.io.*;

import java.util.*;

public class StarPattern
{
 
  static public void main(String[] args)

  {

     Scanner sc=new Scanner(System.in);

     System.out.println("Enter number :");

     	for(int r=1;r<=4;r++)
	{	
			
		for(int c=1;c<=r;c++)
		{
			
			System.out.print("*");
		}
		System.out.println();
	}
   
 }

}
O/P:
*
**
***
****

*/


import java.io.*;

import java.util.*;

public class StarPattern
{
 
  static public void main(String[] args)

  {

     Scanner sc=new Scanner(System.in);

       	for(int r=0;r<4;r++)
	{	
			
		for(int c=4;c>r;c--)
		{
			
			System.out.print("*");
		}
		System.out.println();
	}
   
 }

}

O/P:
****
***
**
*