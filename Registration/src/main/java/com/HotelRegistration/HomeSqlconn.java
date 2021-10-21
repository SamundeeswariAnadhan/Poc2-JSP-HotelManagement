package com.HotelRegistration;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class HomeSqlconn {
	private String dburl="jdbc:mysql://localhost:3306/userdb";
	private String dbname ="root";
	private String dbpassword="1234";
	private String dbdriver="com.mysql.jdbc.Driver";
	public void loadDriver(String dbdriver) throws ClassNotFoundException
	{
		Class.forName(dbdriver);
	}
	
	public Connection  getConnection() throws SQLException
	{
		Connection con = null;
		try {
			con= DriverManager.getConnection(dburl,dbname,dbpassword);
		}catch(SQLException e)
		{
			e.printStackTrace();
		}
		return con;
	}
	public ArrayList<Homeinfo> fetchroomlist() throws SQLException, ClassNotFoundException
	{
		loadDriver(dbdriver);
		Connection con=getConnection();
		
		String sql="select * from rooms";
		ArrayList<Homeinfo> hmlist=new ArrayList<Homeinfo>();
		try
		{
		PreparedStatement ps=con.prepareStatement(sql);
		ResultSet rs=ps.executeQuery();
		
		
		
		while(rs.next()) {
			Homeinfo home=new Homeinfo();
			home.setSno(rs.getString("s.no"));
			home.setRoom_Number(rs.getString("Room_Number"));
			home.setRoom_Name(rs.getString("Room_Name"));
			hmlist.add(home);
			
//			System.out.println("home.SNO = " +home.getSno());
//			System.out.println("home.Room_number = " +home.getRoom_Number());
//			System.out.println("home.Room_name =" +home.getRoom_Name());
		}
		
		return hmlist;
		}
		
		catch(SQLException e)
		{
			e.printStackTrace();
			
		}
		return hmlist;
		
	}
	
}
