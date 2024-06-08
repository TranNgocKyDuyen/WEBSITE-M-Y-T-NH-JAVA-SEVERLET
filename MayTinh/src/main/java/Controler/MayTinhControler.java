package Controler;

import jakarta.servlet.RequestDispatcher; 
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import Model.MayTinh;
import Service.MayTinhSe;
import java.io.IOException;
import java.util.List;

import DAO.MayTinhs;

/**
 * Servlet implementation class BaloController
 */
@SuppressWarnings("unused")
public class MayTinhControler extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MayTinhControler() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		showMayTinhs(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
String button = request.getParameter("button");
		
		switch (button) {
			case "add":
				addMayTinh(request, response);
				break;
			case "edit":
				editMayTinh(request, response);
				break;
			case "delete":
				deleteMayTinh(request, response);
				showMayTinhs(request, response);
				break;
			case "save":
				saveMayTinh(request, response);
				showMayTinhs(request, response);
				break;
			case "closebook":
				showMayTinhs(request, response);
				break;
			case "close":
				System.out.print(button);
				response.sendRedirect("Home");
				break;
			default:
				showMayTinhs(request, response);
				break;
		}
	}
	
	private void deleteMayTinh(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String currID = request.getParameter("currBookID");
		request.setAttribute("currBookID", currID);
	    if (currID != null && !currID.isEmpty()) {
	        MayTinh maytinhToDelete = new MayTinh(currID, "","", 0,"");
	        boolean deleteSuccess = MayTinhs.delete(maytinhToDelete);
	        if (deleteSuccess) {
	            showMayTinhs(request, response);
	        }
	    }
	}

	private void showMayTinhs(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<MayTinh> maytinhs = MayTinhs.getAll();
		request.setAttribute("maytinhs", maytinhs);
		RequestDispatcher rd=request.getRequestDispatcher("/view/maytinhs.jsp");  
        rd.forward(request, response);
	}
	private void addMayTinh(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		RequestDispatcher rd=request.getRequestDispatcher("/view/maytinh.jsp");  
        rd.forward(request, response);
	}
	private void editMayTinh(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String currID = request.getParameter("currBookID");
		
		request.setAttribute("currBookID", currID);
		
		RequestDispatcher rd=request.getRequestDispatcher("/view/maytinh.jsp");  
        rd.forward(request, response);
	}
	private void saveMayTinh(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String id = request.getParameter("id").toString();
		String ima = request.getParameter("ima").toString();
		String name = request.getParameter("name").toString();
		double price = Double.parseDouble(request.getParameter("price").toString());
		String mota = request.getParameter("mota").toString();
		MayTinh maytinh = new MayTinh(id,ima,name,price,mota);
		
		MayTinhs.save(maytinh);
	}
	

}
