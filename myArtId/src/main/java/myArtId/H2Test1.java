package myArtId;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.UUID;

public class H2Test1 {
	public static String driver = "org.h2.Driver";
//	public static String urlNest = "jdbc:h2:C:\\z\\software\\h2\\db1";
	public static String urlTcp = "jdbc:h2:tcp://localhost/~/db1";
	public static String urlNest="jdbc:h2:C://Users/IBM_ADMIN/trails_dev";
	public static String urlMem = "jdbc:h2:mem:db1";
	public static String username = "sa";
	public static String pwd = "sa";

	static Connection getConn() {
		Connection conn = null;
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(urlNest, username, pwd);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}
	
	public void test2(){
		try {
			Connection conn=getConn();
			Statement stat = conn.createStatement();
			ResultSet rs = stat.executeQuery("select * from account");
			if(rs.next()){
				System.out.println("has next");
			}else{
				System.out.println("No next");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

	public void test1() {
		try {
			Connection conn = getConn();
			Statement stat =  conn.createStatement();

//			stat.execute("drop table if exists abner");
			stat.execute("CREATE SCHEMA liuhao");
			stat.execute("CREATE TABLE liuhao.ABNER(id VARCHAR(36) PRIMARY KEY,name VARCHAR(100),sex VARCHAR(4))");
			stat.executeUpdate("INSERT INTO liuhao.ABNER VALUES('" + UUID.randomUUID() + "','abner','msle')");
			stat.executeUpdate("INSERT INTO liuhao.ABNER VALUES('" + UUID.randomUUID() + "','liuhao','nan')");
			
			ResultSet rs = null;
			ResultSet rs2 = null;
			rs = stat.executeQuery("select * from liuhao.abner");
			if (rs != null) {
				while (rs.next()) {
					System.out.println(rs.getString("id") + "," + rs.getString("name") + "," + rs.getString("sex"));
				}
				stat.executeUpdate("update liuhao.abner set name='winner' where name='liuhao'");
				rs2 = stat.executeQuery("select * from liuhao.abner");
				while (rs2.next()) {
					System.out.println(rs2.getString("id") + "," + rs2.getString("name") + "," + rs2.getString("sex"));
				}
			}
			stat.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		H2Test1 test1 = new H2Test1();
		test1.test1();
	}
}
