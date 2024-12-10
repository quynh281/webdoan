<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Danh sách Giảng viên theo Bộ môn</title>
    <link rel="stylesheet" href="<%=request.getContextPath()%>/css/style.css">
</head>
<body>
    <div class="container">
        <h2>Danh sách giảng viên : ${boMon}</h2>
        <div class="lecturer-row">
            <c:forEach var="lecturer" items="${lecturers}">
                <div class="lecturer-card">
                    <img src="${lecturer.urlImage}" alt="Ảnh giảng viên" class="lecturer-image">
                    <h3>${lecturer.ten}</h3>
                    <p>Chức vụ: ${lecturer.chucDanh}</p>
                    <p>Email: <a href="mailto:${lecturer.email}">${lecturer.email}</a></p>
                </div>
            </c:forEach>
        </div>
    </div>
</body>
</html>