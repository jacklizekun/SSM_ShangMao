package kun.test;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import org.junit.Test;


public class TestJDBC {

	@Test
	public void jdbc() throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException, IOException, InterruptedException {

		//使用jdbc链接数据库
		Class.forName("com.mysql.jdbc.Driver").newInstance();  
		
		String url = "jdbc:mysql://localhost:3306/kunkunshangmao?characterEncoding=UTF-8";
		String user = "root";
		String password = "admin";
		
		Connection conn = DriverManager.getConnection(url, user,password);   
		Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);   

		String sql = "select * from contract_c";
		ResultSet rs = stmt.executeQuery(sql);  
		ResultSetMetaData rsmd = rs.getMetaData();

		while(rs.next()) {
			for(int j=0;j<rsmd.getColumnCount();j++){
				System.out.print(rs.getString(j+1)+"\t");
			}
			System.out.println("");
			
		}
		
		rs.close();   
		stmt.close();   
		conn.close(); 
	}

}
