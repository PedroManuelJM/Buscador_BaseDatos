package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.LinkedList;
import Model.usuario;
import Model.Conexion;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Buscador</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\">\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js\"></script>\n");
      out.write("  \n");
      out.write("        <!-- NECESARIOS PARA REALIZAR EL BUSCADOR -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/buscador.css\">\n");
      out.write("        <script src=\"js/jquery.js\"></script>\n");
      out.write("        <script src=\"js/jquery.dataTables.min.js\"></script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <section class=\"section_item flex-container color-2\">\n");
      out.write("          <h1 class=\"flex-item\">Buscador Personas</h1>\n");
      out.write("        </section>\n");
      out.write("          <input type=\"search\" id=\"input-search\" placeholder=\"Buscar\"\n");
      out.write("             ");
 Conexion buscadorpersona=new Conexion();
                usuario bper=new usuario(buscadorpersona); 
      out.write("\n");
      out.write("                style=\"margin-left: 530px\"\n");
      out.write("             >\n");
      out.write("            <div class=\"content-search\" style=\"margin-left: 530px\">\n");
      out.write("                <div class=\"content-table\">\n");
      out.write("                    <table id=\"table\" >\n");
      out.write("                        <thead>\n");
      out.write("                            <tr>\n");
      out.write("                                <td></td>\n");
      out.write("                            </tr>\n");
      out.write("                        </thead> \n");
      out.write("                        <tbody >\n");
      out.write("                           ");
 
                           LinkedList<usuario> mostrarusuarios;
                           mostrarusuarios =bper.ListarUsuarios();
                           for (usuario j:mostrarusuarios ){
                           
      out.write("\n");
      out.write("                            <tr>\n");
      out.write("                                <td style=\"background-color:#ffffff;\">\n");
      out.write("                                    <form method=\"post\"\n");
      out.write("\t\t\t\t    action=\"Perfil_amigo.jsp\">\n");
      out.write("                                     <a>\n");
      out.write("                                        <button type=\"submit\" class=\"SubmitButtonClass btn-light\" style=\"border:none;padding:0px\"> <img src=\"");
      out.print(j.getImagen());
      out.write("\"style=\"width:60px ;\"> </button> \n");
      out.write("                                        <span style=\"margin-left:8px\">\n");
      out.write("                                        ");
      out.print(j.getNombre());
      out.write("\n");
      out.write("                                        ");
      out.print(j.getApellido());
      out.write("\n");
      out.write("                                        </span>\n");
      out.write("                                       <input type=\"hidden\" value=\"");
      out.print(j.getIdusuario());
      out.write("\" name=\"idpersona_buscada\">               \n");
      out.write("                                       \n");
      out.write("                                    </a>\n");
      out.write("                                    </form>   \n");
      out.write("                                </td>\n");
      out.write("                            </tr>\n");
      out.write("                             ");
  }   
      out.write("    \n");
      out.write("                        </tbody>\n");
      out.write("                    </table>     \n");
      out.write("                </div>    \n");
      out.write("            </div>\n");
      out.write("          <!-- NECESARIOS PARA REALIZAR EL BUSCADOR -->\n");
      out.write("          <script src=\"js/search.js\"></script>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
