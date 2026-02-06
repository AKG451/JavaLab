package lab4;

class EMPLOYEE {
    String Ename;
    int Eid;
    double Basic;
    double DA;
    double Gross_Sal;
    double Net_Sal;
    
    public EMPLOYEE() {
    	Ename = "default";
    	Eid = 0;
    	Basic = 0;
    	DA = 0;
    	Gross_Sal = 0;
    	Net_Sal = 0;
    }
    
    public EMPLOYEE(String Ename, int Eid, double Basic) {
    	this.Ename = Ename;
    	this.Eid = Eid;
    	this.Basic = Basic;
    	compute();
    }
    
    public void compute() {
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
	public static void main(String[] args){
	EMPLOYEE e1 = new EMPLOYEE();
	EMPLOYEE e2 = new EMPLOYEE("Aryan",1,25000);
	EMPLOYEE e3 = new EMPLOYEE("Aryan2",2,30000);
	e1.display();
	e2.display();
	e3.display();
	}
}

