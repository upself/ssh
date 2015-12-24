package myArtId;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.UUID;

import org.h2.jdbcx.JdbcConnectionPool;

public class H2Test1 {
	public static String driver = "org.h2.Driver";
	public static String urlNest = "jdbc:h2:C:\\personal\\software\\h2\\db1";
	public static String urlTcp = "jdbc:h2:tcp://localhost/C:/personal/software/h2/db1";
	public static String urlMem = "jdbc:h2:tcp://localhost/mem:db1";
	public static String username = "sa";
	public static String pwd = "sa";

	static Connection getConn() {
		Connection conn = null;
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(urlMem, username, pwd);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}

	public void test1() {
		try {
			Connection conn = getConn();
			Statement stat =  conn.createStatement();

			//stat.execute("drop table if exists user");
			//stat.execute("CREATE TABLE USER(id VARCHAR(36) PRIMARY KEY,name VARCHAR(100),sex VARCHAR(4))");
			stat.executeUpdate("INSERT INTO USER VALUES('" + UUID.randomUUID() + "','abner','male')");
			stat.executeUpdate("INSERT INTO USER VALUES('" + UUID.randomUUID() + "','liuhao','nan')");
			
			ResultSet rs = null;
			rs = stat.executeQuery("select * from user");
			if (rs != null) {
				while (rs.next()) {
					System.out.println(rs.getString("id") + "," + rs.getString("name") + "," + rs.getString("sex"));
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
