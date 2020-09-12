import javax.persistence.Entity;
import javax.persistence.*;

@Entity
@Table(name="emp")

public class Employee {
	@Id
	@Column(name="employeeid")	
	private int empid;	
	
	@Column(name="empname")
	private String empname;
	
	@Column(name="empsalary")
	private double salary;
	
	@Column(name="empaddress")
	private String address;
	
	
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
		
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
		
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
		
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

}
