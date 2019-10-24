
import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Soporte
 */
public class Coneccion {

    Connection conect = null;

    public Connection conexion() throws ClassNotFoundException, SQLException {

        try {

            Class.forName("org.gjt.mm.mysql.Driver");
            conect = (Connection) DriverManager.getConnection("jdbc:mysql://192.168.10.149:8080/baseprueba", "soporte", "y1WHtwbCKU0UGgTA");
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Error " + e);
        }
        return null;
    }

}
