import java.io.Serializable;

public class Employee implements Serializable {

	private int eno;
	private String ename;
	private int salary;
	private String designation;
	private String department;
	
	public Employee() {}
	
	public Employee(int eno, String ename, int salary, String designation, String department) {
		super();
		this.eno = eno;
		this.ename = ename;
		this.salary = salary;
		this.designation = designation;
		this.department = department;
	}

	public int getEno() {
		return eno;
	}

	public void setEno(int eno) {
		this.eno = eno;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "Employee [eno=" + eno + ", ename=" + ename + ", salary=" + salary + ", designation=" + designation
				+ ", department=" + department + "]";
	}
	
	
	
}
