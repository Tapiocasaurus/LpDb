package application;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//import entities.LpEntry;

/**
 * Servlet implementation class EditLpServlet
 */
@WebServlet("/EditLpServlet")
public class EditLpServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EditLpServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//LpHelper dao = new LpHelper();
		//dao.getAllItems();
		//request.setAttribute("AllItems", dao.getAllItems());
		//getServletContext().getRequestDispatcher("/EditLp.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		

		//String tempId = request.getParameter("iD");
		//String albumName = request.getParameter("an");
		//String artist = request.getParameter("ar");
		//String genre = request.getParameter("ge");
		//String year = request.getParameter("ye");
		//String tracks = request.getParameter("tr");
		//String length = request.getParameter("le");
		
		
		

		//LpEntry toEdit = new LpEntry (albumName, artist, genre, yearin, tracksin, lengthin);
		
		
		
	//	String actionToPerform = request.getParameter("doThisToItem");
		//if(actionToPerform.equals("Submit Changes")){

			
			//em.persist(toEdit);		
			//em.getTransaction().commit();
			//em.close();
			//emfactory.close();
		
			
			//int tempId = (request.getParameter("iD"));
			//int yearin = Integer.parseInt(year);
			//int tracksin = Integer.parseInt(tracks);
			//int lengthin = Integer.parseInt(length);
			//LpHelper dao = new LpHelper();
			//int tempIdin = Integer.parseInt(tempId);
			//System.out.println(tempIdin);
			//dao.UpdateLp(tempIdin, albumName, artist, genre, yearin, tracksin, lengthin);
			
		//	System.out.println("Launch us to list");
			//getServletContext().getRequestDispatcher("/ChangeSave.jsp").forward(request, response);
		}

	}

//}
