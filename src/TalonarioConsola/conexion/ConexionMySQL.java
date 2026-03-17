package TalonarioConsola.conexion;


import java.util.logging.Logger;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;


import TalonarioConsola.model.Talonario;

public class ConexionMySQL {

	private final String user = "user01";
	private final String password = "password";
	private final String url = "jdbc:mysql://LocalHost:3306/talonario";
	private final String driver = "com.mysql.cj.jdbc.Driver";
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
