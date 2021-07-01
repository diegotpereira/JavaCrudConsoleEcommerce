package br.com.java.dao;

import java.util.ArrayList;

import br.com.java.model.Produto;

public class ProdutoDao {
	
	public boolean cadastraProduto(Produto produto) {return false;}
	
	public boolean alteraProduto(Produto produto) {return false;}
	
	public boolean excluiProduto(Integer toDelete) {return false;}
	
	public Produto procuraProdutoPeloId(Integer idProduto) {return null;}
	
	public ArrayList<Produto> procuraTodosProdutos(){return null;}
}
