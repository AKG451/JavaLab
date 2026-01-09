package Lab1;

import java.util.Scanner;

public class Exercise2 {
      public static void main(String[] args) {
    	  /*Write a java program to add two numbers using the bitwise operator and check if the
          output is an even or odd number.*/
    	  
    	  Scanner scanner = new Scanner(System.in);
    	  System.out.println("Enter the first number: ");
    	  int a = scanner.nextInt();
    	  System.out.println("Enter the second number: ");
    	  int b = scanner.nextInt();
    	  while(b!=0) {
    		  int carry = a&b;
    		  a = a^b;
    		  b = carry<<1;
    	  }
    	  String result = ((a & 1) == 0) ? "Even" : "Odd";
          
          System.out.println("Sum: " + a);
          System.out.println("The output is an " + result + " number.");
          scanner.close();
    	  
      }
}
