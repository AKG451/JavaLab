package lab2;
import java.util.Scanner;

public class Exercise4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Date of Birth (DD-MM-YYYY): ");
        String dob = scanner.next();
        System.out.println("Enter years of service (e.g., 60): ");
        int serviceYears = scanner.nextInt();
        String birthYearStr = dob.substring(6, 10);
        int birthYear = Integer.parseInt(birthYearStr);
        int retirementYear = birthYear + serviceYears;
        String dayMonth = dob.substring(0, 6);
        System.out.println("Date of Retirement: " + dayMonth + retirementYear);
        
        scanner.close();
    }
}