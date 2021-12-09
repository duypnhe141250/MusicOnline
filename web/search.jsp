<%-- 
    Document   : login
    Created on : Jun 2, 2021, 8:56:39 PM
    Author     : Administrator
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="model.Song"%>
<%@page import="model.Song"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <title>Music Wave</title>
        <!-- Description, Keywords and Author -->
        <meta name="description" content="Your description">
        <meta name="keywords" content="Your,Keywords">
        <meta name="author" content="HimanshuGupta">

        <meta name="viewport" content="width=device-width, initial-scale=1.0">


        <!-- Styles -->
        <!-- Bootstrap CSS -->
        <link href="css/bootstrap.min.css" rel="stylesheet">	
        <!-- Animate CSS -->
        <link href="css/animate.min.css" rel="stylesheet">
        <!-- Basic stylesheet -->
        <link rel="stylesheet" href="css/owl.carousel.css">
        <!-- Font awesome CSS -->
        <link href="css/font-awesome.min.css" rel="stylesheet">		
        <!-- Custom CSS -->
        <link href="css/style.css" rel="stylesheet">
        <link href="css/style-color.css" rel="stylesheet">

        <!-- Favicon -->
        <link rel="shortcut icon" href="img/logo/favicon.ico">
        <style>
            .carousel-caption{
                margin: auto;
                width: 80%;

            }
        </style>
    </head>
    <body>


        <h2 class="animated fadeInLeftBig" style="color: red"><i class="fa fa-music" style="color: red"></i> Find your song</h2>


        <form action="searchServlet" method="post">
            <input style="padding: 10px;color: #000; width: 500px" name="info" width="100%" transition: all="3s ease-in-out" type="text" placeholder="Search for artist,song,album"/> &nbsp;
            <input style="color: #000" type="submit"  value="Search" /></form>

        <div style="text-align: center">
            <% List<Song> list = (List<Song>) request.getAttribute("list"); %>
            <div class="row">
                <div>
                    <div class="list-unstyled" >
                        <c:choose>
                            <c:when test="${list ne null}">
                                <%
                                    for (Song s : list) {
                                %>
                                <div style="margin: 30px; display: flex ;">
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



                                        </div>

                                        <div class="clearfix"></div>
                                    </div>
                                </div>
                                <%}%>
                            </c:when>    
                        </c:choose>


                    </div>
                </div>

            </div>
        </div>



    </form>



</body>
</html>

