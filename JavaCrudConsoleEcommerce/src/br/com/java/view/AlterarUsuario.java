package br.com.java.view;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.java.dao.UsuarioDao;
import br.com.java.model.Usuario;

@WebServlet(name = "AlterarUsuario", urlPatterns = {"/alterarUsuario"})
public class AlterarUsuario extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/WEB-INF/AlterarUsuario.jsp");
		
		dispatcher.forward(request, response);
	}
	
	@Override
	protected void doPost (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("POST- Cadastrar Usuario");
		
		Usuario usuario = new Usuario();
		usuario.setLogin(request.getParameter("usuario"));
		usuario.setSenha(request.getParameter("senha"));
		usuario.setNome(request.getParameter("nome"));
		usuario.setCpf(request.getParameter("cpf"));
		usuario.setTelefone(request.getParameter("telefone"));
		usuario.setEndereco(request.getParameter("endereco"));
		
		String page = "index.jsp";
		
		UsuarioDao dao = new UsuarioDao();
		
		if (dao.alteraUsuario(null)) {
			
			page = "home.jsp";
			request.setAttribute("usuario", usuario);
			
		} else {
			
			request.setAttribute("erro", "Usuário ou senha inválidos!.");
		}
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(page);
		dispatcher.forward(request, response);
	}

}
