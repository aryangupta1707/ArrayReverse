package Conditional;

public class IncomeTax {
	public static void main(String[] args) {
		
		double income=1200000;
		
		if(income<=250000)
		{
			System.out.println("No Tax ");
		}
		else if(income>250000 && income<=500000)
		{
			/*
			 * Always remember 
			 * CASE 1:
			 *  if numerator is less than Denominator
			 *  the answer is always 0 zero. instead we will use double or floating value.
			 *  
			 */
			System.out.println("Income is : "+income+ " Total 5% Payable Tax is: "+ income*(5.0/100.0));
		}
		else if(income>500000 && income <=1000000)
		{
			System.out.println("Income is : "+income+ " Total 20% Payable Tax is: "+ income*(20.0/100.0));
		}
		else 
			//include sur-charge of 10% extra on the income
			System.out.println("Income is : "+income+ " Total 30% Payable Tax along with 10% surcharge Tax is: "+ income*(40.0/100.0));
		
	}
}
