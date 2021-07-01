package br.com.java.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import br.com.java.db.ConnectionFactory;
import br.com.java.model.Venda;

public class VendasDao {
	
	public boolean cadastraVenda(Venda produto) {
		
		String sql = "INSERT INTO tb_vendas" + "(data, nomeComprador, cartaoComprador, codSegurancaComprador, valor, idProdutoFk) VALUES " + "(?,?,?,?,?,?);";
		
		// Execute SQL
		PreparedStatement preparedStatement;
		
		try {
			preparedStatement = ConnectionFactory.getConnection().prepareStatement(sql);
			preparedStatement.setString(1, produto.getData());
			preparedStatement.setString(2, produto.getNomeComprador());
			preparedStatement.setString(3, produto.getCartaoComprador());
			preparedStatement.setString(4, produto.getCodSegurancaComprador());
			preparedStatement.setDouble(5, produto.getValor());
			
			preparedStatement.executeUpdate();
			
			return true;
			
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
			
			return false;
		}
	}
	
	public boolean alteraVenda(Venda produto) {
		
		String sql = "UPDATE tb_vendas SET data = ?, nomeComprador = ?, cartaoComprador = ?, codSegurancaComprador = ?, valor = ?, idProdutoFk = ?" + "WHERE idVenda = ?;";
		
		// Execute SQL
		PreparedStatement preparedStatement;
		
		try {
			preparedStatement = ConnectionFactory.getConnection().prepareStatement(sql);
			preparedStatement.setString(1, produto.getData());
			preparedStatement.setString(2, produto.getNomeComprador());
			preparedStatement.setString(3, produto.getCartaoComprador());
			preparedStatement.setString(4, produto.getCodSegurancaComprador());
			preparedStatement.setDouble(5, produto.getValor());
			preparedStatement.setDouble(6, produto.getIdVenda());
			
			preparedStatement.executeUpdate();
			
			return true;
			
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
			
			return false;
		}
	}
	
	public boolean excluiVenda(Integer toDelete) {
		
		String sql = "DELETE FROM tb_produto WHERE idVenda = ?; ";
		
		PreparedStatement preparedStatement;
		
		try {
			preparedStatement = ConnectionFactory.getConnection().prepareStatement(sql);
			preparedStatement.setInt(1, toDelete);
			
			return true;
			
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
			
			return false;
		}
	}
	
	public Venda procuraVendaPeloId(Integer idVenda) {
		
		try {
			String sql = "SELECT * FROM tb_produto WHERE idVenda = ?; ";
			PreparedStatement con = ConnectionFactory.getConnection().prepareStatement(sql);
			
			con.setInt(1, idVenda);
			ResultSet rs = con.executeQuery();
			Venda produto = new Venda();
			
			if (rs.next()) {
				produto.setIdVenda(rs.getInt("idVenda"));
				produto.setData(rs.getString("data"));
				produto.setNomeComprador(rs.getString("nomeComprador"));
				produto.setCartaoComprador(rs.getString("cartaoComprador"));
				produto.setCodSegurancaComprador(rs.getString("codSegurancaComprador"));
				produto.setValor(rs.getDouble("valor"));
				produto.setIdProduto(rs.getInt("idProdutoFk"));
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
	
	public ArrayList<Venda> procuraTodosVendas(){
		
		try {
			
			String sql = "SELECT * FROM tb_vendas";
			
			// Execute SQL
			PreparedStatement con = ConnectionFactory.getConnection().prepareStatement(sql);
			
			
			// Apresentando resultado SQL
			ResultSet rs = con.executeQuery();
			
			ArrayList<Venda> listaVendas = new ArrayList<>();
			
			while (rs.next()) {
				
				Venda produto = new Venda();
				produto.setIdVenda(rs.getInt("idVenda"));
				produto.setData(rs.getString("data"));
				produto.setNomeComprador(rs.getString("nomeComprador"));
				produto.setCartaoComprador(rs.getString("cartaoComprador"));
				produto.setCodSegurancaComprador(rs.getString("codSegurancaComprador"));
				produto.setValor(rs.getDouble("valor"));
				produto.setIdProduto(rs.getInt("idProdutoFk"));
				
				listaVendas.add(produto);
			}
			
			rs.close();
			con.close();
			
			return listaVendas;
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return null;
		
	}
}
