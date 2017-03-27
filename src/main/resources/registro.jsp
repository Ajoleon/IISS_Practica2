<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Registro</title>
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

<div class="product-big-title-area">
        <div class="container">
            <div class="row">
                <div class="col-md-12">
                    <div class="product-bit-title text-center">
                        <h2>Registro</h2>
                    </div>
                </div>
            </div>
        </div>
    </div>
<p>Por favor, introduzca a continuación unos datos extra:</p> 
			<form action="/Practica1/Nuevo" method="post">
				Telefono:<br> <input type="text" name="tlf" required><br>
				E-mail:<br> <input type="email" name="email" required><br>
				Direccion Postal:<br> <input type="text" name="dir" required><br>
				<input type="submit" value=Confirmar > 
		</form>
	</body>
</html>