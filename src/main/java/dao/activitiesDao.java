package dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.activities;
import utills.dataConnection;
public class activitiesDao {
	public List<activities> getAllActivities() {
	    List<activities> activities = new ArrayList<>();
	    String sql = "SELECT * FROM Activities";
	    try (Connection connection = dataConnection.getConnection();
	         PreparedStatement preparedStatement = connection.prepareStatement(sql);
	         ResultSet rs = preparedStatement.executeQuery()) {
	        while (rs.next()) {
	        	activities activities1 = new activities();
	        	activities1.setId(rs.getInt("id"));
	        	activities1.setTitle(rs.getString("title"));
	        	activities1.setDescription(rs.getString("description"));
	        	activities1.setImageUrl(rs.getString("image_url"));
	        	activities1.setCategory(rs.getString("category"));
	        	activities1.setCreatedAt(rs.getTimestamp("created_at"));
	            
	        }
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	    return activities;
	}

}
