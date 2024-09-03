
//mysql> insert into employee9 values(101,'raj1',10000);

package com.evergent.java.jdbc.mysql;
import java.sql.Connection;
//import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ResultSetNextExamplemMsql {
  public static void main(String[] args) {
     Connection conn = null;
      String url = "jdbc:mysql://localhost:3306/";
      String dbName = "evergentdb";
      String driverName = "com.mysql.jdbc.Driver";
      String userName = "root";
      String password = "admin";
      try{
        Class.forName(driverName);   //Loading the Driver ,   Driver d1=new Driver()
        conn = DriverManager.getConnection(url+dbName, userName, password);
        try{
          Statement stmt = conn.createStatement();                
          ResultSet rs=stmt.executeQuery("Select * from employee9");
              while(rs.next()){
        	 System.out.println("Employee No :" + rs.getInt(1));
             System.out.println("Employee Name :" + rs.getString("ename"));
        	    	System.out.println("Employee sal :"+rs.getInt(3));
          }         }
        catch(SQLException s){
          System.out.println(s);
        }
        conn.close();
      }
      catch (Exception e){
        e.printStackTrace();
      }  }}

