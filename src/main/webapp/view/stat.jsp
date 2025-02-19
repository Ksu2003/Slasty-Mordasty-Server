<%@ page import="by.fpmibsu.slastymordasty.service.UserService" %>
<%@ page import="java.util.List" %>
<%@ page import="by.fpmibsu.slastymordasty.entity.User" %><%--
  Created by IntelliJ IDEA.
  User: Fantom_X_
  Date: 01.06.2023
  Time: 00:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Админка</title>
</head>
<body>

      <h3>Данные пользователей:</h3>

      <%
        UserService userService = new UserService();
        List<User> list = userService.getAllUsers();

        for(User item:list){
            if(item.getRole()==0){
                out.print("<b>USER  </b>");
            } else{
                out.print("<b>ADMIN  </b>");
            }
          out.print(item.getName() + " " + item.getEmail() + " " + item.getPhoneNumber() + " " + item.getAddressStreet() + " " + item.getNumHouseFlat() + "<br>");
        }
      %>

</body>
</html>
