package br.com.criaps.conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ConexaoDB {
    
	public static Statement conectar() {

		Connection conn = null;

		try {
			Class.forName("com.mysql.cj.jdbc.Driver").newInstance();

			String url = "jdbc:mysql://localhost:3306/criaps";
			String user = "root";
			String password = "root";
			conn = DriverManager.getConnection(url, user, password);
			
			System.out.println("Conexão Estabelecida");
			System.out.println("ok");
			
			java.sql.Statement stmt = conn.createStatement();
			java.sql.ResultSet rs;
			
			return stmt;
			
		} catch (Exception ex) {
			System.out.println("SQLException: " + ex.getMessage());
			System.out.println("SQLState: " + ((SQLException) ex).getSQLState());
			System.out.println("VendorError: " + ((SQLException) ex).getErrorCode());
		}
		return null;
	}
}
