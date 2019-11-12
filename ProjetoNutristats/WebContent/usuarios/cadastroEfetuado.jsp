<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">

    <link href="./lib/css/login.css" rel="stylesheet" type="text/css">
    <title>Conta criada</title>
</head>
<body>
        <div class="fundo">
                <div class="caixa">
                        <div>

                            <div align="center">

								<%
								String redirect=null;
								
								String resultado=request.getParameter("cpf");
								String retorno = null;

							    retorno = ""+ request.getAttribute("retorno");
								String mensagem = null;
								String botao = null;
								if(retorno.trim().equals("inserido")==true){
									
									mensagem = "Conta criada :)";
									botao = "Entrar";
									redirect ="./index.jsp";

									
								}else
									if(retorno.trim().equals("JaCadastrado") ==true){
										mensagem = "Usuario ja cadastrado no nosso sistema";
										botao = "Tente novamente";
										redirect ="./index.jsp";

								}else
									if(retorno.trim().equals("email") ==true || retorno.trim().equals("senha")){
										mensagem = "Usuario ou senha inválidos :(";
										botao = "Tente novamente";
										redirect ="./index.jsp";
											
									}
									else{
										mensagem = "Ocorreu um erro durante o cadastro :(";
										botao = "Tente novamente";
										redirect ="./index.jsp";
									}
		

								
								%>

                                <form action="<%=redirect%>" method="post">
                                    <br>
                                    <h3 style="color: white"><%=mensagem %>  </h3>

                                    <br>
                                    <button type="submit"><%=botao%></button>
                                    

                                </form>
                            </div>        
                       
                     </div>
                </div>
                
       </div>
        


</body>
</html>