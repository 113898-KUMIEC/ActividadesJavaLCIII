<%-- 
    Document   : index
    Created on : 9 feb 2023, 21:39:55
    Author     : Usuario
--%>

<%@page import="com.oregoom.mensajebien.Mensaje"%>
<%@page import="java.util.*"%>
<%@page import="com.oregoom.mensajebien.MensajeDao"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Mensajes</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
    </head>
    <body>

        <!-- Modal -->

        <div class="modal-dialog">
            <div class="modal-content">
                <form action="index.jsp" method="POST">
                    <div class="modal-header">
                        <h5 class="modal-title">Crear mensaje</h5>
                    </div>
                    <div class="modal-body">

                        <div class="mb-3">
                            <label>Mensaje</label>
                            <textarea class="form-control" name="mensaje" rows="3"></textarea>

                        </div>
                        <div class="mb-3">
                            <label>Autor</label>
                            <input type="text" name="autor" class="form-control">
                        </div>

                    </div>
                    <div class="modal-footer">
                        <button type="submit" class="btn btn-primary" name="Enviar">Enviar</button>
                    </div>
                </form>
            </div>
        </div>
        
        <%
            MensajeDao mensajedao = new MensajeDao();
            
            if(request.getParameter("Enviar") != null){
                Mensaje mensaje = new Mensaje(
                    request.getParameter("mensaje"),
                    request.getParameter("autor")
            );
            
            mensajedao.insertar(mensaje);
            
            }
        %>

        <!-- ===================================================================================================== -->
        
        <!-- ===================================================================================================== -->
        
        <div class="modal-dialog">
            <div class="modal-content">
                <div class="modal-header">
                    <h5 class="modal-title">Todos los mensajes</h5>
                </div>
                <%
                    
                    List<Mensaje> mensajes = mensajedao.seleccionar();
                    
                    Collections.reverse(mensajes);
                    
                    for(Mensaje mensaje : mensajes){
                        
                    
                
                %>
                <div class="modal-body">
                    <div class="card"">
                        <div class="card-body">
                            <h5 class="card-title"><%=mensaje.getAutor()%></h5>
                            <p class="card-text"><%=mensaje.getMensaje()%></p>

                            <p class="blockquote-footer"><cite><%=mensaje.getFecha()%></cite></p>
                            <a href="editar.jsp?id=<%=mensaje.getId()%>
                               &&mensaje=<%=mensaje.getMensaje()%>
                               &&autor=<%=mensaje.getAutor()%>
                               &&fecha=<%=mensaje.getFecha()%>" 
                               class="card-link">Editar</a>
                            <a href="eliminar.jsp?id=<%=mensaje.getId()%>" class="card-link">Eliminar</a>
                        </div>
                    </div>
                </div>
                <%}%>
            </div>

        </div>

    </body>
</html>
