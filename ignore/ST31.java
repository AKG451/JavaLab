package ignore;
import java.util.Arrays;

class STUDENT{
	String sname;
	double[] marks_array;
	double total;
	double avg;
	
	public void assign(String s,double[] marks ){
		sname = s;
		marks_array = marks;
		total = 0;
		avg = 0;
	}
	public void compute() {
		total = 0;
		for( int i = 0; i<marks_array.length;i++) {
			total = total + marks_array[i];
		}
		avg =(double) total/marks_array.length;
	}
	public void display() {
		System.out.println("Student name is: "+sname);
		System.out.println("Marks stored by student is: "+Arrays.toString(marks_array));
		System.out.println("Total Marks are: "+total);
		System.out.println("Average Marks scored by the student is: "+avg);
	}
}

public class ST31 {
	public static void main(String[] args) {
	STUDENT s1 = new STUDENT();
	double[] marks = {100,99,90};
	s1.assign("Aryan", marks);
	s1.compute();
	s1.display();
	}
}
