<%@ page import="by.fpmibsu.slastymordasty.service.CakeService" %>
<%@ page import="java.util.List" %>
<%@ page import="by.fpmibsu.slastymordasty.entity.Cake" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.sql.SQLException" %><%--
  Created by IntelliJ IDEA.
  User: Fantom_X_
  Date: 27.05.2023
  Time: 12:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <!-- font awesome cdn link  -->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css">

    <!-- custom css file link  -->

    <title>Slasty-Mordasty</title>
    <style><%@include file="css/card.css"%></style>
    <style><%@include file="css/button.css"%></style>
</head>
<body>

    <header>




        <%

            HttpSession checkSession = request.getSession();

            String login = (String) checkSession.getAttribute("email");
            String password = (String) checkSession.getAttribute("password");
            Integer role = (Integer) checkSession.getAttribute("role");

            System.out.println(role);



            if(login!=null && password!=null){
                if(role == 1){
                    out.print("<form action=\"stat.jsp\" method=\"get\">");
                    out.print("<button class=\"fciA navItem\"><span class = \"fciSpan\">Админка</span></button>");
                    out.print("</form>");
                } else if(role == 0){
                    out.print("<form action=\"basket.jsp\" method=\"get\">");
                    out.print("<button class=\"fciA navItem\"><span class = \"fciSpan\">Корзина</span></button>");
                    out.print("</form>");
                    out.print("<form action=\"history.jsp\" method=\"get\">");
                    out.print("<button class=\"fciA navItem\"><span class = \"fciSpan\">История заказов</span></button>");
                    out.print("</form>");
                }
                out.print("<form action=\"logout.jsp\" method=\"post\">");
                out.print("<button class=\"fciA navItem\"><span class = \"fciSpan\">Выйти</span></button>");
                out.print("</form>");
            } else{
                out.print("<form action=\"login.jsp\" method=\"get\">");
                out.print("<button class=\"fciA navItem\"><span class = \"fciSpan\">Войти</span></button>");
                out.print("</form>");
            }


        %>


    </header>


    <div class="container">

        <h3 class="title"> Наши товары: </h3>



        <div class="products-container">


            <%
                CakeService cakeService = new CakeService();
                List<Cake> list = cakeService.getAll();


                for(Cake item : list){
                    out.print("<div class=\"product\">");
                    out.print("<img src=\"img/" + item.getImage().getPath() + "\"<br>");
                    out.print("<h3>" + item.getTitle() + "</h3>");


                    out.print("<form action=\"" + item.getId() + "info.jsp\" method=\"get\">");
                    out.print("<button сlass=\"cardButton\">Подробнее</button>");
                    out.print("</form>");

                    if(role != null && role == 0){
                        out.print("<form action=\"toBasketJsp.jsp\" method=\"post\">");
                        out.print("<button сlass=\"cardButton\">В корзину</button>");
                        out.print("</form>");
                    }



                    out.print("<div class=\"price\">" + item.getPrice() + "BYN</div>");
                    out.print("</div>");
                }
            %>

        </div>

    </div>


</body>
</html>
