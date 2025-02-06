package Conditional;

import java.util.Scanner;

/*
 * Write a program to calculate the bill for using an internet-cafe: 
First hour: ₹50. 
2–5 hours: ₹40/hour. 
Beyond 5 hours: ₹30/hour. 
Add a 5% surcharge for weekend usage. 
 */
public class InternetCafeBillCalculator {
	public static void main(String[] args) {
		double bill=0;
		System.out.println("Enter the number of hour used! ");
		Scanner sc=new Scanner(System.in);
		int  hour=sc.nextInt();
		System.out.println("Is it a Weekend? yes/no?");
		String isWeekend=sc.next().toLowerCase();
		
		if(hour==1)
			bill=50.0;
		
		else if(hour>=2 && hour<=5)
			bill=50+(hour-1)*40;
		
		else if(hour>5)
			bill= 50 + 40*5+ (hour-5)*30;// beyond the 5 hours 
		
		if(isWeekend.equals("yes"))
		{
			Double surCharge= bill*0.05;
			bill= bill+ bill + surCharge;
		}
		
		System.out.printf("Total Bill: ₹%.2f\n", bill);
		sc.close();
		
	}
}
