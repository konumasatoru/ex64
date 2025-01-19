package ex64;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


public class Ex64Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    int rand = (int)(Math.random() * 10);
    if (rand % 2 == 1) {
    	response.sendRedirect("redirected.jsp");
    } else {
    	RequestDispatcher dispatcher = request.getRequestDispatcher("forwarded.jsp");
    	dispatcher.forward(request, response);
      }
	}
}
