package br.com.java.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	
	public static Connection getConnection() throws SQLException {
		
		Connection con = null;
		
		try {
			String servidorNome= "localhost";
			String bancoDeDadosNome = "dbJavaCrudConsoleEcommerce?serverTimezone=UTC";
			String usuario = "root";
			String senha = "root";
			String driverNome = "com.mysql.cj.jdbc.Driver";
			Class.forName(driverNome);
			
			String url = "jdbc:mysql://" + servidorNome + "/" + bancoDeDadosNome;
			
			con = DriverManager.getConnection(url, usuario, senha);
			
			System.out.println("Conexão realizada com sucesso!.");
		} catch (ClassNotFoundException e) {
			// TODO: handle exception
			System.out.println("Driver não encontrado" + e.toString());
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println("Erro ao conectar o banco de dados " + e.toString());
		}
		return con;
	}
	
	
	
}
