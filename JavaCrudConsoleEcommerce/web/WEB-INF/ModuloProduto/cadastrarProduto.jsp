<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <link href="resources/css/bootstrap.css" rel="stylesheet">
	<link href="resources/css/bootstrap-grid.css" rel="stylesheet">
	<link href="resources/css/loja.css" rel="stylesheet">
	
	<script src="resources/js/jquery.js"></script>
	<script src="resources/js/popper.js"></script>
	<script src="resources/js/bootstrap.js"></script>
	
<title>Cadastrar Produto</title>
</head>
<div class="row">
    <div class="col-md-12">
        <nav class="navbar navbar-expand-md navbar-dark bg-dark fixed-top">
            <a class="navbar-brand" href="loja">Loja</a>
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarsExampleDefault" aria-controls="navbarsExampleDefault" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>

            <div class="collapse navbar-collapse" id="navbarsExampleDefault">
                <ul class="navbar-nav mr-auto">
                    <li class="nav-item active">
                        <a class="nav-link" href="listarProdutos">Produtos<span class="sr-only"></span></a>
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
    </div>
</div>
<body style="background-color: #eee">
    <div class="centralizar-pagina">
        <div class="row">
            <div style="margin-top: 5%" class="col-md-12">
                <div class="col-md-12">
                    <h4>Cadastrar Produto</h4>
                    <form action="cadastrarProduto" method="POST">
                        <div class="form-group">
                            <input class="form-control" type="text" name="nome" placeholder="Digite o nome do produto" autofocus/>
                        </div>
                        <div class="form-group">
                            <input class="form-control" type="text" name="valor" placeholder="Digite o valor do produto"/>
                        </div>
                        <div class="form-group">
                            <input class="form-control" type="text" name="descricao" placeholder="Digite a descrição do produto"/>
                        </div>
                        <input type="submit" class="btn btn-success" name="btnEnviar" value="Enviar">
                    </form>
                    <p style="color: red"></p>
                </div>
            </div>
        </div>
    </div>
</body>
</html>