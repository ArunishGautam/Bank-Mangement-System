/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 91748
 */
import java.sql.*;
import javax.swing.JOptionPane;

public class javaconnect {
  Connection con=null;


public static Connection ConnectDb(){
  try{
       Class.forName("com.mysql.cj.jdbc.Driver");
	           Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/bank","root","arunish");
                   return con;
                   
  }
  catch(Exception e){
  JOptionPane.showMessageDialog(null, e);}
  return null;
}  
}
