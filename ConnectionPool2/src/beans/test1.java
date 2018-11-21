package beans;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Date;

public class test1 {
	public static void main(String[] args) throws ClassNotFoundException {
		Date d1=new Date();
		System.out.println("simple jdbc pools from database");		
		for(int i=0;i<=200;i++){
			try {
				Class.forName("oracle.jdbc.OracleDriver");
				 
				Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","venkatdb","oracle");
				System.out.println(con+":"+i+"date"+d1);
				con.close();
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
		}
	}

}
