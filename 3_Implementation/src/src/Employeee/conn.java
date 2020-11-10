package Employeee;

import java.sql.*;

public class conn{
    
    public Connection c;
    public Statement s;
 
    public conn(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/empdata","root","123456");
            s = c.createStatement();
        }catch(Exception e) {
            e.printStackTrace();
        }
    }
}
 
