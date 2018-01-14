package com.smartcart.dao;

public interface LoginDao {
	 int insertLogin(String usname,String pswd);
	 
	 boolean checkLogin(String usname, String pswd);
	 
	 int updatePswd(String usname,String pswd);

}
