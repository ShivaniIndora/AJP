import java.util.Scanner;
class CheckVote
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Age: ");
		int age = sc.nextInt();
		String result=(age>=18)?"Can Vote":"Cannot Vote";
		System.out.println("Person "+result);
	}
}