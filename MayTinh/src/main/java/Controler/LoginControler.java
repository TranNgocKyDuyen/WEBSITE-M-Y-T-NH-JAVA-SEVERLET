package Controler;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import Model.User;

import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class LoginController
 */
@SuppressWarnings("unused")
public class LoginControler extends HttpServlet {
    private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginControler() {
        super();
        
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        /* show login page */
        
        RequestDispatcher rd=request.getRequestDispatcher("/view/login.jsp");  
        rd.forward(request, response);
        
        
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");  
        
        String email = request.getParameter("email");  
        String password = request.getParameter("password");
        
        User user = new User();
        user.setEmail(email);
        user.setPassword(password);
        
        boolean status = user.validate();
        
        if (status && email.equals("admin@gmail.com")) {
            response.sendRedirect("MayTinh");
        } else if (status) {
            response.sendRedirect("Home"); 
        } else {
            // Set error message if login fails
            request.setAttribute("error", "Invalid email or password.");
            RequestDispatcher rd = request.getRequestDispatcher("/view/login.jsp");
            rd.forward(request, response);
        }
    }
}