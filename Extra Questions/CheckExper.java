//Wap to check the experience of an employee, if exp is greater than 20 years then calculate bonus=20% salary, else calculate bonus = 10% of salary.

import java.util.Scanner;
class CheckExper
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the experience:");
		int exp = sc.nextInt();
		System.out.print("Enter the salary:");
		int sal = sc.nextInt();
		double bonus;
		bonus=(exp>20)?sal*0.20:sal*0.10;
		System.out.println("bonus:"+bonus);
	}
}