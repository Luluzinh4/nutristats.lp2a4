package Controler;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import Model.Usuario;
import PersistJPA.UsuarioPersist;


@WebServlet("/UsuarioControlador")
public class UsuarioControlador extends HttpServlet {
	private static final long serialVersionUID = 1L;
//    String listar="usuarios/listar.jsp";
//    String add="usuarios/adicionar.jsp";
//    String edit="usuarios/editar.jsp";
    String cadastrado = "usuarios/cadastroEfetuado.jsp";
	String logado = "logado.jsp";
	String telaInicial = "index.jsp";
	
	
	private static Usuario UsuarioSistema;
	
    public UsuarioControlador() {
        super();

    }
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String acesso="";
		 String rota=request.getParameter("rota");
		 System.out.println("Entrou no get no logout. Rota: " + rota);
		 
		
		//tela de logout
		if(rota.equalsIgnoreCase("deslogar")) {
			request.setAttribute("userLogado", null);
			acesso = telaInicial;
		}
		
		RequestDispatcher usuariosViews = request.getRequestDispatcher(acesso);
		usuariosViews.forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String acesso="";
		String rota=request.getParameter("rota");
		String retorno=null;
		UsuarioPersist up = new UsuarioPersist();
		//Tela de cadastro
		if(rota.equalsIgnoreCase("cadastrado")) {
			acesso=cadastrado;
			
			Usuario u = new Usuario();

			u.setDtaNascimento(request.getParameter("dataNasc"));
			u.setEmail(request.getParameter("email"));
			u.setNome(request.getParameter("nomeUser"));
			u.setSexo(request.getParameter("sexo"));
			u.setSenha(request.getParameter("senha"));
			u.setNomeUsuario(request.getParameter("username"));
			if(up.VerificarSeUsuarioExiste(u)==null) {
			   up.save(u);
			   retorno = "inserido";
			}else {
				retorno = "JaCadastrado";
			}
		}
		//tela de login
		if(rota.equalsIgnoreCase("logado")) {
			String username = request.getParameter("username");

			//if(up.verificarEmailExiste(email)==null) {
			if(up.verificarNomeUsuarioExiste(username)==null) {	
				retorno = "email";
				acesso=cadastrado;
			}else {
				System.out.println("ENTROU A1");
				String senha = request.getParameter("senha");
				
				//Usuario userLogado = up.verificarEmailExiste(email);
				Usuario userLogado = up.verificarNomeUsuarioExiste(username);

				if(up.verificarSenhaEstaCorreta(userLogado,senha)==true) {
					setUsuarioSistema(userLogado);
					request.setAttribute("userLogado", getUsuarioSistema());
					acesso = logado;
				}else {
					retorno = "senha";
					acesso=cadastrado;

				}
			}
		}
		request.setAttribute("retorno", retorno);
		RequestDispatcher usuariosViews = request.getRequestDispatcher(acesso);
		usuariosViews.forward(request, response);
		
	}

	public static Usuario getUsuarioSistema() {
		return UsuarioSistema;
	}

	public static void setUsuarioSistema(Usuario usuarioSistema) {
		UsuarioSistema = usuarioSistema;
	}



}
