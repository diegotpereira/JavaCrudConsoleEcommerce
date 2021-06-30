<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Listar Produtos</title>
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
                <a class="nav-link" href="relatorioDeVendas">Relatório de Vendas</a>
            </li>
        </ul>
    </div>
</nav>
<div class="centering" style="margin-top: 4%">
    <div class="col-md-12">
        <body>
            <h1>Cadastrar Produto</h1>
            <table class="table table-striped">
                <tr>
                    <td>Nome do Produto</td>
                    <td>Valor</td>
                    <td>Descrição do Produto</td>
                    <td>Ações</td>
                </tr>

                <tr>
                    <td></td>
                    <td></td>
                    <td></td>

                    <td>
                        <form action="excluirProduto" method="POST">
                            <input type="hidden" name="idProduto" value=""/>
                            <input type="submit" class="btn btn-danger" value="Excluir">
                        </form>
                        <form action="alterarProduto" method="GET">
                            <input type="hidden" name="idProduto" value=""/>
                        </form>
                    </td>
                </tr>
            </table>
            <p style="color: red"></p>
        </body>
    </div>
</div>
</html>