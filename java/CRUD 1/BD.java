package thiago.cadastro;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public final class BD {
    public static final String SGBD = "mysql";
    public static final String IP = "localhost";
    public static final String PORT = "3306";
    public static final String NAME = "cadastro";
    public static final String USER = "root";
    public static final String USER_PWD = "";
    
    private BD() {}
    
    public final static Connection getConnection() {
        final String connStr = String.format("jdbc:%s://%s:%s/%s", SGBD, IP, PORT, NAME);
        
        Connection conn;
        try { // Gerar a conexão
            conn = DriverManager.getConnection(connStr, USER, USER_PWD);
            return conn;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Conexão com o banco de dados falhou", JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }
    
    public final static Cliente cadastrar(Cliente cliente) {
        return cliente;
    }
}
