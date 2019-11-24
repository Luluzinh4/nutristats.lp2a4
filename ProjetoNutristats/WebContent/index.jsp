<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">

    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/foundation/6.5.3/css/foundation.css">
    <link href="lib/css/style.css" rel="stylesheet" type="text/css">

    <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.4.1/jquery.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/foundation/6.5.3/js/foundation.js"></script>
    <script src="lib/js/script.js" defer></script>

    <title>NutriStats</title>
</head>
<body>
    <main>
        <div id="pesquisa" align="center">
            <img src="https://i.imgur.com/MTA5XT4.png" alt="imagem-logo" id="logo">
            <form action="./NutrienteControlador" method="get">
                <input type="search" name="barraPesq" placeholder="Ex. feij�o..." class="animated-search-form" id="barraPesquisa">
                <button class="hollow button success animated-button" type="submit" id="bt-buscar">Buscar</button>
            </form>
        </div>

        <table class="responsive-card-table unstriped" id="tb-pesquisa">
        </table>
    </main>
    
    <footer>
        <div class="row">
            <div class="columns">
                <a data-open="login">Login</a>

                <div class="reveal" id="login" data-reveal>
                    <form action="./UsuarioControlador?rota=logado" method="post">
                        <h4><strong>Realize o Login</strong></h4>
                        <label for="nome">Usu�rio
                            <input type="text" name="username" id="username">
                        </label>
                        <label for="senhaUser">Senha
                            <input type="password" name="senha" id="senhaUser">
                        </label>
                        <a href="#">Esqueceu a senha?</a> <br>
                        <div class="btn">
                            <input type="submit" class="secondary button" value="Login"> <br>
                            <small>Novo por aqui?</small> <br>
                            <a data-open="cadastro" class="secondary button">Cadastrar</a>
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
                                <label for="email">Endere�o de E-mail
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
                                <label for="username">Nome de Usu�rio
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
</body>
</html>