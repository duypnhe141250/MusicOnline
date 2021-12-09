<%-- 
    Document   : add
    Created on : Jul 1, 2021, 5:39:54 AM
    Author     : Administrator
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="model.Song"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>

        <div class="playlist-content">
            <form action="add" method="post">
                Song Name &nbsp;<input type="text" name="name"/> <br/>
                Album name: &nbsp;<input type="text" name="album"/> <br/>
                Type song: 
                <select name="cate">
                    <option value="-1">----------</option>
                    <c:forEach items="${listCate}" var="list">
                        <option name="cateID" value="${list.categoryID}">${list.categoryName}</option>
                    </c:forEach>
                </select><br>
                Image:  <input type="file" name="image"/> <br/>
                Source: <input type="file" name="source"/> <br/> &nbsp;
                <br/>
                &nbsp;&nbsp;&nbsp;<input  type="submit" value="Add music" />
            </form>
        </div>
    </body>
</html>
