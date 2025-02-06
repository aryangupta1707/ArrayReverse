package Conditional;

public class ElectricityBill {
	public static void main(String[] args) {
		double unit=780;
		double surcharge=unit*0.2;
		double c1=0.5;
		double c2=0.75;
		double c3=1.20;
		double c4=1.5;
		if(unit<=50)
		{
			System.out.println((unit*c1)+surcharge);
		}
		else if(unit>50 && unit<=200)
			{System.out.println((50*c1 + (unit-50)*c2)+surcharge);		}
		else if(unit>200 && unit<=450)
		{
			System.out.println(((50*c1)+ (150*c2)+(unit-200)*c3)+surcharge);
		}
		else if(unit>450)
		{
			System.out.println(((50*c1)+(150*c2)+(250*c3)+(unit-450)*c4)+surcharge);
		}
		else System.out.println("invalid unit");
	}
}
