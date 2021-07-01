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

@WebServlet(name = "LoginServlet", urlPatterns = {"/login"})
public class Login extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/login.jsp");
		
		dispatcher.forward(request, response);
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Você entrou...");
		
		Usuario usuario = new Usuario();
		usuario.setLogin(request.getParameter("usuario"));
		usuario.setSenha(request.getParameter("senha"));
		
		String page = "index.jsp";
		
		UsuarioDao dao = new UsuarioDao();
		
		if (dao.validar(usuario)) {
			
			usuario = dao.procuraUsuarioPeloId(usuario.getLogin());
			request.setAttribute("usuario", usuario);
			HttpSession session = request.getSession();
			session.setAttribute("usuario", usuario);
			response.sendRedirect("listarProdutos");
		} else {
			
			request.setAttribute("erro", "Usuário ou Senha Inválidos!.");
		}
	}
	
	@Override
	public String getServletInfo() {
		
		return "Short description";
	}
}
