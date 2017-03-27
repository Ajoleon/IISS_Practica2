<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
	<head>
    	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />			

    <title>Tienda</title>
   
	    
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
   
    
    
    <div class="site-branding-area">
        <div class="container">
            <div class="row">
                <div class="col-sm-6">
                    <div class="logo">
                        
                    </div>
                </div>
                
            </div>
        </div>
    </div> <!-- End site branding area -->
    
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
                        <li class="active"><a href="/Practica1/Shop">Tienda</a></li>
                        <li><a href="/Practica1/Cart">Carrito</a></li>
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
                        <h2>Productos</h2>
                    </div>
                </div>
            </div>
        </div>
    </div>
    
    
    <div class="single-product-area">
        <div class="zigzag-bottom"></div>
        <div class="container">
            <div class="row">
                <div class="col-md-3 col-sm-6">
                    <div class="single-shop-product">
                        
                        <h2>Pienso para perro. 1 kg</h2>
                        <div class="product-carousel-price">
                            <ins>10 &euro;</ins>
                        </div>  
                        
                        <div class="product-option-shop">
                        	<form action="/Practica1/Shop" method=post>
                        		<input type="hidden" name="suma" value="1">
                        		<input type="submit" value="Incluir en carrito">
                       		</form>
                        </div>                       
                    </div>
                </div>
                <div class="col-md-3 col-sm-6">
                    <div class="single-shop-product">
                        
                        <h2>At&uacute;n para gatos. 0.5 kg</h2>
                        <div class="product-carousel-price">
                            <ins>5 &euro;</ins>
                        </div>  
                        
                        <div class="product-option-shop">
                        	<form action="/Practica1/Shop" method=post>
                        		<input type="hidden" name="suma" value="2">
                        		<input type="submit" value="Incluir en carrito">
                       		</form>
                        </div>                       
                    </div>
                </div>
                <div class="col-md-3 col-sm-6">
                    <div class="single-shop-product">
                        
                        <h2>Alpiste para p&aacute;jaro. 1 kg</h2>
                        <div class="product-carousel-price">
                            <ins>4 &euro;</ins>
                        </div>  
                        
                       <div class="product-option-shop">
                        	<form action="/Practica1/Shop" method=post>
                        		<input type="hidden" name="suma" value="3">
                        		<input type="submit" value="Incluir en carrito">
                       		</form>
                        </div>                       
                    </div>
                </div>
                <div class="col-md-3 col-sm-6">
                    <div class="single-shop-product">
                       
                        <h2>Comida de peces. Bote de 0.5 kg</h2>
                        <div class="product-carousel-price">
                            <ins>12 &euro;</ins>
                        </div>  
                        
                        <div class="product-option-shop">
                        	<form action="/Practica1/Shop" method=post>
                        		<input type="hidden" name="suma" value="4">
                        		<input type="submit" value="Incluir en carrito">
                       		</form>
                        </div>                        
                    </div>
                </div>
                <div class="col-md-3 col-sm-6">
                    <div class="single-shop-product">
                        
                        <h2>Masticador de perro.</h2>
                        <div class="product-carousel-price">
                            <ins>25 &euro;</ins>
                        </div>  
                        
                       <div class="product-option-shop">
                        	<form action="/Practica1/Shop" method=post>
                        		<input type="hidden" name="suma" value="5">
                        		<input type="submit" value="Incluir en carrito">
                       		</form>
                        </div>                       
                    </div>
                </div>
                <div class="col-md-3 col-sm-6">
                    <div class="single-shop-product">
                       
                        <h2>Arenero para gatos.</h2>
                        <div class="product-carousel-price">
                            <ins>30 &euro;</ins>
                        </div>  
                        
                        <div class="product-option-shop">
                        	<form action="/Practica1/Shop" method=post>
                        		<input type="hidden" name="suma" value="6">
                        		<input type="submit" value="Incluir en carrito">
                       		</form>
                        </div>                        
                    </div>
                </div>
                <div class="col-md-3 col-sm-6">
                    <div class="single-shop-product">
                       
                        <h2>Pecera.</h2>
                        <div class="product-carousel-price">
                            <ins>50 &euro;</ins>
                        </div>  
                        
                        <div class="product-option-shop">
                        	<form action="/Practica1/Shop" method=post>
                        		<input type="hidden" name="suma" value="7">
                        		<input type="submit" value="Incluir en carrito">
                       		</form>
                        </div>                       
                    </div>
                </div>
                <div class="col-md-3 col-sm-6">
                    <div class="single-shop-product">
                        
                        <h2>Jaula de p&aacute;jaro.</h2>
                        <div class="product-carousel-price">
                            <ins>40 &euro;</ins>
                        </div>  
                        
                        <div class="product-option-shop">
                        	<form action="/Practica1/Shop" method=post>
                        		<input type="hidden" name="suma" value="8">
                        		<input type="submit" value="Incluir en carrito">
                       		</form>
                        </div>                        
                    </div>
                </div>
                
            </div>
            
            
    </div>

   
    <!-- Latest jQuery form server -->
    <script src="https://code.jquery.com/jquery.min.js"></script>
    
    <!-- Bootstrap JS form CDN -->
    <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>
    
    <!-- jQuery sticky menu -->
    <script src="estilo/js/owl.carousel.min.js"></script>
    <script src="estilo/js/jquery.sticky.js"></script>
    
    <!-- jQuery easing -->
    <script src="estilo/js/jquery.easing.1.3.min.js"></script>
    
    <!-- Main Script -->
    <script src="estilo/js/main.js"></script>
  </body>
</html>