package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionManager{
	private String url;
	private String user;
	private String passWord;

	private ConnectionManager(String url,String user,String passWord){
		this.url = url;
		this.user = user;
		this.passWord = passWord;
	}

	public Connection getConnection() throws SQLException{
		Connection con = DriverManager.getConnection(url,user,passWord);
		return con;
	}
}
