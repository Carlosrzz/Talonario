package TalonarioConsola.Conexion2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

import TalonarioConsola.model.Talonario;

public class ConexionMySQL {

    private final String user = "carlos";              //Su usuario
    private final String password = "Josue95077";        //Su contraseña
    private final String url = "jdbc:mysql://localhost:3306/factura_ra"; //Tu BDD (registro)
    private final String driver = "com.mysql.cj.jdbc.Driver";          //Driver de MySQL
    private Connection con = null;

    public Connection getConexion() throws SQLException { //Método para devolver la conexión
        try {
            Class.forName(driver);
            con = DriverManager.getConnection(this.url, this.user, this.password);
            
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e);
        }
        return con;
    }

    public void close() { // método para cerrar la conexión
        try {
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(Talonario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
