package br.com.java.view.moduloProduto;

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

@WebServlet(name = "ListarProdutos", urlPatterns = {"/listarProdutos"})
public class ListarProdutos extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		
		ProdutoDao dao = new ProdutoDao();
		
		ArrayList<Produto> listaDeProdutos = dao.procuraTodosProdutos();
		request.setAttribute("listaDeProdutos", listaDeProdutos);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/ModuloProduto/listarProdutos.jsp");
		dispatcher.forward(request, response);
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("POST - Cadastrar usuario");
	}
}
