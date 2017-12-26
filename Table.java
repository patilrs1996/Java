import java.io.*;

import java.util.*;

public class Table
{
 
  static public void main(String[] args)

  {

     Scanner sc=new Scanner(System.in);

     System.out.println("Enter number :");

     int n=sc.nextInt();

      System.out.println("Table of "+n+"is \n");
     for(int j=1;j<=10;j++)

     {

        int k=n*j
;            	    	System.out.println(n+"*"+j+"="+k);
   
   }
   
 }

}

***********************OUTPUT*******************

F:\Java>java Table
Enter number :
4
Table of 4is

4*1=4
4*2=8
4*3=12
4*4=16
4*5=20
4*6=24
4*7=28
4*8=32
4*9=36
4*10=40