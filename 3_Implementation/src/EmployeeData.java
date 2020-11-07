import java.util.Scanner;

public class EmployeeData {

public static void main(String[] args) {
	System.out.println("Choice the Employee type \n 1. Regular Employee \n 2. Administrator");
	try (Scanner sc = new Scanner(System.in)) {
		String choice=sc.nextLine();
		
		switch(choice)
		{
		case "1":Admin aemp=new Admin(10,"Chethan",1000,"IC","Database","17071998gc");
		 String data=aemp.toString();
		 System.out.println(data);
			break;
		case "2":RegularEmployee emp=new RegularEmployee(10,"Chethan",1000,"IC","Database","17071998gc");
				 String rdata=emp.toString();
				 System.out.println(rdata);
				 //int id,String name,double salary,String dept,String pinfo,String pass)
			break;
		default: System.out.println("Enter the correct choice\n");
		}
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	
}

}
