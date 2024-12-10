package controller;

import java.io.IOException;
import java.util.List;

import dao.activitiesDao;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.activities;

@WebServlet("/activitiesController")
public class activitiesController extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private activitiesDao dao;

    @Override
    public void init() {
        dao = new activitiesDao(); // Khởi tạo đối tượng activitiesDao
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "list";
        }
        switch (action) {
            case "list":
                try {
                    listActivities(request, response); // Gọi phương thức để lấy dữ liệu
                } catch (ServletException e) {
                    e.printStackTrace();
                }
                break;
            default:
                response.sendRedirect("home.jsp");
                break;
        }
    }

    private void listActivities(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Kiểm tra xem dao có null hay không trước khi gọi phương thức
        if (dao != null) {
            List<activities> activities = dao.getAllActivities(); // Lấy danh sách hoạt động
            request.setAttribute("activities", activities);
            RequestDispatcher dispatcher = request.getRequestDispatcher("/activities.jsp");
            dispatcher.forward(request, response);
        } else {
            response.sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR, "Dao is not initialized.");
        }
    }
}
