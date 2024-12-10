<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Hoạt động sinh viên </title>
</head>
<body>
<div class="container">
    <h2 class="my-4">Hoạt động</h2>
    <div class="row">
        <c:forEach var="activity" items="${activities}">
            <div class="col-md-6 mb-4">
                <div class="card">
                    <img src="${activity.imageUrl}" class="card-img-top" alt="Activity Image">
                    <div class="card-body">
                        <h5 class="card-title">${activity.title}</h5>
                        <p class="card-text">${activity.description}</p>
                        <a href="activityDetail?id=${activity.id}" class="btn btn-primary">Chi tiết</a>
                    </div>
                </div>
            </div>
        </c:forEach>
    </div>
</div>

</body>
</html>