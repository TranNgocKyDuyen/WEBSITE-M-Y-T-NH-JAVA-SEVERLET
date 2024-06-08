package DAO;
import java.sql.Connection; 
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import Model.MayTinh;
import utils.DataHelper;
public class MayTinhs {
	private static final String SELECT_BY_ID = "select id,ima,name,price,mota from maytinhn3.maytinh where id =?";
	private static final String SELECT_ALL = "select * from maytinhn3.maytinh";
	private static final String DELETE = "delete from maytinhn3.maytinh where id = ?;";
	private static final String UPDATE = "update maytinhn3.maytinh set ima = ?, name = ?,price= ?, mota = ? where id = ?;";
	private static final String INSERT = "insert into maytinhn3.maytinh(id,ima,name,price,mota) value (?, ?, ?, ?, ?) ;";
	private static final String SELECT_ALL_CART = "select * from maytinhn3.maytinh";

	public static MayTinh getMayTinh(String id) {
		try {
			Connection conn = DataHelper.getConnection();
			PreparedStatement preparedStatement = conn.prepareStatement(SELECT_BY_ID);
			preparedStatement.setString(1, id);
			ResultSet rs = preparedStatement.executeQuery();
			while (rs.next()) {
				String name = rs.getString("name");
				String ima = rs.getString("ima");
				double price =  rs.getDouble("price");
				String mota = rs.getString("mota");
				return new MayTinh(id,ima,name,price,mota);
			}

			}catch (Exception e) {
				
				e.printStackTrace();
		}
		return new MayTinh();
	}
	
	public static List<MayTinh> getAll() {
		List<MayTinh> balos = new ArrayList<>();
		try {
			Connection conn = DataHelper.getConnection();
			Statement stmt = null;
			stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(SELECT_ALL);
			while (rs.next()) {
				String id = rs.getString("id");
				String name = rs.getString("name");
				String ima = rs.getString("ima");
				double price =  rs.getDouble("price");
				String mota = rs.getString("mota");
				balos.add(new MayTinh(id,ima, name, price, mota));
			}

			}catch (Exception e) {
				e.printStackTrace();
		}
		return balos;
	}
	
	public static List<MayTinh> getAllCart() {
		List<MayTinh> balos = new ArrayList<>();
		try {
			Connection conn = DataHelper.getConnection();
			Statement stmt = null;
			stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(SELECT_ALL_CART);
			while (rs.next()) {
				String id = rs.getString("id");
				String name = rs.getString("name");
				String ima = rs.getString("ima");
				double price =  rs.getDouble("price");
				String mota = rs.getString("mota");
				balos.add(new MayTinh(id,ima, name, price, mota));
			}

			}catch (Exception e) {
				e.printStackTrace();
		}
		return balos;
	}
	
	public static MayTinh getById(String id) {
		MayTinh balo = null;
	    try {
	        Connection conn = DataHelper.getConnection();
	        PreparedStatement stmt = conn.prepareStatement(SELECT_BY_ID);
	        stmt.setString(1, id);
	        ResultSet rs = stmt.executeQuery();
	        if (rs.next()) {
	            String name = rs.getString("name");
	            String ima = rs.getString("ima");
	            double price = rs.getDouble("price");
	            String mota = rs.getString("mota");
	            balo = new MayTinh(id, ima, name, price, mota);
	        }
	        rs.close();
	        stmt.close();
	        conn.close();
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	    return balo;
	}

	
	public static boolean create(MayTinh maytinh) {
		try {
			Connection conn = DataHelper.getConnection();
			PreparedStatement preparedStatement = conn.prepareStatement(INSERT);
			preparedStatement.setString(1, maytinh.getId());
			preparedStatement.setString(2, maytinh.getIma());
			preparedStatement.setString(3, maytinh.getName());
			preparedStatement.setDouble(4, maytinh.getPrice());
			preparedStatement.setString(5, maytinh.getMota());			
			String sql = preparedStatement.toString();
			return preparedStatement.execute();
			
			}catch (Exception e) {
				
				e.printStackTrace();
				return false;
		}
		
	}
	public static boolean update(MayTinh maytinh) {
		
		try {
			Connection conn = DataHelper.getConnection();
			PreparedStatement preparedStatement = conn.prepareStatement(UPDATE);
			preparedStatement.setString(1, maytinh.getIma());
			preparedStatement.setString(2, maytinh.getName());
			preparedStatement.setDouble(3, maytinh.getPrice());
			preparedStatement.setString(4, maytinh.getMota());			
			preparedStatement.setString(5, maytinh.getId());
			String sql = preparedStatement.toString();
			return preparedStatement.execute();
			
			}catch (Exception e) {
				
				e.printStackTrace();
				return false;
		}
	}
	
	public static boolean delete(MayTinh maytinh) {
	    try {
	        Connection conn = DataHelper.getConnection();
	        PreparedStatement preparedStatement = conn.prepareStatement(DELETE);
	        preparedStatement.setString(1, maytinh.getId());
	        return preparedStatement.execute();
	    } catch (Exception e) {
	        e.printStackTrace();
	        return false;
	    }
	}

	
	public static boolean save(MayTinh maytinh) {
		try {
			if( isExist(maytinh))
				return update(maytinh);
			else
				return create(maytinh);
		}catch (Exception e) {
			return false;
		} 
		
	}
	public static boolean isExist(MayTinh maytinh) {
		try {
			Connection conn = DataHelper.getConnection();
			PreparedStatement preparedStatement = conn.prepareStatement(SELECT_BY_ID);
			preparedStatement.setString(1, maytinh.getId());
			ResultSet rs = preparedStatement.executeQuery();
			while (rs.next()) {
				return true;
			}

			}catch (Exception e) {
				e.printStackTrace();
		}
		return false;
	}

	public static String getSelectAllCart() {
		return SELECT_ALL_CART;
	}
	
}
