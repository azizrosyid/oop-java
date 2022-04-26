package util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseUtil {
    private static final String DB_DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String DB_URL = "jdbc:mysql://localhost:3306/tugasjdbc";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "secretpassword";

    private static Connection connection;

    static {
        try
        {
            Class.forName(DB_DRIVER);
            connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    public static Connection getConnection()
    {
        return connection;
    }
}
