import java.awt.List;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Admin extends Employee {

	public Admin()
	{
		super();
	}
	public Admin(int id,String name,double salary,String dept,String pinfo,String pass)
	{
		super(id,name,salary,dept,pinfo,pass);
	}
	public String toString() {
		// TODO Auto-generated method stub
		return getEmpId()+" "+getName()+" "+getSalary()+" "+getDepartment()+" "+getProjectInfo();
	}
}
