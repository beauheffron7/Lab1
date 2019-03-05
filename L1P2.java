//Beau Heffron
// period 9
// 9/16/15

import java.util.Scanner;

public class L1P2
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the x coordinate of the first point:\t\t");
		double x1 = sc.nextDouble();
		System.out.print("Enter the y coordinate of the first point:\t\t");
		double y1 = sc.nextDouble();
		System.out.print("Enter the x coordinate of the second point:\t\t");
		double x2 = sc.nextDouble();
		System.out.print("Enter the y coordinate of the second point:\t\t");
		double y2 = sc.nextDouble();
		double mid1 = ((x1+x2)/2);
		double mid2 = ((y1+y2)/2);
		double slope1 = (x2-x1);
		double slope2 = (y2-y1);
		double slope3 = slope2 / slope1;
		System.out.println("The Midpoint is: (" + mid1 + "," + mid2 +")");
		System.out.println("The Slope:\t" + slope2 + "/" + slope1 );

	}

}