package application;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entities.LpEntry;

/**
 * Servlet implementation class MasterControllerServlet
 */
@WebServlet("/MasterControllerServlet")
public class MasterControllerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	static int eid = 0;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MasterControllerServlet() {
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
		
		
		
		String actionToPerform = request.getParameter("doThisToItem");
		if(actionToPerform.equals("Add a New Album")){
			//request.setAttribute("ElectionName", electName);
			//ElectionMasterControl.setElecName(electName);

			System.out.println("Launch us to list");
			getServletContext().getRequestDispatcher("/CreateLpEntryjsp.jsp").forward(request, response);
		}
		else if (actionToPerform.equals("Delete Album")){
			int tempId = Integer.parseInt(request.getParameter("id"));
			
			System.out.println(tempId);
			LpHelper dao = new LpHelper();
			//LpEntry toRemove = dao.getAllItems().get(tempId);
			dao.DeleteLp(tempId);
			getServletContext().getRequestDispatcher("/ChangeSave.jsp").forward(request, response);
}
		
		else if (actionToPerform.equals("Edit Album")){
			int tempId = Integer.parseInt(request.getParameter("id"));
			eid = tempId;
			System.out.println(tempId);
			LpHelper dao = new LpHelper();
			LpEntry toEdit = dao.getFromID(tempId);
			request.setAttribute("iD",  toEdit.getId());
			request.setAttribute("aN", toEdit.getAlbumName());
			request.setAttribute("aR", toEdit.getArtist());
			request.setAttribute("gE", toEdit.getGenre());
			request.setAttribute("yE", toEdit.getYear());
			request.setAttribute("tR", toEdit.getTracks());
			request.setAttribute("lE", toEdit.getLength());
			

			getServletContext().getRequestDispatcher("/EditLp.jsp").forward(request, response);
}
		
		if(actionToPerform.equals("Submit Changes")){

			//int tempId = Integer.parseInt(request.getParameter("id"));
			String albumName = request.getParameter("an");
			String artist = request.getParameter("ar");
			String genre = request.getParameter("ge");
			String year = request.getParameter("ye");
			String tracks = request.getParameter("tr");
			String length = request.getParameter("le");
			//em.persist(toEdit);		
			//em.getTransaction().commit();
			//em.close();
			//emfactory.close();
		
			
			//int tempId = Integer.parseInt(request.getParameter("iD"));
			int yearin = Integer.parseInt(year);
			int tracksin = Integer.parseInt(tracks);
			int lengthin = Integer.parseInt(length);
			LpHelper dao = new LpHelper();
			//int tempIdin = Integer.parseInt(tempId);
			System.out.println(eid);
			dao.UpdateLp(eid, albumName, artist, genre, yearin, tracksin, lengthin);
			
			System.out.println("Launch us to list");
			getServletContext().getRequestDispatcher("/ChangeSave.jsp").forward(request, response);
		}

		else if (actionToPerform.equals("Okay, thanks for that.")){
			getServletContext().getRequestDispatcher("/LpListServlet").forward(request, response);
		}
	}

}
