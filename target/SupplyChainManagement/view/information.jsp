<%@ page import="by.fpmibsu.slastymordasty.entity.Cake" %><%--
  Created by IntelliJ IDEA.
  User: Fantom_X_
  Date: 30.05.2023
  Time: 15:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>

    <style><%@include file="css/info.css"%></style>
    <%
        Cake cake = (Cake)request.getAttribute("cake");
    %>

    <title><%=cake.getTitle()%></title>
</head>
<body>

    <p>
        <%="<img class = \"left\" src=\"img/" + cake.getImage().getPath() + "\""%>
    <h2><b><%=cake.getTitle()%></b></h2><br>

    <b>Состав:</b><br>
    <%=cake.getDescription()%>
    </p>

    <b>Пищевая ценность на 100 грамм:</b><br>
    Белки: <%=cake.getNutritionalValue100g().getProteins() + " г."%><br>
    Жиры: <%=cake.getNutritionalValue100g().getFats() + " г."%><br>
    Углеводы: <%=cake.getNutritionalValue100g().getCarbohydrates() + " г."%><br>
    Энергетическая ценность: <%=cake.getNutritionalValue100g().getCaloriesKcal() + " Ккал (" + cake.getNutritionalValue100g().getCaloriesKJoules() + " КДж)"%><br>



</body>
</html>
