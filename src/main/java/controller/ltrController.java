package controller;

import java.io.IOException;
import java.util.List;

import dao.ltrDao;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.lecturer;

@WebServlet("/ltrController")
public class ltrController extends HttpServlet {
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	String action = request.getParameter("action");
        if (action == null) {
            action = "list";
        }
        switch (action) {
        case "list":
        	listLecturers(request, response);
        	break;
        
        default:
        	response.sendRedirect("home.jsp");
        	break;
        }
		
    }
    
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	// TODO Auto-generated method stub
    	doGet(req, resp);
    }
	
    
    private void listLecturers(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	
    	String role = (String) request.getSession().getAttribute("role");
        if (role == null || !"admin".equals(role)) {
            response.sendRedirect("login.jsp"); // Chuyển hướng về trang đăng nhập nếu không phải admin
            return;
        }
        
        List<lecturer> lecturers = ltrDao.getAllLecturers();

        request.setAttribute("lecturers", lecturers);

        RequestDispatcher dispatcher = request.getRequestDispatcher("lecturerManagement.jsp");
        dispatcher.forward(request, response);
    }
}