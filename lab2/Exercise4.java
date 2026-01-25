package lab2;
import java.util.Scanner;

public class Exercise4 {
	
	//Write a Java program to display non diagonal elements and find their sum.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the square matrix (N): ");
        int n = scanner.nextInt();

        int[][] matrix = new int[n][n];

        System.out.println("Enter the elements of the " + n + "x" + n + " matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Enter element at [" + i + "][" + j + "]: ");
                matrix[i][j] = scanner.nextInt();
            }
        }

        System.out.println("-------------------------");
        System.out.println("Matrix entered:");
        printMatrix(matrix);

        System.out.println("-------------------------");
        System.out.println("Non-Diagonal Elements:");

        int sum = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i != j) {
                    System.out.print(matrix[i][j] + " ");
                    sum += matrix[i][j];
                } else {
                    System.out.print("  "); 
                }
            }
            System.out.println(); 
        }

        System.out.println("-------------------------");
        System.out.println("Sum of Non-Diagonal Elements: " + sum);
        
        scanner.close();
    }

    public static void printMatrix(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}