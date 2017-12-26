import java.util.*;
public class Amstrom
{
	public static void main(String args[])
	{
    int c=0,a,temp;
    System.out.println("Enter number:");
    Scanner sc=new Scanner(System.in);  
    int n=sc.nextInt();  
    temp=n;  
    while(n!=0)  
    {  
    a=n%10;  
    n=n/10;  
    c=c+(a*a*a);  
    }  
    if(temp==c)  
    System.out.println("armstrong number");   
    else  
        System.out.println("Not armstrong number");   
	}
}

************************OUTPUT****************************

F:\Java>java Amstrom
Enter number:
153
armstrong number

F:\Java>java Amstrom
Enter number:
165
Not armstrong number