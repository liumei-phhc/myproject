package com.tb.yk.test;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//数据库的打开和关闭操作
public class DataBaseConnection {
	public static final String DBDRIVER = "oracle.jdbc.driver.OracleDriver";
	public static final String DBURL = "jdbc:oracle:thin:@localhost:1521:ORACLE9I";
	public static final String DBUSER = "scott";
	public static final String DBPSW = "tiger";
	private static Connection conn = null ;
	public static Connection getConnection(){
		try {
			Class.forName(DBDRIVER);
			conn = DriverManager.getConnection(DBURL,DBUSER,DBPSW);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn ;
	}
	@SuppressWarnings("static-access")
	public void close(){
		if(conn != null){
			try {
				this.conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
