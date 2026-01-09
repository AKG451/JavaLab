package Lab1;
import java.util.Scanner;
public class Exercise4 {

	public static void main(String[] args) {
		/*Write a Java program to rotate the elements of an array to the right/left by a given
		number of steps. The program should handle arrays of different sizes and should be
		able to rotate the array in both directions (left and right).*/
		        int[] arr = {1, 2, 3, 4, 5,6,7,8,9,10,11,12};
		        Scanner scanner = new Scanner(System.in);
		        System.out.println("Enter by how much you wanna rotate the elements of array: ");
		        int n = scanner.nextInt();

		        for (int i = 0; i < n; i++) {
		            int last = arr[arr.length - 1];
		            for (int j = arr.length - 1; j > 0; j--) {
		                arr[j] = arr[j - 1];
		            }
		            arr[0] = last;
}
		        System.out.print("Rotated Array: ");
		        for (int x : arr) {
		            System.out.print(x + " ");
		}

}
}