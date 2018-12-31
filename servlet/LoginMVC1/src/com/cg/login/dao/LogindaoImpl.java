package com.cg.login.dao;

import java.sql.Connection;

import com.cg.login.bean.LoginBean;
import com.cg.login.exception.LoginException;
import com.cg.login.util.DbConnection;

public class LogindaoImpl implements ILoginDao {

	@Override
	public boolean verifyLogin(LoginBean loginBean) throws LoginException {
		// TODO Auto-generated method stub
		boolean result=false;
		Connection connection=DbConnection.getConnection();
		return result;
	}

}
