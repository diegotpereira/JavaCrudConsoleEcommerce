package br.com.java.dao;

import java.util.ArrayList;

import br.com.java.model.Venda;

public class VendasDao {
	
	public boolean cadastraVenda(Venda venda) {return false;}
	
	public boolean alteraVenda(Venda venda) {return false;}
	
	public boolean excluiVenda(Integer toDelete) {return false;}
	
	public Venda procuraVendaPeloId(Integer idVenda) {return null;}
	
	public ArrayList<Venda> procuraTodosVendas(){return null;}
}
