package com.cg.HashSet;

public class Employee {
	private int empId;
	private String name;
	private String address;
	public Employee(int empId, String name, String address) {
		super();
		this.empId = empId;
		this.name = name;
		this.address = address;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", address=" + address + "]";
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int hashCode() {
		System.out.println("**********HashCode called***************");
		return empId;
	}
	public boolean equals(Object Obj) {
		System.out.println("************equals called**********");
		Employee e = (Employee) Obj;
		if(e.empId==this.empId && e.name.equals(this.name) && e.address.equals(this.address))
			return true;
		else
			return false;
	}
	
}
