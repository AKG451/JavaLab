package lab5;
import java.util.Scanner;

/*Implement an EMPLOYEE class with an inner class named Department that handles
department-related details. The inner class Department should:
a. Contain fields for departmentName and location.
b. Provide methods to set and display department details.
The EMPLOYEE class should:
Contain fields for eName (employee name), salary, and an array of Department objects.
Provide methods to:
c) Add departments.
d) Display employee details along with department information.*/

class EMPLOYEE{
	private String eName;
	private int eId;
	private double salary;
	private Department[] departments;
	int deptCount ;
	
	
	public EMPLOYEE(String eName, int eId, double salary, int maxDept ) {
		this.eName = eName;
		this.eId = eId;
		this.salary = salary;
		this.departments = new Department[maxDept];
		this.deptCount = 0;
	}
	
	class Department{
		String departmentName;
		String location;
		public void assignDept(String departmentName, String location) {
			this.departmentName = departmentName;
			this.location = location;
		}
		public void dispDept() {
			System.out.println("Department: "+departmentName +" Location: "+location);
	}
		}
		
	public void makeDept(String name, String loc) {
		if(deptCount < departments.length) {
			Department dept = this.new Department();
			dept.assignDept(name,loc);
			departments[deptCount] = dept;
			deptCount++;
		}else {
			System.out.println("No more departments can be added");
		}
	}
	public void display() {
		System.out.println("Employee name: "+eName);
		System.out.println("Employee ID: "+eId);
		System.out.println("Salary: $" + salary);
		if (deptCount == 0) {
            System.out.println("  (No departments assigned yet)");
        } else {
            for (int i = 0; i < deptCount; i++) {
                departments[i].dispDept();
            }
        }
	}
	}

public class Exercise2 {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	EMPLOYEE emp = new EMPLOYEE("Aryan",1,10000,5);
	emp.makeDept("Research","AB2");
	emp.makeDept("Programming","Innovation Lab");
	emp.display();
}
}
