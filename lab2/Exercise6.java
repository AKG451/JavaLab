package lab2;
import java.util.Scanner;
public class Exercise6 {
	public static void main(String[] args) {
		//Write a Java program to compute the electricity bill for an industry using a
		//switch-case statement. The program should take the daily consumption in units
		//for 7 days as input. Based on the total consumption, the program should
		//calculate and display the total electricity bill according to the following pricing
		//table:
		//UnitsPrice per Unit (INR)
		//0 - 1007.00
		//101 - 200
		//>= 2018.00
		//10.00
		
		Scanner scanner = new Scanner(System.in);
		int flag = 0;
		double totalSum = 0;
		System.out.println("Enter daily consumption (units) for 7 days:");
		for(int i = 0; i<7;i++) {
			System.out.println("Day "+(i+1)+" : ");
			totalSum += scanner.nextDouble();
		}
		if(totalSum>0) {
			flag =(int)((totalSum-1)/100);
		}
		
		double rate = 0.0;
        double totalBill = 0.0;
        switch (flag) {
            case 0:
                rate = 7.00;
                break;
            case 1:
                rate = 8.00;
                break;
            default:
                rate = 10.00;
                break;
        }
        totalBill = totalSum * rate;
        System.out.println("Price per Unit applied: INR " + rate);
        System.out.println("Total Electricity Bill: INR " + totalBill);
        
        scanner.close();
		
		
	}
}
