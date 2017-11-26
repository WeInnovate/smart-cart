package com.smartcart.dao.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.TimeZone;

public class DBUtil {
	
	static Connection con = null;
	
	public static Connection getConnection() throws SQLException{
		
		if(con == null || con.isClosed()){
			con = DriverManager.getConnection("jdbc:h2:~/SMART_CART", "sa", "sa");
		}
		
		return con;
	}
	
	public static long getCurrentTimeStamp(){
		Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
		return calendar.getTimeInMillis();
	}

}
