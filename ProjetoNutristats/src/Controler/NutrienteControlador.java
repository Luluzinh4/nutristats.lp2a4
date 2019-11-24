package Controler;

import java.awt.Cursor;
import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.Nutriente;
import PersistJDBC.NutrienteJDBC;
import PersistJPA.NutrientePersist;

/**
 * Servlet implementation class NutrienteControlador
 */
@WebServlet("/NutrienteControlador")
public class NutrienteControlador extends HttpServlet {
	private static final long serialVersionUID = 1L;
	String deslogado = "./nutriente/busca.jsp";

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		 String acesso ="";

				NutrienteJDBC np  = new NutrienteJDBC();
				
				String descricao = request.getParameter("barraPesq");
				System.out.println("QUnatosasffa ");
				List<Nutriente> nutrientes = null;
				nutrientes = np.listarPorTipoAlimento(descricao);
				System.out.println("QUnatosasffa "+nutrientes.size());
				acesso = deslogado;
				request.setAttribute("nutrientes", nutrientes);

				request.getRequestDispatcher(acesso).forward(request, response);
			
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
