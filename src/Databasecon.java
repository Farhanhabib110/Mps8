/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Baloch
 */
import java.sql.*;
public class Databasecon {
    
    
                
   Connection con;
Statement st;
ResultSet rs;

 public void connect() { 
    try{
String driver="sun.jdbc.odbc.JdbcOdbcDriver";

  Class.forName(driver);
 
  String db="jdbc:odbc:Mps";
  con=DriverManager.getConnection(db);
  
   System.out.println("Done");
    }catch(Exception ex){
    ex.getStackTrace();
    }

    
 }

    class connect {

        static Statement createStatement() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        public connect() {
        }
    }

}
 
 
