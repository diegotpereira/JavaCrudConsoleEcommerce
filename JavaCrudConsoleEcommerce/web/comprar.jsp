<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<link href="resources/css/bootstrap.css" rel="stylesheet">
<link href="resources/css/bootstrap-grid.css" rel="stylesheet">
<link href="resources/css/loja.css" rel="stylesheet">

<title>Comprar</title>
</head>
<nav class="navbar navbar-expand-md navbar-dark bg-dark fixed-top">
    <a class="navbar-brand" href="loja">Loja</a>
    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarsExampleDefault" aria-controls="navbarsExampleDefault" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
    </button>

    <div class="collapse navbar-collapse" id="navbarsExampleDefault">
        <ul class="navbar-nav mr-auto">

        </ul>
        <ul class="navbar-nav">
            <li class="nav-item active">
                <a class="nav-link" href="login">Entrar<span class="sr-only"></span></a>
            </li>
        </ul>
    </div>
</nav>
<body style="background-color: #eee">
    <div class="centralizar-pagina">
        <div class="row">
            <div style="margin-top: 5%;" class="col-md-12">
                <div class="col-md-12">
                    <h4>Comprar Produto</h4>

                    <div class="box-produtos alert-info">
                        <h6>Nome do Produto: </h6>
                        <div>Valor: </div>
                        <div>Descrição: </div>
                    </div>

                    <form action="comprar" method="POST">
                        <input type="hidden" name="idProduto" value=""/>
                        <input type="hidden" name="valor" value=""/>
                        <div class="form-group">
                            <input class="form-control" type="text" name="nomeComprador" placeholder="Digite seu nome" autofocus/>
                        </div>
                        <div class="form-group">
                            <input class="form-control" type="text" maxlength="3" name="codSegurancaComprador" placeholder="Digite o código de segurança"/>
                        </div>
                        <input type="submit" class="btn btn-success" name="btnEnviar" value="Finalizar Compra">
                    </form>
                    <p style="color: red"></p>
                </div>
            </div>
        </div>
    </div>
</body>
</html>