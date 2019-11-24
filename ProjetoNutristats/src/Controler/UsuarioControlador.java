package Controler;

import java.io.Console;
import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.Dieta;
import Model.Nutriente;
import Model.Usuario;
import PersistJDBC.NutrienteJDBC;
import PersistJPA.DietaPersist;
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
	String dieta = "dieta/index.jsp";
	String dietaCadastro = "dieta/cadastro.jsp";
	String buscaLogado = "./nutriente/buscaLogado.jsp";

	private static Usuario UsuarioSistema;
	
    public UsuarioControlador() {
        super();
        
    }
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String acesso="";
		 String rota=request.getParameter("rota");
		// response.sendRedirect(acesso);
		 if(rota !=null) {
				//tela de logout
				if(rota.equalsIgnoreCase("deslogar")) {
					request.setAttribute("userLogado", null);
					acesso = telaInicial;
					request.removeAttribute("userLogado");
				}
				if(rota.equalsIgnoreCase("dieta")) {
					acesso = dieta;
					request.setAttribute("userLogado", getUsuarioSistema());
				
				}
				
				if(rota.equalsIgnoreCase("telaInicial")) {
					acesso = logado;
					request.setAttribute("userLogado", getUsuarioSistema());
					
				}
				if(rota.equalsIgnoreCase("CadastrarDieta")) {
					acesso = dietaCadastro;
					request.setAttribute("userLogado", getUsuarioSistema());
				
				}
				if(rota.equalsIgnoreCase("excluirDieta")) {
					Integer id = Integer.parseInt(request.getParameter("i"));
					
					DietaPersist dp = new  DietaPersist();
					dp.remove(id);

					acesso = dieta;
					request.setAttribute("userLogado", getUsuarioSistema());
					
				}
				if(rota.equalsIgnoreCase("editarDieta")) {
					Integer id = Integer.parseInt(request.getParameter("i"));
					DietaPersist dp = new  DietaPersist();
					Dieta d = dp.findById(id);
					
					
					acesso = dietaCadastro;
					request.setAttribute("dietaEdit", d);
					request.setAttribute("userLogado", getUsuarioSistema());
					
				}
		 }
		 
		

		if(request.getParameter("barraPesq") != null) {
			NutrienteJDBC np  = new NutrienteJDBC();
			
			String descricao = request.getParameter("barraPesq");
			System.out.println("QUnatosasffa ");
			List<Nutriente> nutrientes = null;
			nutrientes = np.listarPorTipoAlimento(descricao);
			acesso = buscaLogado;
			request.setAttribute("nutrientes", nutrientes);
			request.setAttribute("userLogado", getUsuarioSistema());
			
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
				String senha = request.getParameter("senha");
				
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
		if(rota.equalsIgnoreCase("editar")) {
			System.out.println("sfasfs");
			Usuario u = getUsuarioSistema();
			
			u.setDtaNascimento(request.getParameter("dataNasc"));
			u.setEmail(request.getParameter("email"));
			u.setNome(request.getParameter("nomeUser"));
			u.setSexo(request.getParameter("sexo"));
			u.setSenha(request.getParameter("senha"));
			u.setNomeUsuario(request.getParameter("username"));
			if(up.VerificarSeUsuarioExisteEditar(u)==null) {
			   up.save(u);
				request.setAttribute("userLogado", u);
				setUsuarioSistema(u);
			   retorno = "atualizado";
			   acesso= logado;
			}else {
				retorno = "JaCadastradoLogado";
				acesso = cadastrado;
				}
		}
		
		if(rota.equalsIgnoreCase("dietaCadastro")) {
			
			Dieta de = new Dieta();
			DietaPersist dp = new DietaPersist();
			if(request.getParameter("id")!=null) {
				Integer id = Integer.parseInt(request.getParameter("id"));
				de = dp.findById(id);
				System.out.println("sfasfsfasfsaf"+ id);
			}
	     	de.setDescricao(request.getParameter("descricao"));
	     	de.setCafeManha(request.getParameter("cafemanha"));
	     	de.setCafeTarde(request.getParameter("cafetarde"));
	     	de.setAlmoco(request.getParameter("almoco"));
	     	de.setJanta(request.getParameter("janta"));
	     	
	     	de.setUsuario(getUsuarioSistema());
	     	
	     	dp.save(de);
	     	acesso = dieta;
			request.setAttribute("userLogado", getUsuarioSistema());
			
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
