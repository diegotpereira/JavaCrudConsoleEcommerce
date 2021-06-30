<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html" charset="UTF-8">

<link href="resources/css/bootstrap.css" rel="stylesheet">
<link href="resources/css/bootstrap-grid.css" rel="stylesheet">
<link href="resources/css/loja.css" rel="stylesheet">

<title>Home</title>
</head>

<nav class="navbar navbar-expand-md navbar-dark bg-dark fixed-top">
    <a class="navbar-brand" href="loja">Loja</a>
    <button class="navbar-toggler" type="button" data-toggle="collaspse" data-target="#navbarsExampleDefault" aria-controls="navbarsExampleDefault" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggle-icon"></span>
    </button>

    <div class="collaspse navbar-collapse" id="navbarsExampleDefault">
        <ul class="navbar-nav mr-auto">
            <li class="nav-item active">
                <a class="nav-link" href="#">Produtos
                    <span class="sr-only"></span>
                </a>
            </li>

            <li class="nav-item">
                <a class="nav-link" href="#">Vender</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="#">Carrinho</a>
            </li>
        </ul>
    </div>
</nav>
<body>
    <h1>Seja bem vindo: </h1>

    <div>Ações</div>
    <a href="#">Cadastrar novo Produto</a>
    <a href="#">Listar Produtos</a>
</body>
</html>