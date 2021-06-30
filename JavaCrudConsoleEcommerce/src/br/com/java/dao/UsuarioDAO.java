package br.com.java.dao;

import br.com.java.model.Usuario;

public class UsuarioDAO {
	
	public boolean cadastraUsuario(Usuario usuario) {return false;}
	
	public boolean alteraUsuario(Usuario usuario) {return false;}
	
	public boolean excluiUsuario(String toDelete) {return false;}
	
	public Usuario procuraUsuarioPeloId(String login) {return null;}
	
	public boolean validar(Usuario u) {return false;}
}
