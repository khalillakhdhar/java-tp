/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package todo;

/**
 *
 * @author pro
 */
import java.sql.DriverManager;
public class Connexions {
     com.mysql.jdbc.Connection conn;


    {
 String url= "jdbc:mysql://localhost:3306/";
 String dbName;
 dbName = "todo";
 String driver= "com.mysql.jdbc.Driver";
 String userName= "root";
 String password="";

 try
 {
 Class.forName(driver).newInstance();
 conn= (com.mysql.jdbc.Connection)
DriverManager.getConnection(url+dbName,userName, password);
 System.out.println("la connexion a reussie");
 }catch(Exception e)
 {
 System.out.println("la connexion est echoué");
 }

}}
