package equipo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

//import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;

// Data Access Object
public class DAO {
    private static Conexion c = new Conexion();

    public static List<Administrador> dameUsuarios() {
        Statement stm = null;
        ResultSet rs = null;
        Connection conn = null;
        List<Administrador> resultado = new ArrayList<>();

        conn = c.getConnection();

        try {
            String sql = "SELECT * from administrador";
            stm = (Statement) conn.createStatement();
            rs = stm.executeQuery(sql);
            while (rs.next()) {
                Administrador u = new Administrador(rs.getString("idAdministrador"), rs.getString("nombreAdministrador"));
                resultado.add(u);
            }
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            if (rs != null)
                try {
                    rs.close();
                } catch (SQLException e) {
                    System.out.println(e);
                }
            rs = null;
            if (stm != null) {
                try {
                    stm.close();
                } catch (Exception e) {
                    System.out.println(e);
                }
                stm = null;
            }
            try {
                conn.close();
            } catch (Exception e) {
                System.out.println(e);
            }
        }

        return resultado;
    }
    
}