<%@ page contentType = "text/html;charset=utf-8" %>
<<<<<<< HEAD

=======
>>>>>>> c57d7b70f889c13b64b86edfb15c8b9d666624fd
<%
    session.invalidate(); // 현재 세션 객체 전체 삭제
    response.sendRedirect("../admin/product_add.jsp");
%>