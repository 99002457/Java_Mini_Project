
public class RegularEmployee extends Employee {
	
	public RegularEmployee()
	{
		super();
	}
	public RegularEmployee(int id,String name,double salary,String dept,String pinfo,String pass)
	{
		super(id,name,salary,dept,pinfo,pass);
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return getEmpId()+" "+getName()+" "+getSalary()+" "+getDepartment()+" "+getProjectInfo();
	}
}
