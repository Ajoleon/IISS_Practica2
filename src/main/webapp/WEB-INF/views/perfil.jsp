<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>  

<!DOCTYPE html>
<html>
	<head>
    	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />			

    <title>Perfil</title>
   
	    
		<style type="text/css">
	  			<%@include file="estilo/css/font1.css" %>
	  			<%@include file="estilo/css/font2.css" %>
	  			<%@include file="estilo/css/font3.css" %>
	  			<%@include file="estilo/css/bootstrap.min.css" %>
	  			<%@include file="estilo/css/font-awesome.min.css" %>
	  			<%@include file="estilo/css/owl.carousel.css" %>
	  			<%@include file="estilo/style.css" %>
	  			<%@include file="estilo/css/responsive.css" %>
	  			
		</style>
  
  </head>
  <body>
    <!-- End site branding area -->
    
    <div class="mainmenu-area">
        <div class="container">
            <div class="row">
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                        <span class="sr-only">Toggle navigation</span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                </div> 
                <div class="navbar-collapse collapse">
                    <ul class="nav navbar-nav">
                        <li><a href="/org/Shop">Tienda</a></li>
                        <li><a href="/org/Cart">Carrito</a></li>
                         <li  class="active"><a href="/org/Perfil">Perfil Personal</a></li>
                         <li><a href="/org/Logout">Desconexion</a></li>

                    </ul>
                </div>  
            </div>
        </div>
    </div> <!-- End mainmenu area -->
<div class="product-big-title-area">
        <div class="container">
            <div class="row">
                <div class="col-md-12">
                    <div class="product-bit-title text-center">
                        <h2>Perfil Personal</h2>
                    </div>
                </div>
            </div>
        </div>
    </div> <!-- End Page title area -->
    <h2>Datos: </h2>
     		<p><h3>Nombre de usuario:</h3><c:out value = "${usuario.nombre}" /></p>
    		<p><h3>Direccion postal:</h3><c:out value = "${usuario.dir}" /></p>
    		<p><h3>Telefono: </h3><c:out value = "${usuario.tlf}" /></p>
    		<p><h3>Email: </h3><c:out value = "${usuario.email}" /> </p>
    		<p><a href="/org/Cambio">Click aqu&iacute; para cambiar datos de usuario</a></p>
    <!-- Latest jQuery form server -->
    <script src="https://code.jquery.com/jquery.min.js"></script>
    
    <!-- Bootstrap JS form CDN -->
    <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>
    
    <!-- jQuery sticky menu -->
    <script src="js/owl.carousel.min.js"></script>
    <script src="js/jquery.sticky.js"></script>
    
    <!-- jQuery easing -->
    <script src="js/jquery.easing.1.3.min.js"></script>
    
    <!-- Main Script -->
    <script src="js/main.js"></script>
  </body>
</html>