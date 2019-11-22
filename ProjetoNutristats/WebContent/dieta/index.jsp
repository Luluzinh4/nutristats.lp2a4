<%@page import="PersistJPA.UsuarioPersist"%>
<%@page import="Model.Dieta"%>
<%@page import="PersistJPA.DietaPersist"%>
<%@page import="Model.Usuario"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">

    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/foundation/6.5.3/css/foundation.css">
    <link href="../lib/css/style.css" rel="stylesheet" type="text/css">
    <link href="../lib/css/login.css" rel="stylesheet" type="text/css">
	<link href="../lib/css/dieta.css" rel="stylesheet" type="text/css">
    <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.4.1/jquery.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/foundation/6.5.3/js/foundation.js"></script>
    <script src="lib/js/script.js" defer></script>

    <title>NutriStats</title>
</head>
<body>
	<% if(null == null) { %>
	
	<div class="caixa">
    <header>
        <ul class="menu align-center">
            <li><a>Home</a></li>
            <li><a href="/dietas.jsp">Dietas</a></li>
            <%// Usuario u = (Usuario) request.getAttribute("userLogado");
            //String nome = u.getNome().split(" ")[0];
            %>
            <li><a>Bem Vindo, </a></li>
        </ul>
    </header>
    </div>
    
		<div class="fundo">

    	 
     <%
     	Dieta de = new Dieta();
     	de.setDescricao("Para ferias");
     	de.setCafeManha("Frutasaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
     	de.setCafeTarde("Pãaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaao");
     	de.setAlmoco("arraaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaoz");
     	de.setJanta("feiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaajão");
     	UsuarioPersist up = new UsuarioPersist();
     	Usuario u = up.verificarNomeUsuarioExiste("andre");
     	de.setUsuario(u);
	
     	
	    	DietaPersist dp = new DietaPersist();
 	     	//dp.save(de);
	    	List<Dieta> dietas = dp.findAll();
	    
	    	for(Dieta d: dietas){
			d.getId();
	    %>
    
     
    
    
<div class="people-you-might-know">
  <div class="add-people-header">
    <h6 class="header-title">
     <%=d.getDescricao() %> 
     
    </h6>
  </div>
  <div class="row add-people-section">
    <div class="small-12 medium-6 columns about-people">
      <div class="about-people-avatar">
       
      </div>
      <div class="about-people-author">
        <p class="author-name">
           Café da Manhã
        </p>
        <p class="author-location">
          <i class="fa fa-map-marker" aria-hidden="true"></i>
          <%=d.getCafeManha() %>
          
        </p>

      </div>    
      <div class="about-people-author">
        <p class="author-name">
          Almoço
        </p>
        <p class="author-location">
          <i class="fa fa-map-marker" aria-hidden="true"></i>
          <%=d.getAlmoco() %>
          
        </p>

      </div>  
            <div class="about-people-author">
        <p class="author-name">
          Café da tarde
        </p>
        <p class="author-location">
          <i class="fa fa-map-marker" aria-hidden="true"></i>
          <%=d.getCafeTarde() %>
          
        </p>

      </div> 
            <div class="about-people-author">
        <p class="author-name">
          Janta
        </p>
        <p class="author-location">
          <i class="fa fa-map-marker" aria-hidden="true"></i>
          <%=d.getJanta() %>
          
        </p>

      </div> 
    </div>
    
    <div class="small-12 medium-6 columns add-friend">
      <div class="add-friend-action">
        <button class="button success small">
          <i class="fa fa-user-plus" aria-hidden="true"></i>
         Editar
        </button>
        <button class="button secondary small">
          <i class="fa fa-user-times" aria-hidden="true"></i>
          excluir
        </button>
      </div>
    </div>
  </div>
 

	 <%
	    
		  }
	    
	    %>


 </div>

    <footer>
        <div class="row">
            <div class="columns">

                <a data-open="logout">Logout</a>
                <a data-open="perfil">Perfil</a>

                <div class="reveal" id="logout" data-reveal>
                    <form action="./UsuarioControlador?rota=deslogar" method="post">
                        <h4><strong>Deseja sair?</strong></h4>
                        <div class="btn">
                            <input type="submit" class="secondary button" value="Sair"> <br>
                            <small>Você será direcionado para a tela inicial</small> <br>
                            <%-- <a data-open="cadastro" class="secondary button">Cadastrar</a> --%>
                        </div>
                    </form>
                    <button class="close-button" data-close aria-label="Close reveal" type="button">
                    <span aria-hidden="true">&times;</span>
                </div>

               <div class="cadastro">
                  
                        <div class="reveal cadastro" id="cadastro" data-reveal>
                            <form action="./UsuarioControlador?rota=cadastrado" method="post">
                                <h1><strong>Cadastro do Site</strong></h1>
                                <h4><strong>Dados Principais</strong></h4>
                                <label for="nome">Nome Completo
                                    <input type="text" name="nomeUser" id="nomeUser">
                                </label>
                                <label for="email">Endereço de E-mail
                                    <input type="email" name="email" id="email">
                                </label>
                                <label for="dataNasc">Data de Nascimento
                                    <input type="date" name="dataNasc" id="dataNasc">
                                </label>
                                <label for="sexo">Sexo
                                    <select name="sexo" id="sexo">
                                        <option value="m">Masculino</option>
                                        <option value="f">Feminino</option>
                                        <option value="o">Outro</option>
                                    </select>
                                </label>
                                <hr>
                                <h4><strong>Dados de Login</strong></h4>
                                <label for="username">Nome de Usuário
                                    <input type="text" name="username" id="username" required>
                                </label>
                                <label for="senha">Senha
                                    <input type="password" name="senha" id="senha" required>
                                </label>
                                <label for="confirmSenha">Confirme a Senha
                                    <input type="password" name="confirmSenhaUser" id="confirmSenhaUser" required>
                                </label>
                                <div class="btn">
                                    <input type="submit" class="secondary button large" value="Cadastrar">
                                </div>
                                <button class="close-button" data-close aria-label="Close reveal" type="button">
                                <span aria-hidden="true">&times;</span>
                            </form>
                        </div>
                </div>
            </div>
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