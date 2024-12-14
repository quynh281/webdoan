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
            case "delete":
                deleteLecturer(request, response);
                break;
            default:
                response.sendRedirect("home.jsp");
                break;
        }
    }
    
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getParameter("action");
        if ("add".equals(action)) {
            addLecturer(req, resp);
        } else {
            doGet(req, resp);
        }
    }
    
    private void listLecturers(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String role = (String) request.getSession().getAttribute("role");
        if (role == null || !"admin".equals(role)) {
            response.sendRedirect("login.jsp");
            return;
        }
        
        List<lecturer> lecturers = ltrDao.getAllLecturers();
        request.setAttribute("lecturers", lecturers);
        RequestDispatcher dispatcher = request.getRequestDispatcher("lecturerManagement.jsp");
        dispatcher.forward(request, response);
    }

    private void addLecturer(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String ten = request.getParameter("ten");
        String chucDanh = request.getParameter("chucDanh");
        String email = request.getParameter("email");
        String boMon = request.getParameter("boMon");
        String urlImage = request.getParameter("urlImage");

        lecturer newLecturer = new lecturer();
        newLecturer.setTen(ten);
        newLecturer.setChucDanh(chucDanh);
        newLecturer.setEmail(email);
        newLecturer.setBoMon(boMon);
        newLecturer.setUrlImage(urlImage);

        boolean success = ltrDao.addLecturer(newLecturer);
        if (success) {
            request.setAttribute("message", "Thêm giảng viên thành công!");
        } else {
            request.setAttribute("message", "Thêm giảng viên thất bại!");
        }

        listLecturers(request, response);
    }

    private void deleteLecturer(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        
        boolean success = ltrDao.deleteLecturer(id);
        if (success) {
            request.setAttribute("message", "Xóa giảng viên thành công!");
        } else {
            request.setAttribute("message", "Xóa giảng viên thất bại!");
        }
        
        listLecturers(request, response);
    }
}
