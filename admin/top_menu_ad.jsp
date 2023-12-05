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
            <a class="navbar-brand" href="./index.jsp" style="color: black;">메뉴바 : 홈페이지</a>
            <a class="navbar-brand" href="./index.jsp" style="color: black;">회원 보기/추가/수정/삭제</a>
            <a class="navbar-brand" href="index_ad.jsp" style="color: black;">상품 보기</a>
            <a class="navbar-brand" href="product_add.jsp" style="color: black;">등록</a>
            <a class="navbar-brand" href="product_edit.jsp?edit=update" style="color: black;">수정</a>
            <a class="navbar-brand" href="product_edit.jsp?edit=delete" style="color: black;">삭제</a>
            <a class="navbar-brand" href="../index.jsp" style="color: black;">일반모드</a>
        </div>
    </div>
</nav>