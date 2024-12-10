package controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.lecturer;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import dao.lecturerDao;

@WebServlet("/lecturerController")
public class lecturerController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private lecturerDao dao;

    @Override
    public void init() {
        dao = new lecturerDao();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "list";
        }
        switch (action) {
            case "list":
            	listLecturers(request, response);
            default:
                response.sendRedirect("home.jsp");
                break;
        }
    }

    private void listLecturers(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        List<lecturer> lecturers = dao.getAllLecturers();
        
        System.out.println(lecturers);
        request.setAttribute("lecturers", lecturers);

        RequestDispatcher dispatcher = request.getRequestDispatcher("/giangVien.jsp");
        dispatcher.forward(request, response);
    }
    

}
