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

@WebServlet(name = "CadastrarProduto", urlPatterns = {"/cadastrarProduto"})
public class CadastrarProduto extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/WEB-INF/ModuloProduto/cadastrarProduto.jsp");
		dispatcher.forward(request, response);
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Post - Cadastrar Produto");
		request.setCharacterEncoding("UTF-8");
		
		Produto produto = new Produto();
		produto.setNome(request.getParameter("nome"));
		produto.setValor(Double.parseDouble(request.getParameter("valor")));
		produto.setDescricao(request.getParameter("descricao"));
		
		String page = "home.jsp";
		
		ProdutoDao dao = new ProdutoDao();
		
		if (dao.cadastraProduto(produto)) {
			
			page = "listarProdutos";
			
			response.sendRedirect(page);
		} else {
			
			request.setAttribute("erro", "Produto não inserido!.");
		}
	}
}
