package br.com.java.view.moduloVendas;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.java.dao.VendasDao;
import br.com.java.model.Venda;

@WebServlet(name = "RelatorioDeVendas", urlPatterns = {"/relatorioDeVendas"})
public class RelatorioDeVendas extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		VendasDao dao = new VendasDao();
		ArrayList<Venda> listaDeVendas = dao.procuraTodosVendas();
		request.setAttribute("listaDeVendas", listaDeVendas);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/ModuloVenda/relatorioDeVendas.jsp");
		dispatcher.forward(request, response);
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Post - Cadastrar Usuario");
	}
}
