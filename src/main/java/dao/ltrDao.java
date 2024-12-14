package dao;

import model.lecturer;
import utills.dataConnection;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
public class ltrDao {
	public static List<lecturer> getAllLecturers() {
        List<lecturer> lecturers = new ArrayList<>();
        String query = "SELECT * FROM Lecturer";
        
        try (Connection connection = dataConnection.getConnection();
             Statement statement = connection.createStatement();
             ResultSet rs = statement.executeQuery(query)) {
            
            while (rs.next()) {
                lecturer lec = new lecturer();
                lec.setId(rs.getInt("id"));
                lec.setTen(rs.getString("ten"));
                lec.setChucDanh(rs.getString("chucDanh"));
                lec.setEmail(rs.getString("email"));
                lec.setBoMon(rs.getString("boMon"));
                lec.setUrlImage(rs.getString("urlImage"));
                
                lecturers.add(lec);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return lecturers;
    }
	public static void main(String[] args) {
		List<lecturer> lecturers = getAllLecturers();

		// Kiểm tra nếu danh sách giảng viên không rỗng và in thông tin giảng viên
		if (lecturers != null && !lecturers.isEmpty()) {
			for (lecturer lec : lecturers) {
				System.out.println("ID: " + lec.getId());
				System.out.println("Tên: " + lec.getTen());
				System.out.println("Chức danh: " + lec.getChucDanh());
				System.out.println("Email: " + lec.getEmail());
				System.out.println("Bộ môn: " + lec.getBoMon());
				System.out.println("URL hình ảnh: " + lec.getUrlImage());
				System.out.println("-----");
			}
		} else {
			System.out.println("Không có giảng viên nào.");
		}
	}

	public static lecturer getLecturerById(int id) {
	    lecturer lec = null;
	    String query = "SELECT * FROM Lecturer WHERE id = ?";
	    
	    try (Connection connection = dataConnection.getConnection();
	         PreparedStatement statement = connection.prepareStatement(query)) {
	        
	        statement.setInt(1, id);
	        
	        ResultSet resultSet = statement.executeQuery();
	        
	        if (resultSet.next()) {
	            lec = new lecturer();
	            lec.setId(resultSet.getInt("id"));
	            lec.setTen(resultSet.getString("ten"));
	            lec.setChucDanh(resultSet.getString("chucDanh"));
	            lec.setEmail(resultSet.getString("email"));
	            lec.setBoMon(resultSet.getString("boMon"));
	            lec.setUrlImage(resultSet.getString("urlImage"));
	        }
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	    
	    return lec;
	}

	public static boolean updateLecturer(lecturer lec) {
	    String query = "UPDATE Lecturer SET ten = ?, chucDanh = ?, email = ?, boMon = ?, urlImage = ? WHERE id = ?";
	    
	    try (Connection connection = dataConnection.getConnection();
	         PreparedStatement statement = connection.prepareStatement(query)) {
	        
	        statement.setString(1, lec.getTen());
	        statement.setString(2, lec.getChucDanh());
	        statement.setString(3, lec.getEmail());
	        statement.setString(4, lec.getBoMon());
	        statement.setString(5, lec.getUrlImage());
	        statement.setInt(6, lec.getId());
	        
	        int rowsUpdated = statement.executeUpdate();
	        return rowsUpdated > 0;
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	    return false;
	}
	public static boolean deleteLecturer(int id) {
	    String query = "DELETE FROM Lecturer WHERE id = ?";
	    try (Connection connection = dataConnection.getConnection();
	         PreparedStatement ps = connection.prepareStatement(query)) {
	        ps.setInt(1, id);
	        return ps.executeUpdate() > 0;
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	    return false;
	}

	public static boolean addLecturer(lecturer lec) {
	    String query = "INSERT INTO Lecturer (ten, chucDanh, email, boMon, urlImage) VALUES (?, ?, ?, ?, ?)";
	    boolean success = false;
	    
	    try (Connection connection = dataConnection.getConnection();
	         PreparedStatement statement = connection.prepareStatement(query)) {
	        
	        statement.setString(1, lec.getTen());
	        statement.setString(2, lec.getChucDanh());
	        statement.setString(3, lec.getEmail());
	        statement.setString(4, lec.getBoMon());
	        statement.setString(5, lec.getUrlImage());
	        
	        int rowsAffected = statement.executeUpdate();
	        
	        if (rowsAffected > 0) {
	            success = true;  // Thành công khi ít nhất một dòng bị ảnh hưởng
	        }
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	    
	    return success;
	}	
}
