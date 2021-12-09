<%-- 
    Document   : login
    Created on : Jun 2, 2021, 8:56:39 PM
    Author     : Administrator
--%>

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
                                <a class="h-facebook" href="https://www.facebook.com/"><i class="fa fa-facebook"></i></a>
                                <a class="h-twitter" href="https://mobile.twitter.com/login"><i class="fa fa-twitter"></i></a>
                                <a class="h-google" href="https://www.google.com/gmail/about/"><i class="fa fa-google-plus"></i></a>

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
                            <a class="navbar-brand" href="homeServlet">
                                <!-- logo image -->

                                <img class="img-responsive" src="img/logo/logoMusic.jpg" alt="" />
                            </a>
                        </div>


                    </div>
                </nav>
            </header>
            <!--/ header end -->
        </div>
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

                                <h2 class="animated fadeInLeftBig" style="color: red"><i class="fa fa-music" style="color: red"></i> LOGIN</h2>

                                <form action="login" method="post">
                                    Username: &nbsp;<input style="color: black" type="text" name="user"/> <br/>
                                    Password: &nbsp;<input style="color: black" type="text" name="pass"/> <br/>
                                    <input style="border: gray; color: red" type="submit" value="Login" /> &nbsp; &nbsp; &nbsp;
                                    <button style="color: red; border: gray"><a href="register.jsp">Register</a></button>
                                    <% if (request.getAttribute("error") != null) {%>
                                    <h3><%= request.getAttribute("error")%> </h3>
                                    <% }%>
                                </form>
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
        <!--        <h1 style="color: red; font-size: 30px ">LOGIN PAGE</h1>-->
        <!--        <form action="login" method="post">
                    Username: <input type="text" name="user"/> <br/>
                    Password: <input type="text" name="pass"/> <br/>
                    <input type="submit" value="Login" /> &nbsp; &nbsp; &nbsp;
                    <button><a href="register.jsp">Register</a></button>
                </form>-->
    </body>
</html>
