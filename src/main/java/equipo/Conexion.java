package equipo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    private static String url = "jdbc:mysql://127.0.0.1:3306/freepics";
    private static String driverName = "com.mysql.jdbc.Driver"; // com.mysql.cj.jdbc.Driver
    private static String username = "root";
    private static String password = "cisco";
    // variable de conexion
    private static Connection connection = null;

    public  Connection getConnection(){ //eliminé "static porque me produce un error en DAO"
        try {
            Class.forName(driverName);
            connection = DriverManager.getConnection(url, username, password);
        } catch (SQLException e) {
            System.out.println(" SQL:" + e);
        } catch (ClassNotFoundException e){
            System.out.println("Driver:" + e);
        }
        System.out.println("conectado a la bd correctamente" + connection);
        return connection ;
    }
}