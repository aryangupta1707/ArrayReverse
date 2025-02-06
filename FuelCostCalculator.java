package Conditional;

import java.util.Scanner;

/*
 * Write a program to calculate the cost of fuel: 
First 5 liters: ₹100/liter. 
6–10 liters: ₹90/liter. 
Beyond 10 liters: ₹80/liter. 
Add a convenience fee of ₹50 for online payment.
 */
public class FuelCostCalculator {

	public static void main(String[] args) {
		
		System.out.println("Total Liter of fuel to be filled");
		Scanner sc =new Scanner(System.in);
		double liter=sc.nextDouble();
		double amount=0.0;
		
		System.out.println("Amount to be payed will be online or liquid cash? yes/no");
		String isOnline=sc.next().toLowerCase();
//		if(liter==1)amount=100.0;
		
		if(liter==1 || liter<=5)
		{
			amount=liter*100;
		}
		else if(liter>5 && liter<=10)
		{
			amount= (5*100)+ (liter-5)*90;
		}
		else if(liter>10)
		{
			amount= (5*100)+ (5*90)+ (liter-10)*80;
		}
		
		if(isOnline.equals("yes"))
		{	int surCharge=50;
			amount+=surCharge;
		}
		System.out.println("Total payable amount for the fuel is :"+amount);
	}

}
