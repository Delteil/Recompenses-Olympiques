package Servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Connexion
 */
@WebServlet("/connexion")
public class ConnexionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ConnexionServlet() {
		super();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		// Récupération des champs du formulaire. //
		String login = request.getParameter("login");
		String motDePasse = request.getParameter("motdepasse");

		if (login.equals("amandine") && motDePasse.equals("password")) {

			// Stocker un utilisateur
			HttpSession session = request.getSession(true);
			session.setAttribute(login, login);
			session.setAttribute(motDePasse, motDePasse);

			response.sendRedirect(request.getContextPath() + "/bienvenue.jsp");
			
		} else if (login.equals("") || (motDePasse.equals(""))) {
			response.sendRedirect(request.getContextPath() + "/page_erreur.jsp");
		}
	}
}
