import java.util.*;
public class NumberConversion
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter decimal number :");
		int n=sc.nextInt();

		System.out.println("In Binary Format:");
		String binary=Integer.toBinaryString(n);
		System.out.println(binary);

		System.out.println("In Hex Format:");
		String hex=Integer.toHexString(n);
		System.out.println(hex);

		System.out.println("In Ocatal Format:");
		String octal=Integer.toOctalString(n);
		System.out.println(octal);

		System.out.println("Enter Hexadecimal number :");
		int n1=sc.nextInt();

		System.out.println("In Binary Format:");
		String binary1=Integer.toBinaryString(n1);
		System.out.println(binary1);

		System.out.println("In Ocatal Format:");
		String octal1=Integer.toOctalString(n1);
		System.out.println(octal1);

		
		System.out.println("Enter Octal number :");
		int n2=sc.nextInt();

		System.out.println("In Binary Format:");
		String binary3=Integer.toBinaryString(n2);
		System.out.println(binary1);

		System.out.println("In Hexadecimal Format:");
		String hex2=Integer.toHexString(n2);
		System.out.println(octal1);

	}
}