<%@ page contentType = "text/html;charset=utf-8" %>
<%@ page import="java.utill.ArrayList"%>
<%@ page import="dto.Product"%>
<%@ page import="dao.ProductRepositoty"%>

<%
        String id = request.getParameter("id");
        if(id == null || id.trim().equals("")){
            response.sendRedirect("../index.jsp");
            return;
}

        ProductRepositoty dao = ProductRepositoty.getInstance();

        Product product = dao.getProductById(id);
        if (product == null){
            reponse.sendRedirect("../exception/product_not_found.jsp");
        }

        ArrayList<Product> goodsList = dao. getAllProducts();
        product goods = new Product();
        for (int i=0; i<goodsList.size(); i++){
            goods = goodsList.get(i);
            if(goods.getProductId().equals(id)){
                break;
            }
        }