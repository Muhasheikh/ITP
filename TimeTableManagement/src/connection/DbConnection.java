package connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbConnection {

	  
    public static Connection connect(){
         Connection conn = null;
        try{
        	Class.forName("org.sqlite.JDBC");
			conn=DriverManager.getConnection("jdbc:sqlite:ITPM");
            System.out.println("Connected!");
        }catch(Exception e){
            //JOptionPane.showMessageDialog(null, e);
        	System.out.println("Connection Failed");
            return null;
        }
		return conn;
        
    }
}
