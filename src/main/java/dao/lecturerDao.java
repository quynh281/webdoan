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
public class lecturerDao {
	public static List<lecturer> getAllLecturers()  {
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
        }catch (SQLException e) {
            e.printStackTrace();
        }
        return lecturers;
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
	         PreparedStatement statement = connection.prepareStatement(query)) {
	        
	        statement.setInt(1, id);
	        
	        int rowsDeleted = statement.executeUpdate();
	        return rowsDeleted > 0;
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	    return false;
	}

	public static void main(String[] args) {
		List<lecturer> list = getAllLecturers();
		System.out.println(list);		
	}
	
}
