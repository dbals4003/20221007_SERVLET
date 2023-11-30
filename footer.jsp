<%@ page contentType="text/html; charset=utf-8"%>
<%@ page import="example.*" %>
<footer class="container">
        <p>&copy; 쇼핑몰 대표 : 이유민, 고유번호 : 20221007, 연락처 : dbals4003@sungkyul.ac.kr<br>
        <%
            ShopTime time = new ShopTime();
        %>
        오늘 날짜와 시간 : <%=time.timenow() %>
    </p>
</footer>