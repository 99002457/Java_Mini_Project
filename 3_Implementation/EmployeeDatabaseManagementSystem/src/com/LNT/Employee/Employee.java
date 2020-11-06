package com.LNT.Employee;

import java.util.Scanner;

public class Employee extends Empdata{

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Select the Options between Admin or User// Select 1 for admin 2 for user");

		int option = sc.nextInt();
		if(option == 1) {
			System.out.println("Enter username and password");
			String username = sc.next();
			String password = sc.next();
			EmployeeAdmin us=new EmployeeAdmin(99002457,"chethan","9100631334","ICP");

			boolean val1 = us.login(username,password);
		
			if(val1) {
				System.out.println("Enter C,U,R,D for respective action");
				String ch = sc.next();
				System.out.println("Enter Deatails -");
				System.out.println("Enetr PS Number");
				int psNumber = sc.nextInt();
				System.out.println("Enter Name");
				String name = sc.next();
				System.out.println("Enter Pan No");
				String panNo = sc.next();
				System.out.println("Enter BU name");
				String buName = sc.next();
				switch(ch)
				{

				case "C" :

					us.createEmp(psNumber,name,panNo,buName);

				case "U" :

					us.updateEmp(psNumber,name,panNo,buName);

				case "R" :

					us.retriveEmp(psNumber);

				case "D" :



					us.deleteEmp(psNumber);
				}
			}
			else
			{
				System.out.println("enter the correct deatils");

			}


		}
		else
		{
			System.out.println("Enter username and password");
			String username = sc.nextLine();
			String password = sc.nextLine();
			EmployeeAdmin us=new EmployeeAdmin(99002457,"chethan","9100631334","ICP");
			EmployeeAdmin ad=new EmployeeAdmin();
			boolean val2=ad.login(username, password);
			if(val2)
			{
				System.out.println("Enter U,R for respective action");
				String ch = sc.next();
				System.out.println("Enter Deatails -");
				System.out.println("Enetr PS Number");
				int psNumber = sc.nextInt();
				System.out.println("Enter Name");
				String name = sc.next();
				System.out.println("Enter Pan No");
				String panNo = sc.next();
				System.out.println("Enter BU name");
				String buName = sc.next();


				switch(ch)
				{

				case "U" :

					us.updateEmp(psNumber,name,panNo,buName);

				case "R" :

					us.retriveEmp(psNumber);


				}
			}
			else
			{
				System.out.println("enter the correct deatils");
			}
		}

	}

}
