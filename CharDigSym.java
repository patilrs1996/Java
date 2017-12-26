import java.util.*;
public class CharDigSym
{
	public static void main(String args[])throws InputMismatchException
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("\n Enter the data :");
		String n1=sc.next();
		char c=n1.charAt(0);
		if(Character.isLetter(c))
		{
			System.out.println("Alphabet");
		}
		else if(Character.isDigit(c))
		{
			System.out.println("Digit");
		}
		else
		{
			System.out.println("Special Symbol");
		}
	}
}

*******************************OUTPUT****************************


F:\Java>java CharDigSym

 Enter the data :
43
Digit

F:\Java>java CharDigSym

 Enter the data :
@
Special Symbol

F:\Java>java CharDigSym

 Enter the data :
sed
Alphabet