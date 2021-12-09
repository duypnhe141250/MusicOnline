<%-- 
    Document   : update
    Created on : Jul 11, 2021, 5:13:23 PM
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
        <div class="playlist-content">
            <form action="update" method="post">
                Song ID: &nbsp;<input type="text" name="id" value="Hello"/> <br/>

                 Song Name &nbsp;<input type="text" name="name" value ="HI" /> <br/>
                 Album name: &nbsp;<input type="text" name="album"/> <br/>
                 Type song: 
                <select name="cate">
                    <option value="-1">----------</option>
                    <c:forEach items="${listCate}" var="list">
                        <option name="cateID" value="${list.categoryID}">${list.categoryName}</option>
                    </c:forEach>
                </select><br>

                <br/>
                &nbsp;&nbsp;&nbsp;<input  type="submit" value="Update" />
            </form>
        </div>
    </body>
</html>
