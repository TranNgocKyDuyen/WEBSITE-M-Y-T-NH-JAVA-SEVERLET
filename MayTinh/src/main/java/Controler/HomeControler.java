	package Controler;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import Model.MayTinh;
import Model.User;
import Service.MayTinhSe;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import com.mysql.cj.Session;

import DAO.MayTinhs;

/**
 * Servlet implementation class HomeController
 */
@SuppressWarnings("unused")
public class HomeControler extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HomeControler() {
        super();
        
    }
    
    private void showHomePage(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<MayTinh> maytinhs = MayTinhSe.getAllMayTinhs();
        request.setAttribute("homepage", maytinhs);
        RequestDispatcher rd=request.getRequestDispatcher("/view/homepage.jsp");  
        rd.forward(request, response);
    }
    
    
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        showHomePage(request, response);
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
