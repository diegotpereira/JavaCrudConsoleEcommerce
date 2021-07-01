package br.com.java.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

import br.com.java.db.ConnectionFactory;
import br.com.java.model.Usuario;

public class UsuarioDao {
	
	public boolean cadastraUsuario(Usuario usuario) {
		
		String sql = "INSERT INTO tb_usuario" + "(login, senha, nome, cpf, telefone, endereco) VALUES " + "(?,?,?,?,?,?);";
		PreparedStatement prepareStatement;
		
		try {
			prepareStatement = ConnectionFactory.getConnection().prepareStatement(sql);
			prepareStatement.setString(1, usuario.getLogin());
			prepareStatement.setString(2, usuario.getSenha());
			prepareStatement.setString(3, usuario.getNome());
			prepareStatement.setString(4, usuario.getCpf());
			prepareStatement.setString(5,  usuario.getTelefone());
			prepareStatement.setString(6, usuario.getEndereco());
			
			prepareStatement.executeUpdate();
			
			return true;
			
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
			
			return false;
		}
	}
	
	public boolean alteraUsuario(Usuario usuario) {return false;}
	
	public boolean excluiUsuario(String toDelete) {return false;}
	
	public Usuario procuraUsuarioPeloId(String login) {
		
		try {
			String sql = "SELECT * FROM tb_usuario WHERE login = ? ; ";
			PreparedStatement con = ConnectionFactory.getConnection().prepareStatement(sql);
			
			con.setString(1, login);
			ResultSet rs = con.executeQuery();
			Usuario usuario = new Usuario();
			
			if (rs.next()) {
				usuario.setLogin(rs.getString("login"));
				usuario.setNome(rs.getString("nome"));
				usuario.setCpf(rs.getString("cpf"));
				usuario.setTelefone(rs.getString("telefone"));
				usuario.setEndereco(rs.getString("endereco"));
			}
			
			rs.close();
			con.close();
			
			return usuario;
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return null;
		
	}
	
	public boolean validar(Usuario usuario) {
		
		try {
			Connection con = ConnectionFactory.getConnection();
			
			String sql = "SELECT * FROM tb_usuario WHERE login = ? and senha = ?";
			
			// Execute SQL
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, usuario.getLogin());
			ps.setString(2,  usuario.getSenha());
			
			// Apresentando resultado SQL
			ResultSet rs = ps.executeQuery();
			
			if (rs.first()) {
				
				return true;
			}
		} catch (SQLException e) {
			// TODO: handle exception
			Logger.getLogger(UsuarioDao.class.getName()).log(Level.SEVERE, null, e);
		}
		
		return false;
		
	}
}
