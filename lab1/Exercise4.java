package lab1;
import java.util.Scanner;
import java.util.Arrays;
public class Exercise4 {
	/*Write a Java program to rotate the elements of an array to the right/left by a given
	number of steps. The program should handle arrays of different sizes and should be
	able to rotate the array in both directions (left and right).*/

	public static void rotate(int arr[], int k , String direction) {
	int n = arr.length;
	k = k%n;
    if(k == 0) return;
	if(direction.equalsIgnoreCase("left")){
	k = n-k;
	}
	reverse(arr,0,n-1);
	reverse(arr,0,k-1);
	reverse(arr,k,n-1);
	}
	
	private static void reverse(int arr[], int start, int end) {
	while(start<end) {
		int temp = 0;
		temp = arr[start];
		arr[start] = arr[end];
		arr[end] = temp;
		start++;
		end--;
		}
	}
	
	
	public static void main(String[] args) {
		int[] data1 = {1, 2, 3, 4, 5, 6, 7};
        int steps1 = 3;
        System.out.println("Original Array: " + Arrays.toString(data1));
        rotate(data1, steps1, "right");
        System.out.println("After Right Rotation by " + steps1 + ": " + Arrays.toString(data1));
        System.out.println("-------------------------");
        int[] data2 = {10, 20, 30, 40, 50};
        int steps2 = 2;
        System.out.println("Original Array: " + Arrays.toString(data2));
        rotate(data2, steps2, "left");
        System.out.println("After Left Rotation by " + steps2 + ": " + Arrays.toString(data2));
        System.out.println("-------------------------");
        int[] data3 = {1, 2, 3};
        int steps3 = 5;
        System.out.println("Original Array: " + Arrays.toString(data3));
        rotate(data3, steps3, "right");
        System.out.println("After Right Rotation by " + steps3 + ": " + Arrays.toString(data3));
		}

}
