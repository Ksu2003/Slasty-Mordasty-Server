<%--
  Created by IntelliJ IDEA.
  User: Fantom_X_
  Date: 27.05.2023
  Time: 11:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Регистрация</title>
    <style><%@include file="css/regForm.css"%></style>
</head>
<body>
<form method="post" action="doReg.jsp">

    <table>

        <tr>
            <td>
                <label for="name"><b>Имя</b></label>
                <input type="text"  name="name" id="name" required>
            </td>

            <td>

                <label for="email"><b>Email</b></label>
                <input type="text"  name="email" id="email" required>

            </td>

        </tr>

        <tr>
            <td>
                <label for="password"><b>Пароль</b></label>
                <input type="password" name="password" id="password" required>
            </td>

            <td>
                <label for="phone"><b>Номер телефона</b></label>
                <input type="number" name="phone" id="phone" required>
            </td>
        </tr>

        <tr>
            <td>
                <label for="street"><b>Улица</b></label>
                <input type="text"  name="street" id="street" required>
            </td>

            <td>
                <label for="houseFlat"><b>Дом квартира</b></label>
                <input type="text" name="houseFlat" id="houseFlat" required>
            </td>
        </tr>


    </table>

    <input class="button" type="submit" value="Зарегестрироваться">













</form>
</body>
</html>
