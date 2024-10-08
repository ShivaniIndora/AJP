import java.util.Scanner;
class IsVowel
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the character: ");
		char ch = sc.next().charAt(0);
		char ch1 = Character.toLowerCase(ch);
		String result=(ch1=='a'||ch1=='e'||ch1=='i'||ch1=='o'||ch1=='u')?"Vowel":"Not Vowel";
		System.out.println("Character is "+result);
	}
}