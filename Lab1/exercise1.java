package Lab1;
import java.util.Scanner;
public class exercise1 {

	public static void main(String[] args) {
		/*Question: Write a Java program to accept the number of hours worked, hourly rate and calculates
		the salary for an employee according to the following criteria: The company pays
		straight time for the first 40 hours worked by each employee and time and a half for
		all hours worked in excess of 40 hours.*/
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the amount of hours the employee has worked: ");
		double hours = scanner.nextDouble();
		System.out.println("Please enter the hourly rate of the employee: ");
		double rate = scanner.nextDouble();
        double salary = 0;
        if(hours>40) {
        	salary = (40*rate) + ((hours-40)*rate*3)/2;
        }else {
        	salary = hours*rate;
        }
        System.out.println("Salary of the employee is: " +salary);
        scanner.close();
		
	}

}
