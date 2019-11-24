<%@page import="java.util.List"%>
<%@page import="Model.Nutriente"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html><head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/foundation/6.5.3/css/foundation.css">
    <link href="./lib/css/style.css" rel="stylesheet" type="text/css">
	<link href="./lib/css/dieta.css" rel="stylesheet" type="text/css">
    <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.4.1/jquery.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/foundation/6.5.3/js/foundation.js"></script>
    <script src="./lib/js/script.js" defer></script>
    
  </head><body>

 <div align="center">
 </br>
         <a href="./index.jsp" type="submit" class="button sucess">Voltar</a> <br>


   
    <%
    List<Nutriente> nutrientes = (List<Nutriente>) request.getAttribute("nutrientes");
                                		
        for(Nutriente n: nutrientes){
        	 
         
    %>
      
    <div class="card" style="width: 500px;">
  <div class="card-divider">
  		<%=n.getDescricao() %>
  </div>
  <div class="card-section">
    <p>Carboidratos: <%=n.getCarboidrato() %>     Proteinas: <%=n.getProteina() %></p>
    <p>Calcio: <%=n.getCalcio() %> Lipídeos: <%=n.getLipideos()%> Umidade: <%=n.getUmidade()%></p>
  </div>
</div>
<%
         }
%>
</div>








     
    

  
  

</body></html>