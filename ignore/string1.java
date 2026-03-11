package ignore;
import java.util.Scanner;
import java.util.Arrays;

/*Write a menu driven program to do the following
i. To check whether a string is palindrome or not
ii. Write the string in an alphabetical order
iii. Reverse the string
iv. Concatenate the original string and the reversed string*/

public class string1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str = sc.nextLine();
		System.out.println("Enter the operation you wanna perform: ");
		System.out.println("1.Palindrome");
		System.out.println("2.Alphabetical Order");
		System.out.println("3.Reverse");
		System.out.println("4.Concat");
		System.out.println("5.Exit");
		int choice = sc.nextInt();
		
		switch(choice) {
		case 1:
			StringBuffer str1 = new StringBuffer(str);
			String reverse1 = str1.reverse().toString();
			if(str.equalsIgnoreCase(reverse1)) {
				System.out.println("The given string is a palindrome");
			}else {
				System.out.println("The given string is not a palindrome");
			}
			break;
		case 2:
			char[] charArray = str.toCharArray();
			Arrays.sort(charArray);
			String sortedStr = new String(charArray);
			System.out.println("Result in Alphabetical Order: " + sortedStr);
			break;
		case 3:
			StringBuffer str2 = new StringBuffer(str);
			System.out.println("The reversed string is: " + str2.reverse().toString());
			break;
		case 4:
			StringBuffer str3 = new StringBuffer(str);
			String reverse3 = str3.reverse().toString();
			String concated = str.concat(reverse3);
			System.out.println("Concated: "+ concated);
			break;
		case 5:
			break;
		default:
			System.out.println("Invalid choice");
		}
	}
}
