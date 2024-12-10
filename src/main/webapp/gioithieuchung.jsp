<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="vi">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Khoa Tin học</title>
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
            </ul>
        </div>
    </div>
</nav>
    <!-- Nội dung giới thiệu chung -->
    <main class="container mt-4">
        <h1 class="text-danger">Giới thiệu chung</h1>
        <p>Chào mừng các bạn đến với Khoa Tin học trực thuộc Trường Đại học Sư Phạm – Đại học Đà Nẵng.</p>
        <p>Khoa Tin học được thành lập tháng 2 năm 2004 trên cơ sở tách khoa Toán – Tin thành 2 khoa Tin học và khoa Toán. Chức năng nhiệm vụ của Khoa Tin học là:</p>
        <ul>
            <li>Giảng dạy chuyên ngành Thạc sĩ Hệ thống thông tin</li>
            <li>Giảng dạy tin học đại cương cho tất cả các ngành trong đại học Sư phạm và một số trường thành viên của Đại học Đà Nẵng</li>
            <li>Giảng dạy chuyên ngành Công nghệ thông tin và Sư phạm Tin học</li>
            <li>Nghiên cứu Khoa học trong lĩnh vực Công nghệ thông tin và Hệ thống thông tin</li>
        </ul>
        <p>Với tinh thần đổi mới và trách nhiệm, Khoa Tin học luôn xác định lấy người học làm trung tâm, lấy chất lượng và uy tín làm tiêu chí quan trọng nhất cho mọi hoạt động, cho sự sống còn và phát triển. Đội ngũ giảng viên của Khoa Tin học, kết hợp chặt chẽ với nhiều chuyên gia tham gia giảng dạy đến từ các doanh nghiệp trong nước và quốc tế, cam kết luôn giữ vững tôn chỉ tận tụy phục vụ hết mình cho sự nghiệp giáo dục và đào tạo nguồn nhân lực chất lượng cao cho đất nước. Đội ngũ giảng dạy không chỉ là những thầy cô giáo chuẩn mực, có kiến thức chuyên sâu và cập nhật, có phương pháp giảng dạy hiện đại, mà còn là những cố vấn tin cậy và thân thiện, luôn đồng hành cùng các bạn trên con đường theo đuổi niềm đam mê và kiến tạo tương lai vững chắc.</p>
        <p>Với những yếu tố trên, Khoa Tin học chắc chắn là địa chỉ tin cậy cho các bạn để gửi gắm ước mơ, hoài bão và mong muốn trong tương lai.</p>
        
        <h3>Đội ngũ cán bộ:</h3>
        <p>Lực lượng giảng viên, cán bộ của Khoa gồm 15 người, trong đó có 9 Tiến sĩ, 2 Giảng viên chính, 5 Nghiên cứu sinh, 1 Cử nhân (cán bộ thư ký và giáo vụ).</p>
        
        <h3>Các ngành nghề đào tạo:</h3>
        <ul>
            <li>Cử nhân Công nghệ thông tin</li>
            <li>Cử nhân Sư phạm Tin học</li>
            <li>Thạc sĩ Hệ thống thông tin</li>
        </ul>
        
        <h3>Nghiên cứu khoa học:</h3>
        <p>Khoa chủ trì nhiều đề tài NCKH cấp Bộ và cấp cơ sở với các hướng nghiên cứu sau: Giáo dục điện tử (E-Learning), Các thuật toán tối ưu đồ thị và mạng (Graph and Network Optimization Algorithms), Cơ sở dữ liệu (Database), Hệ phân tán (Distributed Systems), Tin sinh học (Bioinformatics).</p>
        
        <h3>Hợp tác trong nước và quốc tế:</h3>
        <p>Khoa là đối tác đào tạo và nghiên cứu với các công ty, trung tâm tin học trong và ngoài thành phố Đà Nẵng như là: FPT Software (FSoft), Axon Active, Gameloft, Logigear, Enclave, AsNet, Mgm,...</p>
        
        <p>Chúc các bạn may mắn và thành công trên con đường đi tới tương lai.</p>
        
        <p><strong>Hiệu trưởng:</strong> PGS-TS. Võ Văn Minh</p>
    </main>

    <!-- Footer -->
    <footer class="bg-dark text-white text-center py-3 mt-4">
        © 2024 - Khoa Tin học
    </footer>

    <!-- Bootstrap JS -->
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.2/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
