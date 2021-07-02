<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	
	<link href="resources/css/bootstrap.css" rel="stylesheet">
	<link href="resources/css/bootstrap-grid.css" rel="stylesheet">
	<link href="resources/css/loja.css" rel="stylesheet">
	
	<script src="resources/js/jquery.js"></script>
	<script src="resources/js/popper.js"></script>
	<script src="resources/js/bootstrap.js"></script>

<title>Insert title here</title>
</head>
<nav class="navbar navbar-expand-md navbar-dark bg-dark fixed-top">
    <a class="navbar-brand" href="loja">Loja</a>
    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarsExampleDefault" aria-controls="navbarsExampleDefault" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
    </button>

    <div class="collapse navbar-collapse" id="navbarsExampleDefault">
        <ul class="navbar-nav mr-auto">
            <li class="nav-item active">
                <a class="nav-link" href="listarProdutos">Produtos <span class="sr-only"></span></a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="cadastrarProduto">Novo Produto</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="relatorioDeVendas">Relatórios de Vendas</a>
            </li>
        </ul>
    </div>
</nav>
<div class="centering" style="margin-top: 4%">
    <body>
        <h1>Vendas realizadas no Site</h1>
        <table class="table table-striped">
            <tr>
                <td>Nome do Comprador</td>
                <td>Data</td>
                <td>Cartão de Crédito</td>
                <td>Cod Segurança</td>
                <td>Valor da Venda</td>
            </tr>
            
            <c:forEach var="venda" items="${listaDeVendas }">
            
            <tr>
                <td>${venda.nomeComprador }</td>
                <td>${ venda.data }</td>
                <td>${ venda.cartaoComprador }</td>
                <td>${ venda.codSegurancaComprador }</td>
                <td>${ venda.valor }</td>
            </tr>
            </c:forEach>
        </table>
        <p style="color: red"> ${ erro }</p>
    </body>
</div>
</html>