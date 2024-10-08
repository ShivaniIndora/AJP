import java.util.Scanner;
class CheckCharCase
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the character: ");
		char ch = sc.next().charAt(0);
		String result=(ch>='A'&&ch<='Z')?"UpperCase":"LowerCase";
		System.out.println("Character is in "+result);
	}
}