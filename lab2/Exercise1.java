package lab2;
import java.util.Scanner;
public class Exercise1 {

	public static void main(String[] args) {
		//A Taxi service offers a new service based on travel distance. Write a Java
		//program to calculate the total distance traveled by considering the following
		//charges. First 5 km = INR 10/km, Next 15 km = INR 8/km, Next 25 km = INR
		//5/km.
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the total cost of the ride: ");
		double price = scanner.nextDouble();
		if(price<=50 && price>=0) {
			System.out.println("The total distance travlled is: " + (price/10));
		}else if(price>50 && price<=170) {
			System.out.println("The total distance travlled is: " + (5+((price-50)/8)));
		}else if(price>170) {
			System.out.println("The total distance travlled is: " + (20+(price-170)/5));
		}
		
		
	}

}
