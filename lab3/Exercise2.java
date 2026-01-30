package lab3;
import java.util.Scanner;

class EMPLOYEE {
    String Ename;
    int Eid;
    double Basic;
    double DA;
    double Gross_Sal;
    double Net_Sal;
    
    public void read(Scanner input) {
        System.out.println("Enter Employee ID, Name, and Basic Salary:");
        Eid = input.nextInt();
        input.nextLine();
        Ename = input.nextLine();
        Basic = input.nextDouble();
    }
    
    public void compute_net_sal() {
        DA = 0.52 * Basic;
        Gross_Sal = Basic + DA;
        double IT = 0.30 * Gross_Sal;
        Net_Sal = Gross_Sal - IT;
    }
    
    public void display() {
        System.out.println("-------------------------");
        System.out.println("ID: " + Eid);
        System.out.println("Name: " + Ename);
        System.out.println("Basic: " + Basic);
        System.out.println("DA: " + DA);
        System.out.println("Gross Salary: " + Gross_Sal);
        System.out.println("Net Salary: " + Net_Sal);
    }
}

public class Exercise2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter number of employees (N): ");
        int N = sc.nextInt();
        
        EMPLOYEE[] employees = new EMPLOYEE[N];
        
        for (int i = 0; i < N; i++) {
            System.out.println("\nEnter details for Employee " + (i + 1) + ":");
            employees[i] = new EMPLOYEE();
            employees[i].read(sc);
            employees[i].compute_net_sal();
        }
        
        System.out.println("\n--- All Employee Details ---");
        for (int i = 0; i < N; i++) {
            employees[i].display();
        }
        
        sc.close();
    }
}