<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" href="veiculo.css"/>
    <title>Veiculo</title>
</head>
<body>
    <h1>Informações do veiculo mais antigo</h1>
    <pre>
    <c:if test="${veiculoMaisAntigo != null}">
        Marca: ${veiculoMaisAntigo.getMarca()}
        Ano de Fabricação: ${veiculoMaisAntigo.getAno()}
        Acelerando: ${veiculoMaisAntigo.acelerar()}
    </c:if>
    <c:if test="${empty veiculoMaisAntigo}">
        Nenhum veículo na lista.
    </c:if>
    </pre>

    <p>Veículo acelerado com sucesso!</p>
</body>
</html>
