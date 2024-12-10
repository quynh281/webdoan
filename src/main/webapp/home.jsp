<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="vi">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">    
    <!-- CSS Tùy chỉnh -->
    <link rel="stylesheet" href="css/style.css">
    <style>
        .logo {
            width: 100px;  
            height: 100px; 
            border-radius: 50%; 
            object-fit: cover; 
        }
    </style>
</head>
<body>
    <!-- Header -->
   <header class="bg-white">
    <div class="container">
        <div class="d-flex align-items-center py-2">
            <!-- Logo -->
            <img src="images/Logo-ued.png" alt="Logo UED" width="100" class="logo">
            <!-- Text bên cạnh -->
            <div>
                <h6 class="mb-0">KHOA TIN HỌC</h6>
                <h5 class="mb-0">TRƯỜNG ĐẠI HỌC SƯ PHẠM - ĐẠI HỌC ĐÀ NẴNG</h5>
            </div>
        </div>
    </div>
</header>
    
    <!-- Thanh điều hướng -->
<nav class="navbar navbar-expand-lg">
    <div class="container">
        <a class="navbar-brand" href="home.jsp">Trang chủ</a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarNav">
            <ul class="navbar-nav ml-auto"> 
                <!-- Dropdown Giới thiệu -->
                <li class="nav-item dropdown">
                    <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                        Giới thiệu
                    </a>
                    <div class="dropdown-menu" aria-labelledby="navbarDropdown">
                        <a class="dropdown-item" href="gioithieuchung.jsp">Giới thiệu chung</a>
                        <a class="dropdown-item" href="lecturerController.java">Cơ cấu tổ chức</a>
                    </div>
                </li>
                <li class="nav-item"><a class="nav-link" href="#">Tin tức</a></li>
                <li class="nav-item"><a class="nav-link" href="#">Sinh viên</a></li>
                <li class="nav-item"><a class="nav-link" href="#">Đào tạo</a></li>
                <li class="nav-item"><a class="nav-link" href="#">Liên chi tin học</a></li>
                <li class="nav-item"><a class="nav-link" href="#">Cổng thông tin</a></li>  
                <li class="nav-item"><a class="nav-link" href="login.jsp">Đăng nhập</a></li>                              
            </ul>
        </div>
    </div>
</nav>
    <!-- Nội dung chính -->
    <main class="container mt-4">
        <h1 class="text-danger"> Khoa Tin học</h1>
        <img src="images/giangvien.png" alt="Khoa tin học" width="1200">        
        <div class="row">
            <div class="col-md-8">              
            </div>
            <div class="col-md-4">
                <div class="bg-light p-3">
                    <h5> Khoa Tin học - Facebook</h5>
                    <p>14,832 người theo dõi</p>
                    <a href="https://www.facebook.com/khoatinhoc" target="_blank">
                    <button class="btn btn-primary">Theo dõi Trang</button>
                </a>
                </div>
            </div>
        </div>
    </main>

    <!-- Footer -->
    <footer class="bg-dark text-white text-center py-3 mt-4">
        © 2024 - Khoa Tin học
    </footer>

    <!-- Bootstrap JS -->
    <script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>  <!-- Thay đổi thành jquery.min.js -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.2/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
