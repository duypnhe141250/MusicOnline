<%-- 
    Document   : songInAlbum
    Created on : Jul 15, 2021, 5:32:40 PM
    Author     : Administrator
--%>

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
        <div style="text-align: center">


                        <% List<Song> list = (List<Song>) request.getAttribute("listSong"); %>
                        <div class="row">
                            <div>
                                <div class="list-unstyled" >
                                    <%
                                        for (Song s : list) {
                                    %>
                                    <div style="margin: 30px; display: flex ;justify-content: center;">
                                        <div style="">
                                            <img src="<%= s.getImage()%>" style="width: 100px ;height: 100px"/>
                                            <h4><%= s.getSongName()%></h4> 
                                        </div>
                                        <div style="" class="playlist-number">
                                            <!-- song information -->
                                            <div class="song-info">
                                                <!-- song title -->

                                                <p><strong>Album</strong>: <%= s.getCategoryID()%> &nbsp;|&nbsp; <strong>Type</strong>: Rock &nbsp;|&nbsp; <strong>Singer</strong>: Dawn</p>
                                            </div>
                                            <!-- music icon -->
                                            <div class="music-icon">

                                                <audio controls controlsList="nodownload">
                                                    <source src="<%= s.getSource()%>"  type="audio/mp3" >
                                                </audio>

                                                <% if (session.getAttribute("vip") != null) {%>
                                                <a href="<%= s.getSource()%>"><h3>Download here</h3></a>
                                                <% } %>

                                            </div>

                                            <div class="clearfix"></div>
                                        </div>
                                    </div>
                                    <% }%>
                                </div>
                            </div>

                        </div>
                        <c:forEach begin="1" end ="${requestScope.num}" var="i">
                            <a class="${requestScope.page==i?"active":""}" href="listSong?page=${i}">${i}</a>
                        </c:forEach>

                    </div>
    </body>
</html>
