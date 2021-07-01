<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html" charset="UTF-8">
	
	
	<link href="resources/css/bootstrap.css" rel="stylesheet">
	<link href="resources/css/bootstrap-grid.css" rel="stylesheet">
	<link href="resources/css/loja.css" rel="stylesheet">
	
	<script src="resources/js/jquery.js"></script>
	<script src="resources/js/popper.js"></script>
	<script src="resources/js/bootstrap.js"></script>

<title>Login</title>
</head>
<body style="background-color: #eee">
    <div class="centralizar-pagina">
        <div class="col-md-12">
           <form action="login" method="POST">
	           <fieldset>
	                    <legend>Acesso ao Sistema</legend>
	                    <input class="form-control" type="text" name="usuario" value="${param.usuario }" placeholder="Digite seu usuário" autofocus>
	                    </br>
	                    <input class="form-control" type="password" name="senha" placeholder="Digite sua senha">
	                    </br>
	                    <input class="btn btn-success" type="submit" name="btnEnviar" value="Enviar">
						<a class="btn btn-primary" href="cadastraUsuario">Cadastrar</a>
	           </fieldset>
           </form>
        </div>
    </div>
	<p style="color: red">${erro}</p>
</body>
</html>