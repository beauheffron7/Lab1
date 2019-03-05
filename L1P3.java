//Beau Heffron
//9/17/15
//Period 9

import java.util.Scanner;

public class L1P3
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number of seconds:\t\t");
		int seconds = sc.nextInt();
		System.out.print("This equates to;\n");
		double seconds1 = (seconds - seconds%60);
		double minutes = (seconds-seconds%60)/60;
		double hours = (minutes-minutes%60)/60;
		double days = (hours-hours%24)/24;
		seconds1 = seconds%60;
		minutes=minutes%60;
		System.out.print(days + " days\n" + hours + " hours\n" + minutes + " minutes\n" + seconds1 + " seconds\n");



	}


}