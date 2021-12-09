<%-- 
    Document   : updateCategory
    Created on : Jul 12, 2021, 7:26:31 PM
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
        <form action="UpdateCategoryServlet" method="post">
            Select Category to update &nbsp;
                       <select name="cate">
                    <option value="-1">----------</option>
                    <c:forEach items="${listCate}" var="list">
                        <option name="cateID" value="${list.categoryID}">${list.categoryName}</option>
                    </c:forEach>
                </select><br>
            Category Name &nbsp; <input type="text" name="cateName"/>
            
            <input type="submit" value="Update"/>
        </form>
    </body>
</html>
