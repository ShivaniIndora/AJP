import java.util.Scanner;
class IsPass
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number(out of 100): ");
		int num = sc.nextInt();
		String result=(num>33)?"Pass":"Fail";
		System.out.println("Student is "+result);
	}
}