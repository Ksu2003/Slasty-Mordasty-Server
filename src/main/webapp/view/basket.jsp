<%@ page import="by.fpmibsu.slastymordasty.entity.Cake" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: Fantom_X_
  Date: 01.06.2023
  Time: 08:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Корзина</title>
</head>
<body>

<h1>Корзина:</h1>
    <%
        List<Cake> cakeList = (List<Cake>) request.getSession().getAttribute("basket");

        double coast = 0;

        for(Cake item:cakeList){
            out.print("<h2>" + item.getTitle() + "</h2>");
            coast += item.getPrice();
        }



    %>

    <h3>С вас: <%= coast%> BYN</h3>

    <button>БЕРУУУУУУУ</button>

</body>
</html>
