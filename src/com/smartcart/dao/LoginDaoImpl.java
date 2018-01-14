package com.smartcart.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.smartcart.dao.util.DBUtil;

public class LoginDaoImpl implements LoginDao {

	@Override
	public int insertLogin(String usname, String pswd) {
		// TODO Auto-generated method stub
		int i=0;
		try {
			Connection con=DBUtil.getConnection();
			Statement stmt =con.createStatement();
			 i= stmt.executeUpdate("INSERT INTO LOGIN VALUES(' " +usname+" ',' " +pswd+ " ')");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return i;
	}

	@Override
	public boolean checkLogin(String usname, String pswd) {
		// TODO Auto-generated method stub
		boolean i=false;
		try {
			Connection con= DBUtil.getConnection();
			Statement stmt=con.createStatement();
			ResultSet rs= stmt.executeQuery("SELECT * FROM LOGIN");
			while (rs.next())
			{
				String un= rs.getString(1);
				String ps=rs.getString(2);
			
			if(un.equals(usname)&&ps.equals(pswd))
			{System.out.println("Credentials matched");
			i=true; 
			}
						}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return i;
	}

	@Override
	public int updatePswd(String usname, String pswd) {
		// TODO Auto-generated method stub
		return 0;
	}

}
