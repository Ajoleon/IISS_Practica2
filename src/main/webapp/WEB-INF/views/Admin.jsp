<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<style> table, tr, td, th {border:1px solid brown;} </style>
	<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Administración</title>
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
                        <h2>P&aacute;gina de administraci&oacute;n</h2>
                    </div>
                </div>
            </div>
        </div>
    </div>
		<table cellspacing="0" class="shop_table cart">
                                    <thead>
                                        <tr>
                                            <th class="product-remove">ID</th>
                                            
                                            <th class="product-name">Cookie</th>
                                            
                                            
                                        </tr>
                                    </thead>
					 
					     <tbody>
					     	<c:forEach items="${cookie}" var="user">
                                        <tr class="cart_item">

	                                            <td class="product-name">
	                                                <c:out value="${user.value.name }"/>
	                                            </td>
	
	                                            <td class="product-price">
	                                                <c:out value="${user.value.value}"/>
	                                            </td>

                                        	</tr>
                                        </c:forEach>
                                   	 </tbody>
                                    
                                </table>
   
 					

	</body>
</html>