<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html" charset="UTF-8">


<link href="resources/css/bootstrap.css" rel="stylesheet">
<link href="resources/css/bootstrap-grid.css" rel="stylesheet">
<link href="resources/css/loja.css" rel="stylesheet">

<title>Login</title>
</head>
<body style="background-color: #eee">
    <div class="centralizar-pagina">
        <div class="col-md-12">
           <form action="#" method="post">
	           <fieldset>
	                    <legend>Acesso ao Sistema</legend>
	                    <input class="form-control" type="text" name="usuario" value="" placeholder="Digite seu usuário" autofocus>
	                    </br>
	                    <input class="form-control" type="password" name="senha" placeholder="Digite sua senha">
	                    </br>
	                    <input class="btn btn-success" type="submit" name="btnEnviar" value="Enviar">
						<a class="btn btn-primary" href="#">Cadastrar</a>
	           </fieldset>
           </form>
        </div>
    </div>
	<p style="color: red">${erro}</p>
</body>
</html>