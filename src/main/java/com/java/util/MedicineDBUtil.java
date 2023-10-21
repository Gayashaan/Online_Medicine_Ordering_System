package com.java.util;

import java.sql.Connection;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import projectpackage1.DBconnection;
import com.java.model.*;
import java.sql.PreparedStatement;

public class MedicineDBUtil {
		private static boolean isSuccess;
		
		private static Connection con = null;
		private static Statement stmt = null;
		private static ResultSet rs = null;
		
		public static boolean addMed(String code, String name, String ind, int qty, String expD, int price, String manuf) {
			
			boolean isSuccess = false;
			
			try {
				con = DBconnection.getConnection();
				stmt = con.createStatement();
				
				String sql = "INSERT INTO omos.medicines VALUES(0,'"+code+"','"+name+"', '"+ind+"', '"+qty+"', '"+expD+"', '"+price+"', '"+manuf+"' )";
				
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
		
		public static List<Medicine> getMedicineDeteials(){
			
			ArrayList<Medicine> medDets = new ArrayList<>() ;
			
			try {
				
				con = DBconnection.getConnection();
				stmt = con.createStatement();
				
				String sql = "select * from omos.medicines";
				
				rs = stmt.executeQuery(sql);
				
				while(rs.next()) {
					int id= rs.getInt(1);
					String medCode = rs.getString(2);
					String medName = rs.getString(3);
					String indic = rs.getString(4);
					int qty = rs.getInt(5);
					String expDate = rs.getString(6);
					int unitPrice = rs.getInt(7);
					String manuf = rs.getString(8);
					
					Medicine m = new Medicine(id, medCode, medName, indic, qty, expDate, unitPrice,manuf);
					medDets.add(m);
					
				}
				
				
				
			}catch(Exception e){
				e.printStackTrace();
			}
			
			
			return medDets;
			
			
		}
		
		public static List<Medicine> getMedicine(int id){
			
			List <Medicine> singleMed = new ArrayList<>();
			
			try {
				con = DBconnection.getConnection();
				stmt = con.createStatement();
				
				String sql = "select * from omos.medicines where id='"+id+"'";
				rs =stmt.executeQuery(sql);
				
				if(rs.next()) {
					int medid= rs.getInt(1);
					String medCode = rs.getString(2);
					String medName = rs.getString(3);
					String indic = rs.getString(4);
					int qty = rs.getInt(5);
					String expDate = rs.getString(6);
					int unitPrice = rs.getInt(7);
					String manuf = rs.getString(8);
					
					Medicine med = new Medicine(medid, medCode, medName,indic, qty, expDate, unitPrice, manuf);
					singleMed.add(med);
				}
				
			}catch(Exception e) {
				e.printStackTrace();
			}
			
			return singleMed;
		}
		
		public static boolean updateMed(String code, String name, String ind, int qty, String expD, double price, String manuf) {
			boolean isSuccess = false;
			try {
				con = DBconnection.getConnection();
				stmt = con.createStatement();
				
				String sql = "update omos.medicines set medCode = '"+code+"', medName='"+name+"', indication='"+ind+"', qty='"+qty+"', expDate='"+expD+"', price='"+price+"', manufacturer='"+manuf+"' where medCode= '"+code+"'";
				
				int rs = stmt.executeUpdate(sql);
				
				if(rs > 0) {
					isSuccess = true;
				}else {
					isSuccess = false;
				}
				
				
				
			}catch (Exception e){
				
			}
			
			return isSuccess;
			
		}
		

		
		public static boolean deleteMed(int id) {
			
			boolean isSuccess = false;
			
			try {
				con = DBconnection.getConnection();
				stmt = con.createStatement();
				
				String sql = "delete from omos.medicines where id='"+id+"'";
				
				int rs = stmt.executeUpdate(sql);
				
				if(rs > 0) {
					isSuccess = true;
				}else {
					isSuccess = false;
				}
				
			}catch (Exception e){
				
			}
			
			return isSuccess;
			
		}
		
		public static Medicine getSingleProduct(int id) {
			 Medicine row = null;
		        try {
		            String sql = "select * from omos.medicines where id=? ";

		            PreparedStatement pst = con.prepareStatement(sql);
		            pst.setInt(1, id);
		            ResultSet rs = pst.executeQuery();

		            while (rs.next()) {
		            	row = new Medicine();
		                row.setId(rs.getInt("id"));
		                row.setMedName(rs.getString("medName"));
		                row.setManufacturer(rs.getString("manufacturer"));
		                row.setPrice(rs.getDouble("price"));
		                //row.setImage(rs.getString("image"));
		            }
		        } catch (Exception e) {
		            e.printStackTrace();
		            System.out.println(e.getMessage());
		        }

		        return row;
		    }
		
		
		public static double getTotalCartPrice(ArrayList<Cart> cartList) {
	        double sum = 0;
	        try {
	            if (cartList.size() > 0) {
	                for (Cart item : cartList) {
	                    String sql = "select price from omos.medicines where id=?";
	                    PreparedStatement pst = con.prepareStatement(sql);
	                    pst.setInt(1, item.getId());
	                    rs = pst.executeQuery();
	                    while (rs.next()) {
	                        sum+=rs.getDouble("price")*item.getQuantity();
	                    }

	                }
	            }

	        } catch (SQLException e) {
	            e.printStackTrace();
	            System.out.println(e.getMessage());
	        }
	        return sum;
	    }

		
		public static List<Cart> getCartProducts(ArrayList<Cart> cartList) {
	        List<Cart> book = new ArrayList<>();
	        try {
	            if (cartList.size() > 0) {
	                for (Cart item : cartList) {
	                	con = DBconnection.getConnection();
	                	String sql = "select * from omos.medicines where id=?";
	                    PreparedStatement pst = con.prepareStatement(sql);
	                    pst.setInt(1, item.getId());
	                    rs = pst.executeQuery();
	                    
	                    
	                    while (rs.next()) {
	                        Cart row = new Cart();
	                        row.setId(rs.getInt("id"));
	                        row.setMedName(rs.getString("medName"));
	                        row.setManufacturer(rs.getString("Manufacturer"));
	                        row.setPrice(rs.getDouble("price")*item.getQuantity());
	                        row.setQuantity(item.getQuantity());
	                        book.add(row);
	                    }

	                }
	            }

	        } catch (SQLException e) {
	            e.printStackTrace();
	            System.out.println(e.getMessage());
	        }
	        return book;
	    }
		
		
}
