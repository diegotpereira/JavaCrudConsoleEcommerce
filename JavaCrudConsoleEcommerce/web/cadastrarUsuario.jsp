<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<link href="resources/css/bootstrap.css" rel="stylesheet">
<link href="resources/css/bootstrap-grid.css" rel="stylesheet">
<link href="resources/css/loja.css" rel="stylesheet">

<title>Cadastrar Usuário</title>
</head>
<body style="background-color: #eee;">
    <div class="centralizar-pagina-cadastrar">
        <div class="row">
            <div style="margin-top: 5%" class="col-md-12">
                <div class="col-md-12" style="text-align: center;">
                    <form action="cadastrarUsuario" method="POST">
                        <fieldset>
                            <legend>Cadastre-se</legend>
                            <div class="form-group">
                                <input class="form-control" type="text" name="usuario" placeholder="Digite seu usuário" autofocus>
                            </div>
                            <div class="form-group">
                                <input class="form-control" type="password" name="senha" placeholder="Digite sua senha">
                            </div>
                            <div class="form-group">
                                <input class="form-control" type="nome" name="nome" placeholder="Digite seu nome">
                            </div>
                            <div class="form-group">
                                <input class="form-control" type="cpf" name="cpf" placeholder="Digite seu CPF">
                            </div>
                            <div class="form-group">
                                <input class="form-control" type="telefone" name="telefone" placeholder="Digite seu telefone">
                            </div>
                            <div class="form-group">
                                <input class="form-control" type="endereco" name="endereco" placeholder="Digite seu endereço">
                            </div>
                            <input type="submit" class="btn btn-success" name="btnEnviar" value="Enviar">
                        </fieldset>
                    </form>
                    <p style="color: red"></p>
                </div>
            </div>
        </div>
    </div>
</body>
</html>