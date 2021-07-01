package br.com.java.view;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.com.java.dao.UsuarioDao;
import br.com.java.model.Usuario;

@WebServlet(name = "cadastrarUsuario", urlPatterns = {"/cadastrarUsuario"})
public class CadastrarUsuario extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/cadastrarUsuario.jsp");
		dispatcher.forward(request, response);
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		System.out.println("POST - Cadastrar Usuário");
		
		Usuario usuario = new Usuario();
		usuario.setLogin(request.getParameter("usuario"));
		usuario.setSenha(request.getParameter("senha"));
		usuario.setNome(request.getParameter("nome"));
		usuario.setCpf(request.getParameter("cpf"));
		usuario.setTelefone(request.getParameter("telefone"));
		usuario.setEndereco(request.getParameter("endereco"));
		
		UsuarioDao dao = new UsuarioDao();
		
		if (dao.cadastraUsuario(usuario)) {
			request.setAttribute("usuario", usuario);
			HttpSession session = request.getSession();
			session.setAttribute("usuario", usuario);
			
		} else {
			
			request.setAttribute("erro", "Usuário ou senha inválidas!.");
		}
		
		response.sendRedirect("listarProdutos");
	}
}
