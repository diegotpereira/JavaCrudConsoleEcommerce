package br.com.java.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import br.com.java.db.ConnectionFactory;
import br.com.java.model.Produto;

public class ProdutoDao {
	
	public boolean cadastraProduto(Produto produto) {
		
		String sql = "INSERT INTO tb_produto" + "(nome, valor, descricao) VALUES " + " (?,?,?); ";
		PreparedStatement preparedStatement;
		
		try {
			
			preparedStatement = ConnectionFactory.getConnection().prepareStatement(sql);
			preparedStatement.setString(1, produto.getNome());
			preparedStatement.setDouble(2, produto.getValor());
			preparedStatement.setString(3, produto.getDescricao());
			
			preparedStatement.executeUpdate();
			
			return true;
			
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
			
			return false;
		}
	}
	
	public boolean alteraProduto(Produto produto) {
		
		String sql = "UPDATE tb_produto SET nome = ?, valor = ?, descricao = ? " + "WHERE idProduto = ?; ";
		
		// Execute SQL
		PreparedStatement preparedStatement;
		
		try {
			preparedStatement = ConnectionFactory.getConnection().prepareStatement(sql);
			preparedStatement.setString(1, produto.getNome());
			preparedStatement.setDouble(2, produto.getValor());
			preparedStatement.setString(3, produto.getDescricao());
			preparedStatement.setInt(4, produto.getCodigo());
			
			preparedStatement.executeUpdate();
			
			return true;
			
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
			
			return false;
		}
	}
	
	public boolean excluiProduto(Integer toDelete) {
		
		String sql = "DELETE FROM tb_produto WHERE idProduto = ?; ";
		
		// Execute SQL
		PreparedStatement preparedStatement;
		
		try {
			
			preparedStatement = ConnectionFactory.getConnection().prepareStatement(sql);
			preparedStatement.setInt(1, toDelete);
			preparedStatement.executeUpdate();
			
			return true;
			
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
			
			return false;
		}
	}
	
	public Produto procuraProdutoPeloId(Integer idProduto) {
		
		try {
			
			String sql = "SELECT * FROM tb_produto WHERE idProduto = ? ;";
			
			// Execute SQL
			PreparedStatement con = ConnectionFactory.getConnection().prepareStatement(sql);
			
			// Apresentando resultado SQL
			con.setInt(1, idProduto);
			ResultSet rs = con.executeQuery();
			Produto produto = new Produto();
			
			if (rs.next()) {
				produto.setCodigo(rs.getInt("idProduto"));
				produto.setNome(rs.getString("nome"));
				produto.setValor(rs.getDouble("valor"));
				produto.setDescricao(rs.getString("descricao"));
			}
			
			rs.close();
			con.close();
			
			return produto;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return null;
		
	}
	
	public ArrayList<Produto> procuraTodosProdutos(){
		
		try {
			
			// Execute SQL
			String sql = "SELECT * FROM tb_produto; ";
			PreparedStatement con = ConnectionFactory.getConnection().prepareStatement(sql);
			
			// Apresentando resultado SQL
			ResultSet rs = con.executeQuery();
			
			ArrayList<Produto> listaProdutos = new ArrayList<>();
			
			while (rs.next()) {
				
				Produto produto = new Produto();
				produto.setCodigo(rs.getInt("idProduto"));
				produto.setNome(rs.getString("nome"));
				produto.setValor(rs.getDouble("valor"));
				produto.setDescricao(rs.getString("descricao"));
				
				listaProdutos.add(produto);
			}
			
			rs.close();
			con.close();
			
			return listaProdutos;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return null;
		
	}
}
