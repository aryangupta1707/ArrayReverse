package Conditional;

public class WaterBill {
	/*
	 * Write a program to calculate the water bill: For the first 50 liters:
	 * ₹2/liter. For 51–150 liters: ₹5/liter. Above 150 liters: ₹8/liter. Add a late
	 * payment sur-charge of 10% if the bill exceeds ₹800.
	 */
	public static void main(String[] args) {
		double liters=300;
		
		if(liters<=50)
		{
			System.out.println("Total amount for "+liters +" of water is : "+liters*2);
		}
		else if(liters>50 && liters<=150)
		{
			System.out.println("Total amount for "+liters +" of water is : "+((50*2)+((liters-50)*5)));
		}
		else if(liters>150)
		{
			double amount=((50*2)+(100*5)+((liters-150)*8));
			if(amount>800)	{	
				amount=amount+amount*(10.0/100.0);
			System.out.println("Total amount for "+liters +" of water is : "+amount);
			}
			else System.out.println("Total amount for "+liters +" of water is : "+amount);
		}
	}

}
