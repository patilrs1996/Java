import java.util.*;
public class Leap
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Year :");
		int n=sc.nextInt();
		if(n%4==0 && n%400==0)
			System.out.println("Leap");
		else
			System.out.println("Not Leap");
		
		
			
	}
}

******************OUTPUT*****************


F:\Java>java Leap
Enter Year :
1998
Not Leap

