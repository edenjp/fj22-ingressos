<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib tagdir="/WEB-INF/tags/" prefix="ingresso" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<ingresso:template>
    <jsp:body>
    	<div class=" col-md-6 col-md-offset-3">
        	<h2 class="text-center">Seja Bem-vindo ao Caelum Ingresso!</h2>
        	<h5 class="text-center">Este site é de propósito academico.</h5>
        	
        	<div class="card" style="width: 18rem;">
  				<img src="http://br.web.img3.acsta.net/c_215_290/pictures/19/07/05/17/30/5167951.jpg" class="card-img-top" alt="...">
  				<div class="card-body">
    				<h5 class="card-title">Filmes em Cartaz</h5>
    				<p class="card-text">Acesse aqui para ter acesso a lista com todos os nossos filmes em cartaz. Um deles será do seu agrado. Divirta-se!</p>
    				<a href="/filme/em-cartaz" class="btn btn-primary">Filmes em cartaz</a>
  				</div>
			</div>
        </div>
    </jsp:body>
</ingresso:template>