<%@ page contentType = "text/html;charset=utf-8" %>
<%@ page import="dto.Product"%>
<%@ page import="dao.ProductRepository"%>
<%
    String id = request.getParameter("cartId");
    if (id == null || id.trim().equals("")) {
        response.sendRedirect("prodcut_car.jsp");
        return;
    }

    session.invalidate(); // 세션 초기화

    response.sendRedirect("product_cart.jsp");

%>