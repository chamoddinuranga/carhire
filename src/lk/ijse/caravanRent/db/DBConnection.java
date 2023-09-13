package lk.ijse.caravanRent.db;

/*
    @author DanujaV
    @created 10/21/22 - 9:51 AM   
*/

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    private static DBConnection dbConnection;
    private Connection connection;

    private DBConnection() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/caravan_rent?useSSL=false", "root", "12345");
    }
    public static DBConnection getInstance() throws SQLException, ClassNotFoundException {
        return (null == dbConnection) ? dbConnection = new DBConnection() : dbConnection;
    }
    public Connection getConnection() {
        return connection;
    }
}
