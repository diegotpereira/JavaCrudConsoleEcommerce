<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="UTF-8"%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/hmtl; charset=UTF-8">

<link href="resources/css/bootstrap.css" rel="stylesheet">
<link href="resources/css/bootstrap-grid.css" rel="stylesheet">
<link href="resources/css/loja.css" rel="stylesheet">


<title>Loja</title>
</head>

<nav class="navbar navbar-expand-md navbar-darkbg-dark fixed-top">
    <a class="navbar-brand" href="loja">Loja</a>
    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarsExampleDefault" aria-controls="navbarsExampleDefault" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
    </button>

    <div class="collapse navbar-collapse" id="navbarsExampleDefault">
        <ul class="navbar-nav mr-auto">

        </ul>
        <ul class="navbar-nav">
            <li class="navb-item active">
                <a class="nav-link" href="login">Entrar<span class="sr-only"></a>
            </li>
        </ul>
    </div>
</nav>
<body>
    <div class="row">
        <div class="col-md-12">
            <h3 style="margin-top: 5%; text-align: center">Produtos da nossa loja</h3>

            <div class="col-md-10 centering">
                <div class="row">
                    <div class="produto-thumb">
                        <div>
                            <a href="#" class="thumbnail">
                                <img height="200" width="200" src="" alt="">
                            </a>
                            <h5>Produto Nome</h5>
                            <div class="preco">Preço</div>
                            <div class="descricao">Descrição</div>
                            <form method="GET" action="comprar">
                                <div class="center">
                                    <input type="hidden" name="idProduto" value=""/>
                                    <input type="submit" class="btn btn-success comprar" value="Comprar Agora"/>
                                </div>
                            </form>
                        </div>
                    </div>
                </div>
            </div>
            <p style="color: red;"></p>
        </div>
    </div>
</body>
</html>