<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="UTF-8"%>
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
<div class="row">
    <div class="col-md-12">
        <nav class="navbar navbar-expand-md navbar-dark bg-dark fixed-top">
            <a class="navbar-brand" href="#">Loja</a>
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarsExampleDefault" aria-controls="navbarsExampleDefault" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>

            <div class="collapse navbar-collapse" id="navbarsExampleDefault">
                <ul class="navbar-nav mr-auto">
                    <li class="nav-item active">
                        <a class="nav-link" href="listarProdutos">Produtos <span class="sr-only"></span></a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="cadastrarProduto">Vender</a>
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
                    <h4>Cadastrar novo produto</h4>
                    <form action="alterarProduto" method="POST">
                        <input type="hidden" name="idProduto" value="${produto.codigo }"/>
                        <div class="form-group">
                            <input class="form-control" type="text" value="${produto.nome }" name="nome" placeholder="Digite o nome do produto" autofocus/>
                        </div>
                        <div class="form-group">
                            <input class="form-control" type="text" value="${produto.valor }" name="valor" placeholder="Digite o valor do produto"/>
                        </div>
                        <div class="form-group">
                            <input class="form-control" type="text" value="${produto.descricao }" name="descricao" placeholder="Digite a descrição do produto"/>
                        </div>
                        <input type="submit" class="btn btn-success" name="btnEnviar" value="Enviar">
                    </form>
                    <p style="color: red"> ${erro} </p>
                </div>
            </div>
        </div>
    </div>
</body>
</html>