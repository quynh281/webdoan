package utills;

import java.sql.Connection;
import java.sql.DriverManager;

public class dataConnection {
	private static String DB_URL = "jdbc:mysql://localhost:3306/databasewebsitekhoatin";
    private static String USER_NAME = "quynh";
    private static String PASSWORD = "28112004";

    public static Connection getConnection() {
        Connection connect = null;
        try {
        	Class.forName("com.mysql.cj.jdbc.Driver");
            connect = DriverManager.getConnection(DB_URL,USER_NAME,PASSWORD);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return connect;
    }
    
}
