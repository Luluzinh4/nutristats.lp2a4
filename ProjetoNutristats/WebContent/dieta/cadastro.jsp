<%@page import="Model.Dieta"%>
<%@page import="Model.Usuario"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">

    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/foundation/6.5.3/css/foundation.css">
    <link href="lib/css/style.css" rel="stylesheet" type="text/css">
    <link href="lib/css/login.css" rel="stylesheet" type="text/css">
 	<link href="lib/css/logado.css" rel="stylesheet" type="text/css">

    <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.4.1/jquery.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/foundation/6.5.3/js/foundation.js"></script>
    <script src="lib/js/script.js" defer></script>

    <title>NutriStats</title>
</head>

<body>
	<% if(request.getAttribute("userLogado") != null) {   %>
    <header>
        <ul class="menu align-center">
           <li><a href="./UsuarioControlador?rota=telaInicial">Home</a></li>
           <li><a href="./UsuarioControlador?rota=dieta">Dietas</a></li>
            <% Usuario u = (Usuario) request.getAttribute("userLogado");
            
            String nome = u.getNome().split(" ")[0];
            %>
            <li><a>Bem Vindo, <%=nome %></a></li>
        </ul>
    </header>
    <main>
  
    </main>
    <%
    
    if(request.getAttribute("dietaEdit") != null) {
    	Dieta d = (Dieta) request.getAttribute("dietaEdit");
    	
    	%>
    	    <div align="center">
	
    <div class="card" style="width: 500px;">
    <form action="./UsuarioControlador?rota=dietaCadastro" method="post">
  <div class="card-divider">  
  <input  type="hidden"	name="id" value=<%=d.getId() %>>
  	<h4> Descrição:	</h4>       
           
    <p>
       <input value="<%=d.getDescricao() %>"style="box-shadow:none;" type="search" name="descricao" placeholder="Ex. Dieta para férias..." class="animated-search-form" id="barraPesquisa">
  
    </p>
     
  </div>
  <div class="card-section">
    <h3> Café da manhã: </h3>
       <input value="<%=d.getCafeManha() %>" style="box-shadow:none;" type="search" name="cafemanha" placeholder="Ex. feijão..." class="animated-search-form" id="barraPesquisa">
  
   <hr>
  <h3> Almoço: </h3>
     <input value="<%=d.getAlmoco() %>" style="box-shadow:none;"style="box-shadow:none;" type="search" name="almoco"  class="animated-search-form" id="barraPesquisa">
 
     <hr>
      <h3> Café da tarde: </h3>
       
        <input value="<%=d.getCafeTarde() %>" style="box-shadow:none;" type="search" name="cafetarde" class="animated-search-form" id="barraPesquisa">
 
        <hr>
        <h3> Jantar: </h3>
        <input value="<%=d.getJanta() %>"style="box-shadow:none;" type="search" name="janta" class="animated-search-form" id="barraPesquisa">
 
  </div>

  <button  type="submit" class="button sucess" >Editar</button> 
   </form> 
    
 <a href="./UsuarioControlador?rota=dieta" type="submit" class="secondary button" >Voltar</a><br>
 
</div>         

 
 </div> 
    	
    	
    	<%
    	
    }else{
    	
    	
    	
    	
    	
    	%>
    	
     <div align="center">

    <div class="card" style="width: 500px;">
    <form action="./UsuarioControlador?rota=dietaCadastro" method="post">
  <div class="card-divider">  	
  	<h4> Descrição:	</h4>       
            
    <p>
       <input style="box-shadow:none;" type="search" name="descricao" placeholder="Ex. Dieta para férias..." class="animated-search-form" id="barraPesquisa">
  
    </p>
     
  </div>
  <div class="card-section">
    <h3> Café da manhã: </h3>
       <input style="box-shadow:none;" type="search" name="cafemanha" placeholder="Ex. feijão..." class="animated-search-form" id="barraPesquisa">
  
   <hr>
  <h3> Almoço: </h3>
     <input style="box-shadow:none;"style="box-shadow:none;" type="search" name="almoco"  class="animated-search-form" id="barraPesquisa">
 
     <hr>
      <h3> Café da tarde: </h3>
       
        <input style="box-shadow:none;" type="search" name="cafetarde" class="animated-search-form" id="barraPesquisa">
 
        <hr>
        <h3> Jantar: </h3>
        <input style="box-shadow:none;" type="search" name="janta" class="animated-search-form" id="barraPesquisa">
 
  </div>

  <button  type="submit" class="button sucess" >Cadastrar</button> 
   </form> 
    
 <a href="./UsuarioControlador?rota=dieta" type="submit" class="secondary button" >Voltar</a><br>
 
</div>         

 
 </div>   	
    	
    	
    	<%
    	
    }
    
    %>
    
     
    
    
    
    
    <footer>
        <div class="row">
            <div class="columns">

                <a data-open="logout">Logout</a>
                <a data-open="perfil">Perfil</a>
                 

                <div class="reveal" id="logout" data-reveal>	
      
                        <h4><strong>Deseja sair?</strong></h4>
                        <div class="btn">
                            <a href="./UsuarioControlador?rota=deslogar" type="submit" class="secondary button" "> Sair</a> <br>
                            <small>Você será direcionado para a tela inicial</small> <br>
                            <%-- <a data-open="cadastro" class="secondary button">Cadastrar</a> --%>
                        </div>
                    <button class="close-button" data-close aria-label="Close reveal" type="button">
                    <span aria-hidden="true">&times;</span>
                </div>
                   <div class="reveal" id="perfil" data-reveal>
                   <div class="card-profile-stats">
  <div class="card-profile-stats-intro">

    <img class="card-profile-stats-intro-pic" src="lib/imagens/semFoto.png" alt="profile-image" />
    <div class="card-profile-stats-intro-content">
      <h3><%=u.getNome() %></h3>
      <p>@<%=u.getNomeUsuario() %></small></p>
    </div> <!-- /.card-profile-stats-intro-content -->
  </div> <!-- /.card-profile-stats-intro -->

  <hr />

  <div class="card-profile-stats-container">
    <div class="card-profile-stats-statistic">
      <span class="stat">25</span>
      <p>IMC</p>
    </div> <!-- /.card-profile-stats-statistic -->
    <div class="card-profile-stats-statistic">
      <span class="stat">125</span>
      <p>TMB</p>
    </div> <!-- /.card-profile-stats-statistic -->
    <div class="card-profile-stats-statistic">
      <span class="stat">10</span>
      <p>Dietas</p>
    </div> <!-- /.card-profile-stats-statistic -->
  </div> <!-- /.card-profile-stats-container -->
   <a data-open="editar">Editar</a>
   
      <div class="reveal" id="editar" data-reveal>
  <form action="./UsuarioControlador?rota=editar" method="post">
                                <h1><strong>Cadastro do Site</strong></h1>
                                <h4><strong>Dados Principais</strong></h4>
                                <label for="nome">Nome Completo
                                    <input type="text" name="nomeUser" id="nomeUser" value ="<%=u.getNome()%>">
                                </label>
                                <label for="email">Endereço de E-mail
                                    <input type="email" name="email" id="email" value="<%=u.getEmail()%>">
                                </label>
                                <label for="dataNasc">Data de Nascimento
                                    <input type="date" name="dataNasc" id="dataNasc" value="<%=u.getDtaNascimento()%>">
                                </label>
                                <label for="sexo">Sexo
                                    <select name="sexo" id="sexo" value="">
                                        <option value="m">Masculino</option>
                                        <option value="f">Feminino</option>
                                        <option value="o">Outro</option>
                                    </select>
                                </label>
                                <hr>
                                <h4><strong>Dados de Login</strong></h4>
                                <label for="username">Nome de Usuário
                                    <input type="text" name="username" id="username" required value="<%=u.getNomeUsuario()%>">
                                </label>
                                <label for="senha">Senha
                                    <input type="password" name="senha" id="senha" required >
                                </label>
                                <label for="confirmSenha">Confirme a Senha
                                    <input type="password" name="confirmSenhaUser" id="confirmSenhaUser" required>
                                </label>
                                <div class="btn">
                                    <input type="submit" class="secondary button large" value="Editar">
                                </div>
                                <button class="close-button" data-close aria-label="Close reveal" type="button">
                                <span aria-hidden="true">&times;</span>
                            </form>
                </div>
   
   
   
  <div class="card-profile-stats-more">
    <p class="card-profile-stats-more-link"><a href="#"><i class="fa fa-angle-down" aria-hidden="true"></i></a></p>
    <div class="card-profile-stats-more-content">
      <p>
        Lorem ipsum dolor sit amet, consectetur adipisicing elit. Voluptatem libero fugit, pariatur maxime! Optio enim, deserunt quia molestiae fugiat delectus, dolore et esse nostrum, quod autem necessitatibus fugit soluta repellendus.
      </p>
    </div> <!-- /.card-profile-stats-more-content -->
  </div> <!-- /.card-profile-stats-more -->
</div> <!-- /.card-profile-stats -->
                    <button class="close-button" data-close aria-label="Close reveal" type="button">
                    <span aria-hidden="true">&times;</span>
                </div>

              
    </footer>
    <% } else { %>
    
    <div class="fundo">
                <div class="caixa">
                        <div>

                            <div align="center">

                                <form action="index.jsp" method="post">
                                    <br>
                                    <h3 style="color: white">Usuário Anônimo</h3>

                                    <br>
                                    <button type="submit">Voltar a Tela Inicial</button>
                                </form>
                            </div>        
                       
                     </div>
                </div>
                
       </div>
    
    <% } %>
</body>
</html>