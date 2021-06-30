<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Alterar Usuário</title>
</head>
<body>
    <form action="cadastrarUsuario" method="POST">
        <fieldset>
            <legend>Atualizar Usuário</legend>
            <input type="text" name="usuario" placeholder="Digite seu usuário" autofocus>
            <br/>
            <input type="password" name="senha" placeholder="Digite sua senha">
            <br/>
            <br/>
            <input type="nome" name="nome" placeholder="Digite seu nome">
            <br/>
            <input type="cpf" name="cpf" placeholder="Digite seu CPF">
            <br/>
            <input type="telefone" name="telefone" placeholder="Digite seu telefone">
            <br/>
            <input type="endereco" name="endereco" placeholder="Digite seu endereço">

            <input type="submit" name="btnEnviar" value="Enviar">
        </fieldset>
    </form>
    <p style="color: red"></p>
</body>
</html>