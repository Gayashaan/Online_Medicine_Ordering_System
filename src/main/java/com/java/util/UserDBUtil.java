package com.java.util;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import com.java.model.User;

import projectpackage1.DBconnection;


public class UserDBUtil {
	
	private static boolean isSuccess;
	
	private static Connection con = null;
	private static Statement stmt = null;
	private static ResultSet rs = null;
	
public static boolean validate(String username, String password, String userType) {
		
		try {
			con = DBconnection.getConnection();
			stmt = con.createStatement();
			
			if("customer".equals(userType)) {
				String sql = "SELECT * FROM  customer  WHERE userName='"+username+"' AND password='"+password+"'";
				rs = stmt.executeQuery(sql);
				
				if(rs.next()) {
					isSuccess = true;
				}
				else {
					isSuccess = false;
				}
			}
			
			else {
				String sql = "SELECT * FROM emp_table WHERE username='"+username+"' AND pwd='"+password+"' AND job='"+userType+"'";
				rs = stmt.executeQuery(sql);
				
				if(rs.next()) {
					isSuccess = true;
				}
				else {
					isSuccess = false;
				}
			}
				
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return isSuccess;
	}
	
	public static boolean createUser(String uname, String email, String fname, String lname, String address, String gender, String birthdate,String phone, String pwd) {
		
		boolean isSuccess = false;
		
		try {
			con = DBconnection.getConnection();
			stmt = con.createStatement();
			
			String sql = "INSERT INTO customer VALUES(0,'"+uname+"','"+email+"', '"+fname+"', '"+lname+"', '"+address+"', '"+gender+"', '"+birthdate+"', '"+phone+"', '"+pwd+"')";
			
			int rs = stmt.executeUpdate(sql);
			
			if(rs > 0) {
				isSuccess = true;
			}
			else {
				isSuccess = false;
			}
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return isSuccess;
		
	}
	
	public static User getUser(String un) {
		User user = new User();
		

		try {
            String query = "select * from omos.customer where userName=?";
            PreparedStatement pst = con.prepareStatement(query);
            pst.setString(1, un);
            rs = pst.executeQuery();
            if(rs.next()){
            	
            	user.setId(rs.getInt(1));
            	user.setUname(rs.getString(2));
            	
            }
        } catch (SQLException e) {
            System.out.print(e.getMessage());
        }
		
		return user;
	}
	

}
