package Controler;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import Model.MayTinh;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import DAO.MayTinhs;
import Controler.HomeControler;
public class CartControler extends HttpServlet {
    private static final long serialVersionUID = 1L;
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<MayTinh> cartProducts = new ArrayList<>();
        Cookie[] cookies = request.getCookies();
        if (cookies != null) {
            for (Cookie cookie : cookies) {
                if (cookie.getName().startsWith("product_")) {
                    String[] parts = cookie.getValue().split("\\|");
                    if (parts.length == 3) {
                        String id = cookie.getName().substring(8); 
                        String name = parts[0];
                        double price = Double.parseDouble(parts[1]);
                        String ima = parts[2];
                        MayTinh product = new MayTinh(id, name, ima, price, ima);
                        cartProducts.add(product);
                    }
                }
            }
        }
        
        request.setAttribute("cartProducts", cartProducts);
        
        RequestDispatcher dispatcher = request.getRequestDispatcher("/view/Cart.jsp");
        dispatcher.forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String productId = request.getParameter("productId"); 
        MayTinh product = MayTinhs.getById(productId); 
        if (product != null) {
            Cookie cookie = new Cookie("product_" + product.getId(), product.getName() + "|" + product.getPrice() + "|" + product.getIma());
            cookie.setMaxAge(24 * 200 * 200); 
            response.addCookie(cookie); 
        }


        doGet(request, response);
    }
}