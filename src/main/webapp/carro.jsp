<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page import="br.com.bruKorczak.classes.Carro" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" href="veiculo.css"/>
    <title>Carro</title>
</head>
<body>
    <h1>Carro</h1>
    <pre>
<%
    Carro carro = new Carro("Chevrolet Opala", 1968);
%>
    <%= carro.acelerar() %> <br>
    Marca: <%= carro.getMarca() %>
    Ano de Fabricação: <%= carro.getAno()
%>
    </pre>

    <p>Veículo acelerado com sucesso!</p>
</body>
</html>