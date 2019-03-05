//Beau Heffron
// Period 9
// 9/11/15

import java.util.Scanner;

public class L1P1
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("What is your first name? ");
		String Fname = sc.nextLine();
		System.out.print("What is your last name? ");
		String Lname = sc.nextLine();
		System.out.print("What is your Employee number? ");
		String Enum = sc.nextLine();
		System.out.print("What is your rate of pay? ");
		int Rpay = sc.nextInt();
		System.out.print("How many hours do you work? ");
		int hours = sc.nextInt();
		Double weekP = Rpay * ((double)hours);

		System.out.println("\nEmployee Name:\t\t" + Lname + ", " + Fname);
		System.out.println("Employee Number:\t" + Enum);
		System.out.println("Rate of pay:\t\t" + Rpay);
		System.out.println("Hours worked:\t\t" + hours);
		System.out.println("This week's pay:\t"+ weekP +" ");
	}


}