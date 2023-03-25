<%-- 
    Document   : eliminar
    Created on : 10 feb 2023, 15:28:12
    Author     : Usuario
--%>

<%@page import="com.oregoom.mensajebien.MensajeDao"%>
<%@page import="com.oregoom.mensajebien.Mensaje"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
             String id = request.getParameter("id");
             Mensaje mensaje = new Mensaje(Integer.valueOf(id));
             MensajeDao mensajedao = new MensajeDao();
             mensajedao.eliminar(mensaje);
             request.getRequestDispatcher("index.jsp").forward(request, response);
        %>
    </body>
</html>
