<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%
    // Kiểm tra session để đảm bảo chỉ admin mới được truy cập
    String role = (String) session.getAttribute("role");
    if (role == null || !"admin".equals(role)) {
        response.sendRedirect("login.jsp"); // Chuyển hướng về trang đăng nhập nếu không phải admin
    }
%>
<!DOCTYPE html>
<html lang="vi">
<head>
    <meta charset="UTF-8">
    <title>Quản lý giảng viên</title>
    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
</head>
<body>
    <!-- Header -->
    <header class="bg-primary text-white text-center py-2">
        <h2>Quản lý giảng viên</h2>
    </header>

    <!-- Nội dung chính -->
    <div class="container mt-4">
        <!-- Thông báo -->

		<c:if test="${empty lecturers}">
			<div class="alert alert-warning">Không có giảng viên nào trong
				hệ thống.</div>
		</c:if>
		<c:if test="${not empty message}">
            <div class="alert alert-success">${message}</div>
        </c:if>
        
        <!-- Bảng danh sách giảng viên -->
        <div class="mb-4">
            <h4 class="mb-3">Danh sách giảng viên</h4>
            <table class="table table-bordered table-hover" method = "post">
                <thead class="thead-dark">
                    <tr>
                        <th>ID</th>
                        <th>Họ tên</th>
                        <th>Chức danh</th>
                        <th>Email</th>
                        <th>Bộ môn</th>  
                        <th>urlImage</th>                     
                        <th>Hành động</th>
                        
                    </tr>
                </thead>
                <tbody>
                    <c:forEach var="lecturer" items="${lecturers}">
                        <tr>
                            <td>${lecturer.id}</td>
                            <td>${lecturer.ten}</td>
                            <td>${lecturer.chucDanh}</td>
                            <td>${lecturer.email}</td>
                            <td>${lecturer.boMon}</td>
                            <td>${lecturer.urlImage}</td>
                            <td>
                                <a href="ltrController?action=edit&id=${lecturer.id}" class="btn btn-warning btn-sm">Sửa</a>
                                <a href="ltrController?action=delete&id=${lecturer.id}" class="btn btn-danger btn-sm" onclick="return confirm('Bạn có chắc muốn xóa giảng viên này?');">Xóa</a>
                            </td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
        </div>

        <!-- Form thêm giảng viên -->
        <div class="card">
            <div class="card-header bg-primary text-white">Thêm giảng viên mới</div>
            <div class="card-body">
                <form action="ltrController" method="post">
                     <input type="hidden" name="action" value="add">
                    <div class="form-group">
                        <label for="name">Họ tên:</label>
                        <input type="text" class="form-control" id="ten" name="ten" required>
                    </div>
                    <div class="form-group">
                        <label for="department">Chức Danh:</label>
                        <input type="text" class="form-control" id="chucDanh" name="chucDanh" required>
                    </div>
                    <div class="form-group">
                        <label for="email">Email:</label>
                        <input type="email" class="form-control" id="email" name="email" required>
                    </div>
                    <div class="form-group">
                        <label for="department">Bộ môn:</label>
                        <input type="text" class="form-control" id="boMon" name="boMon" required>
                    </div>                
                    <div class="form-group">
                        <label for="position">urlImage:</label>
                        <input type="text" class="form-control" id="urlImage" name="urlImage" required>
                    </div>
                    <button type="submit" class="btn btn-primary btn-block">Thêm giảng viên</button>
                </form>
            </div>
        </div>
    </div>

    <!-- Footer -->
    <footer class="bg-dark text-white text-center py-3 mt-4">
        © 2024 - Khoa Tin học
    </footer>

    <!-- Bootstrap JS -->
    <script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.2/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
