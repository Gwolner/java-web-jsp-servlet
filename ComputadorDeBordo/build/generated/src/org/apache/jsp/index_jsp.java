package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link href=\"css/style.css\" rel=\"stylesheet\">\n");
      out.write("        <title>iGmax</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"bkg\">\n");
      out.write("            \n");
      out.write("            <h1 class=\"title\">iGmax</h1>\n");
      out.write("            \n");
      out.write("            <form method=\"post\" action=\"CoreServlet\">\n");
      out.write("                <label>Total de combustível:</label>\n");
      out.write("                <input value=\"8\" type=\"text\" pattern=\"[0-9]\" title=\"Somente números\" size=\"5\" name=\"total\" required placeholder=\" Litros\"><br>\n");
      out.write("                <br>\n");
      out.write("                \n");
      out.write("                <label>Preço do litro:</label>\n");
      out.write("                <input value=\"8\" type=\"text\" pattern=\"[0-9]\" title=\"Somente números\" size=\"5\" name=\"preco\" required placeholder=\" R$\"><br>\n");
      out.write("                <br>\n");
      out.write("                \n");
      out.write("                <label>Consumo médio:</label>\n");
      out.write("                <input value=\"8\" type=\"text\" pattern=\"[0-9]\" title=\"Somente números\" size=\"5\" name=\"consumo\" required placeholder=\" Km/l\"><br><br>\n");
      out.write("                \n");
      out.write("                <div class=\"div-left-btn\">\n");
      out.write("                    <input class=\"btn left\" type=\"reset\" value=\"Limpar\">\n");
      out.write("                    <input class=\"btn middle\" type=\"submit\" value=\"Calcular\">\n");
      out.write("                </div>\n");
      out.write("            </form>\n");
      out.write("            <form method=\"get\" action=\"network.jsp\">\n");
      out.write("                <input class=\"btn rigth\" type=\"submit\" value=\"Testar rede\">\n");
      out.write("            </form>\n");
      out.write("        </div>    \n");
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
