import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		//Your challenge is to read in a price
		System.out.println("price:");
		double price = in.nextDouble();
		//Read in the amount paid
		System.out.println("amount paid:");
		double paidAmount = in.nextDouble();
		//Print out the amount of change
		double change = paidAmount-price;
		if (price >= paidAmount) {
			System.out.println("Not Enough Money");
		}
		//As a bonus, make your project round to the nearest $0.05 like actual stores.
		int lastDigit = (int) ((change*100)%10);
		if (lastDigit==1 || lastDigit==2) {
			change = change + (lastDigit/100.0);
		}
		if (lastDigit==3 || lastDigit==4) {
			change = change + (( 5-lastDigit)/100.0);
		}
		//Break the change into all denominations: 
		//$100
		if (change / 100 >=1) {
			int Hundreds = (int)(change/100);
			System.out.println("# of 100's:"+Hundreds);
			change = change-Hundreds*100;
			change = Math.round(change*100)/100.0;
		}
		//$50
		if (change / 50 >=1) {
			int Fiftys = (int)(change/50);
			System.out.println("# of 50's:"+Fiftys);
			change = change-Fiftys*50;
			change = Math.round(change*100)/100.0;
		}
		//$20
		if (change / 20 >=1) {
			int Twenties = (int)(change/20);
			System.out.println("# of 20's:"+Twenties);
			change = change-Twenties*20;
			change = Math.round(change*100)/100.0;
		}
		//$10
		if (change / 10 >=1) {
			int tens = (int)(change/10);
			System.out.println("# of 10's:"+tens);
			change = change-tens*10;
			change = Math.round(change*100)/100.0;
		}
		//$5
		if (change / 5 >=1) {
			int Fives = (int)(change/5);
			System.out.println("# of 5's:"+Fives);
			change = change-Fives*5;
			change = Math.round(change*100)/100.0;
		}
		//$2
		if (change / 2 >=1) {
			int twos = (int)(change/2);
			System.out.println("# of Toonies's:"+twos);
			change = change-twos*2;
			change = Math.round(change*100)/100.0;
		}
		//$1
		if (change / 1 >=1) {
			int ones = (int)(change/1);
			System.out.println("# of Loonies:"+ones);
			change = change-ones*1;
			change = Math.round(change*100)/100.0;
		}
		//$0.25
		if (change / 0.25 >=1) {
			int quarters = (int)(change/0.25);
			System.out.println("# of Quarters:"+quarters);
			change = change-quarters*0.25;
			change = Math.round(change*100)/100.0;
		}
		//$0.10
		if (change / 0.10 >=1) {
			int dimes = (int)(change/0.10);
			System.out.println("# of Dimes:"+dimes);
			change = change-dimes*0.10;
			change = Math.round(change*100)/100.0;
		}

		//$0.05
		if (change / 0.05 >=1) {
			int Nickels = (int)(change/0.05);
			System.out.println("# of Nickels:"+Nickels);
			change = change-Nickels*0.05;	 
		}
	}

}
