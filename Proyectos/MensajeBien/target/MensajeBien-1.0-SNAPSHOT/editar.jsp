<%-- 
    Document   : editar
    Created on : 10 feb 2023, 15:04:36
    Author     : Usuario
--%>

<%@page import="com.oregoom.mensajebien.Mensaje"%>
<%@page import="com.oregoom.mensajebien.MensajeDao"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Editar mensaje</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
    
    </head>
    <body>
        <!-- Modal -->

        <div class="modal-dialog">
            <div class="modal-content">
                <form action="editar.jsp" method="POST">
                    <div class="modal-header">
                        <h5 class="modal-title">Editar mensaje</h5>
                    </div>
                    <div class="modal-body">

                        <div class="form-group">
                            <input type="hidden" name="id" class="form-control" value="<%=request.getParameter("id")%>">
                            <label>Mensaje</label>
                            <textarea class="form-control" name="mensaje" rows="3"><%=request.getParameter("mensaje")%></textarea>

                        </div>
                        <div class="mb-3">
                            <label>Autor</label>
                            <input type="text" name="autor" class="form-control" value="<%=request.getParameter("autor")%>">
                        </div>

                    </div>
                    <div class="modal-footer">
                        <a href="index.jsp" type="submit" class="btn btn-danger">Volver atras</a>
                        <button type="submit" class="btn btn-primary" name="Enviar">Guardar cambios</button>
                    </div>
                </form>
            </div>
        </div>
                                <%
            MensajeDao mensajedao = new MensajeDao();
            
            String id = request.getParameter("id");
            
            if(request.getParameter("Enviar") != null){
                Mensaje mensaje = new Mensaje(
                    Integer.parseInt(id.trim()),
                    request.getParameter("mensaje"),
                    request.getParameter("autor")
            );
            
            mensajedao.update(mensaje);
            
            }
        %>
                        
    </body>
</html>
