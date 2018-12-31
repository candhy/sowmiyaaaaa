package com.cg.login.service;

import com.cg.login.bean.LoginBean;
import com.cg.login.dao.ILoginDao;
import com.cg.login.dao.LogindaoImpl;
import com.cg.login.exception.LoginException;

public class LoginServiceimpl implements ILoginService {

	@Override
	public boolean validate(LoginBean loginBean) {
		boolean result=false;
		if(loginBean.getUsername().length()>3 && loginBean.getPassword().length()>3)
		{
			result =true;
		}


		return result;
	}

	@Override
	public boolean verifyLogin(LoginBean loginBean) throws LoginException {
		// TODO Auto-generated method stub
		ILoginDao dao=new LogindaoImpl();
		
		return dao.verifyLogin(loginBean);
	}

}
