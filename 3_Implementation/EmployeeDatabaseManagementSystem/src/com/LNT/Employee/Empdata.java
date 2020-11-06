package com.LNT.Employee;

import java.awt.Panel;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import oracle.jdbc.driver.*;

import javax.swing.*;

public class Empdata {

	private int psNumber;
	private String name;
	private String accountNo;
	private String buName;
	
	//Creating the connection 
    String url = "jdbc:oracle:thin:@localhost:1521:xe"; 
    String user = "system"; 
    String pass = "12345"; 
    
  //Inserting data using SQL query 
    String sql = "insert into Employee values("+psNumber+",'"+name+"','"+accountNo+"','"+buName+"')"; 
    
     

	public Empdata(int number, String ename, String accNo,String bu)
	{

		this.psNumber = number;
		this.name=ename;
		this.accountNo=accNo;
		this.buName=bu;
	}
	public Empdata() {

	}

	public static void main(String[] args) {

		Empdata emp= new Empdata(99002457,"chethan","9100631334","ICP");

	}

	public String getAccountNo() {
		return accountNo;
	}
	public String getBuName() {
		return buName;
	}
	public int getPsNumber() {
		return psNumber;
	}
	public String getName() {
		return name;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	public void setBuName(String buName) {
		this.buName = buName;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setPsNumber(int psNumber) {
		this.psNumber = psNumber;
	}

	public String toString() {


		return this.psNumber+" "+this.name+" "+this.accountNo+" "+this.buName;
	}
	public void createEmp(int number, String ename, String accNo, String bu) { 

		Connection con=null; 
	    try
	    { 
	        DriverManager.registerDriver(new oracle.jdbc.OracleDriver()); 

	        //Reference to connection interface 
	        con = DriverManager.getConnection(url,user,pass); 

	        Statement st = con.createStatement(); 
	        int m = st.executeUpdate(sql); 
	        if (m == 1) 
	            System.out.println("inserted successfully : "+sql); 
	        else
	            System.out.println("insertion failed"); 
	        con.close(); 
	    } 
	    catch(Exception ex) 
	    { 
	        System.err.println(ex); 
	    }


	}
	public void updateEmp(int number, String ename, String accNo, String bu) { 

		

	}
	public String retriveEmp(int psNumber) {

		// add needed code here
		Empdata emp = new Empdata(99002457,"chethan","9100631334","ICP");
		return emp.toString();



	}public void deleteEmp(int psNumber) { 

		// add needed code here
		System.out.println(psNumber+ "is Deleted");


	}
	String[] uname = {"Shrikant","Pavan","Chetan"};
	String[] pwd = {"Shrikant@123","Pavan@123","Chetan@123"};

	public boolean login(String username, String password) {
		
		boolean flag = false;

		for(int i=0;i<uname.length;i++) {

			if((username.equals(uname[i]))){
				if(password.equals(pwd[i])) {
				flag = true;
				
			}}

		}
		return flag;
	}
}


