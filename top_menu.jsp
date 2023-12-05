<%@ page contentType="text/html; charset=utf-8"%>
<nav class="navbar navbar-expand navbar-white bg-white">
        <div class="dropdown">
            <button class="btn btn-secondary dropdown-toggle" type="button" id="dropdownMenuButton" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                카테고리
            </button>
            <div class="dropdown-menu" aria-labelledby="dropdownMenuButton">
                <a class="dropdown-item" href="#">CPU</a>
                <a class="dropdown-item" href="#">MAINBOARD</a>
                <a class="dropdown-item" href="#">MEMORY</a>
                <a class="dropdown-item" href="#">HDD/SDD</a>
                <a class="dropdown-item" href="#">CASE/POWER/COOLER</a>
                <a class="dropdown-item" href="#">MOUSE/KEYBOARD</a>
            </div>
            <img src="image\mainlogo.jpg" class="img-fluid" alt="main_image">
        </div>
    <div class="container">
        <div class="navbar-header">
            <a class="navbar-brand" href="./index.jsp" style="color: black;">메인 홈페이지</a>
            <a class="navbar-brand" href="./index.jsp" style="color: black;">로그인</a>
            <a class="navbar-brand" href="BoardListAction.do?pageNum=1" style="color: black;">게시판(고객센터)</a>
            <a class="navbar-brand" href="admin/index_ad.jsp" style="color: black;">관리자모드</a>
        </div>
    </div>
</nav>