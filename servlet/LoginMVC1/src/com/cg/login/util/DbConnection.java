package com.cg.login.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.sql.ConnectionPoolDataSource;

import com.cg.login.exception.ExceptionMessages;
import com.cg.login.exception.LoginException;

import javafx.fxml.LoadException;

//import com.cg.login.dao.Connection;

public class DbConnection {
	private static Connection connection=null;

	public static Connection getConnection() throws LoginException {
		// TODO Auto-generated method stub
		if (connection==null) {
			try {
			connection=DriverManager.getConnection("jdbc:oracle:thin:@10.219.34.3:1521/orcl","trg714","training714");
		}
			catch(SQLException e)
			{
				throw new LoginException(ExceptionMessages.MESSAGE1);
			}
		}
		return connection;
	}

}
