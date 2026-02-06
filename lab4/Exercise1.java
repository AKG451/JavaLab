package lab4;
import java.util.Arrays;

class STUDENT {
    String sname;
    int[] marks_array;
    int total;
    double avg;

    public STUDENT() {
        sname = "Unknown";
        marks_array = new int[0];
        total = 0;
        avg = 0.0;
    }

    public STUDENT(String sname, int[] marks_array) {
        this.sname = sname;
        this.marks_array = marks_array;
        compute(); 
    }

    public void compute() {
        total = 0;
        for (int i = 0; i < marks_array.length; i++) {
            total += marks_array[i];
        }
        if (marks_array.length > 0) {
            avg = (double) total / marks_array.length;
        }
    }

    public void display() {
        System.out.println("Name: " + sname);
        System.out.println("Marks: " + Arrays.toString(marks_array));
        System.out.println("Total: " + total);
        System.out.println("Average: " + avg);
        System.out.println("-----------------------------");
    }
}

public class Exercise1 {
    public static void main(String[] args) {
        
        STUDENT s1 = new STUDENT();
        s1.display();

        int[] marks2 = {90, 85, 95};
        STUDENT s2 = new STUDENT("Aryan", marks2);
        s2.display();
        
        int[] marks3 = {50, 60, 55};
        STUDENT s3 = new STUDENT("Aryan2", marks3);
        s3.display();
    }
}