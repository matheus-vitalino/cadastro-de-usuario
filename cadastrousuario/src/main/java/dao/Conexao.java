package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
    
    private static final String url = "jdbc:mysql://localhost:3306/cadastro?useSSL=false&serverTimezone=UTC";
    private static final String user = "root";
    private static final String password = "";
    
    private static Connection conn;
    
    public static Connection getConexao() throws SQLException
    {
        if(conn == null || conn.isClosed())
        {
            conn = DriverManager.getConnection(url,user,password);
        }
        
        return conn;
    }
}
