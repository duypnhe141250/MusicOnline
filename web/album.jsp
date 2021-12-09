<%-- 
    Document   : album
    Created on : Jul 15, 2021, 4:27:41 PM
    Author     : Administrator
--%>

<%@page import="model.Album"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Album</h1>

        <% List<Album> list = (List<Album>) request.getAttribute("data"); %>
        <div class="row">
            <div>
                <div class="list-unstyled" >
                    <%
                        for (Album s : list) {
                    %>
                    <div style="margin: 30px; display: flex ;">
                        <div>
                            <a href=""><img src="<%= s.getImg()%> " style="width: 100px ;height: 100px "></a> <a href="SongInAlbum"><h4><%= s.getAlbumName()%></h4></a>
                            <br/>   
                        </div>
                    </div>
                    <% }%>
                </div>
            </div>
                
            

        </div>
    </body>
</html>
