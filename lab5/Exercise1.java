package lab5;
import java.util.Scanner;
import java.util.Arrays;

class STUDENT {
    String sname;
    int[] marks_array;
    int total;
    double avg;
    Subject[] subject;
    int subjectCount;
    int maxSubjectCount;
    
    class Subject{
    	String subjectName;
    	int marks;
    	public void assign() {
    		Scanner sc = new Scanner(System.in);
    		System.out.println("Enter the name of the subject: ");
    		this.subjectName = sc.nextLine();
    		System.out.println("Enter the marks scored: ");
    		this.marks = sc.nextInt();
    	}
    	public void display() {
    		System.out.println("Subject: "+subjectName+" Marks: "+marks);
    	}
    }
    public void addSubject() {
    	if(subjectCount<maxSubjectCount) {
    		Subject newSubject = new Subject();
    		newSubject.assign();
    		subject[subjectCount] = newSubject;
    		subjectCount++;
    	}else {
    		System.out.println("Maximum subject limit reached");
    	}
    }

    public STUDENT() {
    	this.sname = "Unknown";
        this.maxSubjectCount = 5; 
        this.subject = new Subject[maxSubjectCount];
        this.subjectCount = 0;
    }

    public STUDENT(String sname, int maxSubjects) {
        this.sname = sname;
        this.maxSubjectCount = maxSubjects;
        this.subject = new Subject[maxSubjects];
        this.subjectCount = 0;
    }
    
    public void compute() {
    	this.total = 0;
        for (int i = 0; i < subjectCount; i++) {
            this.total += subject[i].marks;
        }
        if (subjectCount > 0) {
            this.avg = (double) this.total / subjectCount;
        } else {
            this.avg = 0.0;
        }
    }

    public void display() {
    	System.out.println("\n--- Student Details ---");
        System.out.println("Name: " + sname);
        for (int i = 0; i < subjectCount; i++) {
            subject[i].display();
        }
        System.out.println("Total Marks: " + total);
        System.out.println("Average Marks: " + avg);
        System.out.println("-----------------------");
    }
}

public class Exercise1 {
    public static void main(String[] args) {
Scanner mainScanner = new Scanner(System.in);
        
        System.out.print("Enter Student Name: ");
        String name = mainScanner.nextLine();
        
        System.out.print("How many subjects do you want to add? ");
        int numSubjects = mainScanner.nextInt();
        mainScanner.nextLine();

        STUDENT student = new STUDENT(name, numSubjects);

        for (int i = 0; i < numSubjects; i++) {
            System.out.println("\nEntering details for Subject " + (i + 1) + ":");
            student.addSubject();
        }
        student.compute();
        student.display();
        mainScanner.close();
    }
}