<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Sửa Giảng Viên</title>
</head>
<body>
    <h2>Sửa Giảng Viên</h2>
    <form action="lecturerController?action=edit" method="post">
        <input type="hidden" name="id" value="${lecturer.id}">
        <label for="name">Họ tên:</label>
        <input type="text" name="name" value="${lecturer.ten}" required><br>
        
        <label for="chucDanh">Chức danh:</label>
        <input type="text" name="chucDanh" value="${lecturer.chucDanh}" required><br>
        
        <label for="email">Email:</label>
        <input type="email" name="email" value="${lecturer.email}" required><br>
        
        <label for="boMon">Bộ môn:</label>
        <input type="text" name="boMon" value="${lecturer.boMon}" required><br>
        
        <label for="urlImage">URL Hình ảnh:</label>
        <input type="text" name="urlImage" value="${lecturer.urlImage}" required><br>
        
        <button type="submit">Cập nhật</button>
    </form>
</body>
</html>