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

@WebServlet(name = "AlterarProduto", urlPatterns = {"/alterarProduto"})
public class AlterarProduto extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		
		ProdutoDao dao = new ProdutoDao();
		
		Integer idProduto = Integer.parseInt(request.getParameter("idProduto"));
		
		Produto produto = dao.procuraProdutoPeloId(idProduto);
		request.setAttribute("produto", produto);
		
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/WEB-INF/ModuloProduto/alterarProduto.jsp");
		dispatcher.forward(request, response);
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("Post - Alterar Produto");
		request.setCharacterEncoding("UTF-8");
		
		Produto produto = new Produto();
		
		int idProduto = Integer.parseInt(request.getParameter("idProduto"));
		produto.setCodigo(idProduto);
		produto.setNome(request.getParameter("nome"));
		produto.setValor(Double.parseDouble(request.getParameter("valor")));
		produto.setDescricao(request.getParameter("descricao"));
		
		ProdutoDao dao = new ProdutoDao();
		
		if (dao.alteraProduto(produto)) {
			response.sendRedirect("listarProdutos");
		} else {
			
			request.setAttribute("erro", "Erro ao alterar");
		}
	}
}
