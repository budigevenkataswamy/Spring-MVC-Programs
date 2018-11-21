package beans;

import java.sql.Connection;
import java.sql.SQLException;

import org.apache.tomcat.dbcp.dbcp2.BasicDataSource;

public class Test {
	public static void main(String[] args) {
		BasicDataSource bds=new BasicDataSource();
		bds.setDriverClassName("org.h2.Driver");
		bds.setUrl("jdbc:h2:tcp://localhost/~/mytest");
		bds.setUsername("sa");
		bds.setPassword("");
		//bds.SetMaxActive(15);
		bds.setMaxTotal(15);
		bds.setMaxIdle(5);
		//bds.setMaxWaitWait(1000*5);
		bds.setMaxWaitMillis(1000*5);
		
		
		for(int i=0;i<=20;i++){
			try {
				Connection con=bds.getConnection();
				System.out.println(con+":"+i);
				con.close();
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
		}
	}

}
