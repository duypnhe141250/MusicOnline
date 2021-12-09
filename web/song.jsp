<%-- 
    Document   : index
    Created on : Jun 3, 2021, 11:44:35 AM
    Author     : Administrator
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="java.util.List"%>
<%@page import="model.Song"%>

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
    </head>
    <body>
        <div>
            <header>
                <!-- secondary menu -->
                <nav class="secondary-menu">
                    <div class="container">
                        <!-- secondary menu left link area -->
                        <div class="sm-left">
                            <strong>Phone</strong>:&nbsp; <a href="#">0981949455</a>&nbsp;&nbsp;&nbsp;&nbsp;
                            <strong>E-mail</strong>:&nbsp; <a href="#">duypnhe141250@fpt.edu.vn</a>
                        </div>
                        <!-- secondary menu right link area -->
                        <div class="sm-right">
                            <!-- social link -->
                            <div class="sm-social-link">

                                <% if (session.getAttribute("u")
                                            != null) { %>
                                Welcome &nbsp; ${sessionScope.u}, &nbsp; <a href="login.jsp" style="color: white">
                                    <h6>Log out</h6>
                                </a>
                                <% } else {%>
                                <a href="login.jsp" style="color: white">
                                    Login
                                </a> 
                                <% }%>
                                <i></i>


                            </div>

                        </div>
                        <div class="clearfix"></div>
                    </div>
                </nav>
                <!-- primary menu -->
                <nav class="navbar navbar-fixed-top navbar-default">
                    <div class="container">
                        <!-- Brand and toggle get grouped for better mobile display -->
                        <div class="navbar-header">
                            <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
                                <span class="sr-only">Toggle navigation</span>
                                <span class="icon-bar"></span>
                                <span class="icon-bar"></span>
                                <span class="icon-bar"></span>
                            </button>
                            <!-- logo area -->
                            <a class="navbar-brand" href="index.jsp">
                                <!-- logo image -->

                                <img class="img-responsive" src="img/logo/logoMusic.jpg" alt="" />
                            </a>
                        </div>

                        <!-- Collect the nav links, forms, and other content for toggling -->
                        <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                            <ul class="nav navbar-nav navbar-right">

                            </ul>
                        </div><!-- /.navbar-collapse -->
                    </div><!-- /.container-fluid -->
                </nav>
            </header>
            <!--/ header end -->

            <!-- banner area -->
            <div class="banner">
                <div id="carousel-example-generic" class="carousel slide" data-ride="carousel">
                    <!-- Wrapper for slides -->
                    <div class="carousel-inner" role="listbox">
                        <div class="item active">
                            <img src="img/banner/b1.jpg" alt="...">
                            <div class="container">
                                <!-- banner caption -->
                                <div class="carousel-caption slide-one">
                                    <!-- heading -->
                                    <h2 class="animated fadeInLeftBig"><i class="fa fa-music"></i> Melodi For You!</h2>
                                    <!-- paragraph -->
                                    <h3 class="animated fadeInRightBig">Find More Innovative &amp; Creative Music Albums.</h3>
                                    <!-- button -->
                                    <a href="#" class="animated fadeIn btn btn-theme">Download Here</a>
                                </div>
                            </div>
                        </div>
                        <div class="item">
                            <img src="img/banner/b2.jpg" alt="...">
                            <div class="container">
                                <!-- banner caption -->
                                <div class="carousel-caption slide-two">
                                    <!-- heading -->
                                    <h2 class="animated fadeInLeftBig"><i class="fa fa-headphones"></i> Listen It...</h2>
                                    <!-- paragraph -->
                                    <h3 class="animated fadeInRightBig">Lorem ipsum dolor sit amet, consectetur elit.</h3>
                                    <!-- button -->
                                    <a href="#" class="animated fadeIn btn btn-theme">Listen Now</a>
                                </div>
                            </div>
                        </div>
                    </div>

                    <!-- Controls -->
                    <a class="left carousel-control" href="#carousel-example-generic" role="button" data-slide="prev">
                        <span class="fa fa-arrow-left" aria-hidden="true"></span>
                    </a>
                    <a class="right carousel-control" href="#carousel-example-generic" role="button" data-slide="next">
                        <span class="fa fa-arrow-right" aria-hidden="true"></span>
                    </a>
                </div>
            </div>
            <!--/ banner end -->

            <!-- block for animate navigation menu -->
            <div class="nav-animate"></div> 
            <!-- Hero block area -->
            <div id="latestalbum" class="hero pad">
                <div class="container">
                    <!-- hero content -->
                    <div class="hero-content ">
                        <!-- heading -->
                        <h2>List song</h2>
                        <hr>
                        <!-- paragraph -->
                        <p>We sing the best <strong class="theme-color">Songs</strong> and now we control the world best <strong class="theme-color">Music</strong>.</p>
                    </div>
                    <!-- hero play list -->


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

                </div>
            </div>
            <!--/ hero end -->

            <!-- footer -->
            <footer>
                <div class="container">
                    <!-- social media links -->
                    <div class="social">
                        <a class="h-facebook" href="https://www.facebook.com/"><i class="fa fa-facebook"></i></a>
                        <a class="h-twitter" href="https://mobile.twitter.com/login"><i class="fa fa-twitter"></i></a>
                        <a class="h-google" href="https://www.google.com/gmail/about/"><i class="fa fa-google-plus"></i></a>
                    </div>
                    <!-- copy right -->
                    <p class="copy-right">&copy; copyright 2018, All rights are reserved.</p>
                </div>
            </footer>
            <!-- footer end -->

            <!-- Scroll to top -->
            <span class="totop"><a href="#"><i class="fa fa-chevron-up"></i></a></span> 

        </div>

        <!-- Javascript files -->
        <!-- jQuery -->
        <script src="js/jquery.js"></script>
        <!-- Bootstrap JS -->
        <script src="js/bootstrap.min.js"></script>
        <!-- WayPoints JS -->
        <script src="js/waypoints.min.js"></script>
        <!-- Include js plugin -->
        <script src="js/owl.carousel.min.js"></script>
        <!-- One Page Nav -->
        <script src="js/jquery.nav.js"></script>
        <!-- Respond JS for IE8 -->
        <script src="js/respond.min.js"></script>
        <!-- HTML5 Support for IE -->
        <script src="js/html5shiv.js"></script>
        <!-- Custom JS -->
        <script src="js/custom.js"></script>
    </div>   

</body>
</html>
