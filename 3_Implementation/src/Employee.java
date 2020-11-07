
public class Employee {
	private int empId;
    private String name;
    private double salary;
    private String department;
    private String projectInfo;
    private String password;
    
    public Employee() {
		this.empId=0;
		this.department="";
		this.projectInfo="";
		this.name="";
		this.salary=0.0;
		this.password="";
	    }
    
    public Employee(int id,String name,double salary,String dept,String pinfo,String pass) {
 		this.empId=id;
 		this.department=dept;
 		this.projectInfo=pinfo;
 		this.name=name;
 		this.salary=salary;
 		this.password=pass;
 	}
    
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	public String getDepartment() {
		return department;
	}
	public int getEmpId() {
		return empId;
	}
	public String getName() {
		return name;
	}
	public String getProjectInfo() {
		return projectInfo;
	}
	public double getSalary() {
		return salary;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setProjectInfo(String projectInfo) {
		this.projectInfo = projectInfo;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}	
	public void setPassword(String password) {
		this.password = password;
	}
}
