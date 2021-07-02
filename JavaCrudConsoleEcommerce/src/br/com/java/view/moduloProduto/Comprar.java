package br.com.java.view.moduloProduto;

import java.io.IOException;
import java.util.Calendar;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.java.dao.ProdutoDao;
import br.com.java.dao.VendasDao;
import br.com.java.model.Produto;
import br.com.java.model.Venda;

@WebServlet(name = "Comprar", urlPatterns = {"/comprar"})
public class Comprar extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		
		ProdutoDao dao = new ProdutoDao();
		Produto produto = dao.procuraProdutoPeloId(Integer.parseInt(request.getParameter("idProduto")));
		request.setAttribute("produto", produto);
		
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/comprar.jsp");
		dispatcher.forward(request, response);
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Post - Cadastrar Produto");
		
		Venda venda = new Venda();
		venda.setData(Calendar.getInstance().getTime().toString());
		venda.setNomeComprador(request.getParameter("nomeComprador"));
		venda.setCartaoComprador(request.getParameter("cartaoComprador"));
		venda.setCodSegurancaComprador(request.getParameter("codSegurancaComprador"));
		venda.setValor(Double.parseDouble(request.getParameter("valor")));
		venda.setIdProduto(Integer.parseInt(request.getParameter("idProduto")));
		
		VendasDao dao = new VendasDao();
		
		if (dao.cadastraVenda(venda)) {
			RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/compraRealizadaComSucesso.jsp");
			dispatcher.forward(request, response);
			
		} else {
			request.setAttribute("erro", "Produto não inserido!.");
		}
	}
}
