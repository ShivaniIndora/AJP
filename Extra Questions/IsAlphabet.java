import java.util.Scanner;
class IsAlphabet
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the character: ");
		char ch = sc.next().charAt(0);
		String result1=((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z'))?"Alphabet":"Not Alphabet";
		System.out.println("Character is "+result1);
		String result2=(result1=="Alphabet")?(Character.isUpperCase(ch))?"UpperCase":"LowerCase":"Not Alphabet";
		System.out.println("Character is in "+result2);
		char result3=(result2=="UpperCase")?Character.toLowerCase(ch):ch;
		System.out.println("Character Case change to lowerCase(if UpperCase) "+result3);
		String result4=(result3=='a'||result3=='e'||result3=='i'||result3=='o'||result3=='u')?"Vowel":"Not Vowel";
		System.out.println("Character is "+result4);
	}
}