<%-- 
    Document   : addCategory
    Created on : Jul 11, 2021, 7:08:31 PM
    Author     : Administrator
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="AddCategoryServlet" method="post">
            Category ID &nbsp;<input type="text" name="cateID"/> <br/>
            Category name: &nbsp;<input type="text" name="cateName"/> <br/>
            <br/>
            &nbsp;&nbsp;&nbsp;<input  type="submit" value="Add category" />
            
        </form>

    </body>
</html>
