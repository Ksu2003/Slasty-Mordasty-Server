<%--
  Created by IntelliJ IDEA.
  User: Fantom_X_
  Date: 28.05.2023
  Time: 11:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <style><%@include file="css/form.css"%></style>
    <title>Login</title>
</head>
<body>


<div class="background">
    <div class="shape"></div>
    <div class="shape"></div>
</div>

<form method="post" action="login.jsp">

    <h3>Продолжим сладкую жизнь?</h3>

    <label for="email">Почта</label>
    <input type="email" required placeholder="Почта" name="email" id = "email"><br>

    <label for="password">Пароль</label>
    <input type="password" required placeholder="Пароль" name="password" id = "password"><br><br>

    <input class="button" type="submit" value="Войти">
    <a class = "link" href="reg.jsp" methods="get">Вы у нас впервые? Создайте аккаунт</a>



</form>

</body>
</html>
