<%-- 
    Document   : deleteCate
    Created on : Jul 15, 2021, 5:17:40 PM
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="DeleteServlet" method="post">
           Fill Category ID nít to be delete :&nbsp;<input type="text" name="cateID"/> <br/>
            
            <br/>
            &nbsp;&nbsp;&nbsp;<input  type="submit" value="Delete category" />
            
        </form>
    </body>
</html>
