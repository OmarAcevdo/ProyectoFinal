package controladores;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class conexionBD {
    private Connection con = null;
    private Statement sta = null;

    public conexionBD() throws SQLException {
        String user = "root";
        String pass = "316497069";
        String url = "jdbc:mysql://localhost/tiendatambo";
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            con = DriverManager.getConnection(url, user, pass);
            sta = con.createStatement();
        } catch (InstantiationException | IllegalAccessException
                | ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

    public Statement getConexion() {
        return sta;
    }
}
