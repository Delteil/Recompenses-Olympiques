package Servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import Entites.Athletes;
import Entites.Disciplines;
import Entites.Recompenses;

/**
 * Servlet implementation class BievenueServlet
 */
@WebServlet("/tableau")
public class TableauServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public TableauServlet() {
		super();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		ArrayList<Athletes> athlete = new ArrayList<Athletes>();
		Athletes athlete1 = new Athletes("Bond", "James");
		Athletes athlete2 = new Athletes("Marley", "Bob");
		athlete1.addRecompensesAndDisciplines(Recompenses.MEDAILLE_ARGENT, Disciplines.COURSE_100M);
		athlete2.addRecompensesAndDisciplines(Recompenses.MEDAILLE_BRONZE, Disciplines.SAUT_HAUTEUR);
		athlete.add(athlete1);
		athlete.add(athlete2);

//		ArrayList<Disciplines> disciplines = new ArrayList<Disciplines>();
//		Disciplines discipline1 = new Disciplines(Disciplines.COURSE_100M);
//		Disciplines discipline2 = new Disciplines(Disciplines.SAUT_HAUTEUR);
//		Disciplines discipline3 = new Disciplines(Disciplines.SAUT_PERCHE);
//		discipline.add(discipline1);
//		discipline.add(discipline2);
//		discipline.add(discipline3);
//
//
//		ArrayList<Recompenses> recompenses = new ArrayList<Recompenses>();
//		Recompenses recompense1 = new Recompenses(Recompenses.MEDAILLE_OR);
//		Recompenses recompense2 = new Recompenses(Recompenses.MEDAILLE_ARGENT);
//		Recompenses recompense3 = new Recompenses(Recompenses.MEDAILLE_BRONZE);
//		recompense.add(recompense1);
//		recompense.add(recompense2);
//		recompense.add(recompense3);

		request.setAttribute("athlete", athlete);
//		request.setAttribute("discipline", disciplines);
//		request.setAttribute("recompense", recompenses);

		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/tableau.jsp");
		dispatcher.forward(request, response);

	}
}
