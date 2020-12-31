<%-- 
    Document   : index
    Created on : 31-dic-2020, 14:00:40
    Author     : PCGAMING
--%>

<%@page import="java.util.LinkedList"%>
<%@page import="Model.usuario"%>
<%@page import="Model.Conexion"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Buscador</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
  
        <!-- NECESARIOS PARA REALIZAR EL BUSCADOR -->
        <link rel="stylesheet" href="css/buscador.css">
        <script src="js/jquery.js"></script>
        <script src="js/jquery.dataTables.min.js"></script>
    </head>
    <body>
        <section class="section_item flex-container color-2">
          <h1 class="flex-item">Buscador Personas</h1>
        </section>
          <input type="search" id="input-search" placeholder="Buscar"
             <% Conexion buscadorpersona=new Conexion();
                usuario bper=new usuario(buscadorpersona); %>
                style="margin-left: 530px"
             >
            <div class="content-search" style="margin-left: 530px">
                <div class="content-table">
                    <table id="table" >
                        <thead>
                            <tr>
                                <td></td>
                            </tr>
                        </thead> 
                        <tbody >
                           <% 
                           LinkedList<usuario> mostrarusuarios;
                           mostrarusuarios =bper.ListarUsuarios();
                           for (usuario j:mostrarusuarios ){
                           %>
                            <tr>
                                <td style="background-color:#ffffff;">
                                    <form method="post"
				    action="Perfil_amigo.jsp">
                                     <a>
                                        <button type="submit" class="SubmitButtonClass btn-light" style="border:none;padding:0px"> <img src="<%=j.getImagen()%>"style="width:60px ;"> </button> 
                                        <span style="margin-left:8px">
                                        <%=j.getNombre()%>
                                        <%=j.getApellido()%>
                                        </span>
                                       <input type="hidden" value="<%=j.getIdusuario()%>" name="idpersona_buscada">               
                                       
                                    </a>
                                    </form>   
                                </td>
                            </tr>
                             <%  }   %>    
                        </tbody>
                    </table>     
                </div>    
            </div>
          <!-- NECESARIOS PARA REALIZAR EL BUSCADOR -->
          <script src="js/search.js"></script>
    </body>
</html>
