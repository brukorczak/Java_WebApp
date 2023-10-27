<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page import="br.com.bruKorczak.classes.Moto" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" href="veiculo.css"/>
    <title>Moto</title>
</head>
<body>
    <h1>Moto</h1>
    <pre>
<%
    Moto moto = new Moto("Suzuki", 1952);
%>
    <%= moto.acelerar() %> <br>
    Marca: <%= moto.getMarca() %>
    Ano de Fabricação: <%= moto.getAno()
%>
    </pre>

    <p>Veículo acelerado com sucesso!</p>
</body>
</html>