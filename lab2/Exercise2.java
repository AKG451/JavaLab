package lab2;
import java.util.Scanner;
public class Exercise2 {

	public static void main(String[] args) {
		// For given a 9-digit registration number of a CSE student, identify the year of
		//joining. Assuming the first two digits specify the year of joining.
		
		int[] rollno = new int[9];
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the roll number of the student: ");
		for (int i = 0; i < 9; i++) {
            System.out.print("Digit " + i + ": ");
            rollno[i] = scanner.nextInt();
        }
		System.out.println("The year of joining of the student is 20"+rollno[0]+rollno[1]);
		

	}

}
