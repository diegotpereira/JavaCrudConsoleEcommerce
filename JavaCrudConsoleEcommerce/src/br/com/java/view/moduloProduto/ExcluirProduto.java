package br.com.java.view.moduloProduto;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.java.dao.ProdutoDao;
import br.com.java.model.Produto;

@WebServlet(name = "ExcluirProduto", urlPatterns = {"/excluirProduto"})
public class ExcluirProduto extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/ModuloProduto/listarProdutos.jsp");
		dispatcher.forward(request, response);
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("Post - Excluir Produto");
		
		Produto produto = new Produto();
		produto.setCodigo(Integer.parseInt(request.getParameter("idProduto")));
		
		ProdutoDao dao = new ProdutoDao();
		dao.excluiProduto(produto.getCodigo());
		
		String page = "/ModuloProduto/listarProdutos.jsp";
		response.sendRedirect("listarProdutos");
	}
}
