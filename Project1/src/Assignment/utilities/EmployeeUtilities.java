package Assignment.utilities;

import Assignment.employees.Developer;
import Assignment.employees.Employee;
import Assignment.employees.Manager;

public class EmployeeUtilities extends Developer {
	Developer d;
	 Manager m;
	public EmployeeUtilities(Developer d, Manager m) {
		super();
		this.d = d;
		this.m = m;
	}
	 public void setSalary(float sal) {
		 this.d.setEsalary(sal);
		 this.m.setEsalary(sal);
		 //d.setLanguage("Java");
	 }
	 
	

}
