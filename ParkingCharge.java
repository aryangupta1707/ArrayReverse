package Conditional;

import java.util.Scanner;

/*
 * Write a program to calculate the parking fee based on the 
duration of parking: 
First 2 hours: ₹20/hour. 
3–5 hours: ₹30/hour. 
More than 5 hours: ₹50/hour. 
If the total fee exceeds ₹300, give a 10% discount.
 */
public class ParkingCharge {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the total number of the hours to calculate the charge, for Parking");
		double hour=sc.nextDouble();
		double fee=0;
		
		if(hour<=2)
		{
			fee=hour*20;
		}
		else if(hour>2 && hour<=5)
		{
			fee= 20*2 + (hour-2)*30;
		}
		else if(hour>5)
		{
			fee =40 +90 +(hour-5)*50;
		}
		
		if(fee>=300)
		{
			fee= fee- (fee* 10/100);
		}
		System.out.println("Total Payable fee for "+ hour +" is : "+fee);
		
		
		
	}

}
