package application;

import java.io.IOException;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import entities.LpEntry;


/**
 * Servlet implementation class CreateLpServlet
 */
@WebServlet("/CreateLpServlet")
public class CreateLpServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CreateLpServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		
		
		
		String albumName = request.getParameter("aN");
		String artist = request.getParameter("ar");
		String genre = request.getParameter("ge");
		String year = request.getParameter("ye");
		String tracks = request.getParameter("tr");
		String length = request.getParameter("le");
		int yearin = Integer.parseInt(year);
		int tracksin = Integer.parseInt(tracks);
		int lengthin = Integer.parseInt(length);
		
		
		//EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("LpDbJPA");
		//EntityManager em = emfactory.createEntityManager();
		//em.getTransaction().begin();
		//LpEntry toAdd = new LpEntry (albumName, artist, genre, yearin, tracksin, lengthin);
		
		String actionToPerform = request.getParameter("doThisToItem");
		if(actionToPerform.equals("Submit Album")){
			//request.setAttribute("ElectionName", electName);
			LpHelper dao = new LpHelper();
			dao.CreateLp(albumName, artist, genre, yearin, tracksin, lengthin);
			//em.persist(toAdd);		
			//em.getTransaction().commit();
			//em.close();
			//emfactory.close();
			System.out.println("Launch us to list");
			getServletContext().getRequestDispatcher("/LpListServlet").forward(request, response);
		}


}
}
