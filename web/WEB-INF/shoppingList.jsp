<%-- 
    Document   : shoppingList
    Created on : 16-Oct-2022, 6:52:38 PM
    Author     : Fast
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Shopping List</title>
    </head>
    <body>
        <h1>Shopping List</h1>
        <form action="shoppingList" method="get">
            Username: <input type="text" name="userName">
            <input type="submit" value="Register Name">
        </form>
    </body>
</html>
