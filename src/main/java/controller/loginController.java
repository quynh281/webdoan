package controller;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/loginController")
public class loginController extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Lấy thông tin từ form đăng nhập
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        // Kiểm tra thông tin đăng nhập
        if ("nhom".equals(username) && "10122024".equals(password)) { // Thay bằng thông tin admin của bạn
            // Lưu thông tin vào session
            HttpSession session = request.getSession();
            session.setAttribute("role", "admin");
            session.setAttribute("username", username);

            // Chuyển hướng đến trang adminDashboard.jsp
            response.sendRedirect("adminDashboard.jsp");
        } else {
            // Đăng nhập thất bại, hiển thị lỗi
            request.setAttribute("errorMessage", "Tên đăng nhập hoặc mật khẩu không đúng!");
            request.getRequestDispatcher("/login.jsp").forward(request, response);
        }
    }
}
