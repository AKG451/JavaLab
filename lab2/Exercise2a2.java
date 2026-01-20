package lab2;
import java.util.Scanner;

public class Exercise2a2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the roll number: ");
        String rollNo = scanner.next();
        String yearStr = rollNo.substring(0, 2); 
        System.out.println("The year of joining of the student is: 20" + yearStr);
        scanner.close();
    }
}