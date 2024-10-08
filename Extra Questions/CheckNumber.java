import java.util.Scanner;
class CheckNumber
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num = sc.nextInt();
		String result=(num>0)?"Positive":"Negative";
		System.out.println("Number is "+result);
	}
}