package br.com.java.view;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.java.dao.ProdutoDao;
import br.com.java.model.Produto;

@WebServlet(name = "Loja", urlPatterns = {"/loja"})
public class Loja extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Get - Loja");
		
		ProdutoDao dao = new ProdutoDao();
		
		ArrayList<Produto> listaDeProdutos = dao.procuraTodosProdutos();
		request.setAttribute("listaDeProdutos", listaDeProdutos);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/loja.jsp");
		dispatcher.forward(request, response);
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		System.out.println("Post - Cadastrar Usuario");
	}
}
