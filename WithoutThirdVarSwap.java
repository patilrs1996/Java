import java.util.*;
public class WithoutThirdVarSwap
{
	public static void main(String args[])
	{
		System.out.println("Enter first number :");
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();
		System.out.println("Enter  Second number :");
		int n2=sc.nextInt();
		System.out.println("Before Swapping :"+n1+" "+n2);
		n1=n1+n2;  //n1=n1*n2;
		n2=n1-n2;  //n2=n1/n2;
		n1=n1-n2;  //n2=n1/n2;
		System.out.println("After Swapping :"+n1+" "+n2);
	}
}