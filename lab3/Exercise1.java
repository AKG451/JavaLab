package lab3;
import java.util.Arrays;

//Define a Class STUDENT having following
	//Members: name, marks_array, total, avg and provide the following methods:
		//a. assign(): to assign initial values to the STUDENT object
		//b. display(): to display the STUDENT object
		//c. compute(): to Compute Total, Average marks
		//Write a Java program Illustrating Class Declarations, Definition, and Accessing Class
		//Members to test the class defined.

class STUDENT{
	String name;
	private int[] marks_array;
	double avg;
	int total;
	
	public void assign(String n,int[] marks) {
		name = n;
		marks_array = marks;
		total = 0;
		avg = 0;
	}
	public void compute() {
		total = 0;
		for(int i = 0;i<marks_array.length;i++) {
			total = total + marks_array[i];
		}
		if(marks_array.length>0)
		avg = (double)total/marks_array.length;
	}
	public void display() {
		System.out.println("The name of the student is: "+name);
		System.out.println("Marks: " + Arrays.toString(marks_array));
        System.out.println("Total Score: " + total);
        System.out.println("Average: " + avg);
	}
	
}

public class Exercise1 {
	
	 public static void main(String[] args) {
	
		 STUDENT s1 = new STUDENT();
		 int[] marks = {85,95,97,67,99};
		 System.out.println("Assigning Values: ");
		 s1.assign("Aryan", marks);
		 System.out.println("Computing the values: ");
		 s1.compute();
		 System.out.println("Printing the Values: ");
		 s1.display();
		 
	}
	
}
