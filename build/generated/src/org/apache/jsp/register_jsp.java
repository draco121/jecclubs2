package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.io.*;

public final class register_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>REGISTER NOW</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/bootstrap.min.css\">\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js\"></script>\n");
      out.write("        <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("      \n");
      out.write("    </head>\n");
      out.write("    <body >\n");
      out.write("        \n");
      out.write("        <p class=\"container text-center\" style=\"padding-top:100px;\">this is a sample text.this is a sample text.this is a sample text.this is a sample text.this is a sample text.this is a sample text.\n");
      out.write("            this is a sample text.this is a sample text.this is a sample text.this is a sample text.this is a sample text.this is a sample text.</p>\n");
      out.write("        <br>\n");
      out.write("        <div class=\"container container-fluid\">\n");
      out.write("\n");
      out.write("            <div class='container'>\n");
      out.write("                <h2 style='text-align:center'> Registeration </h2>\n");
      out.write("                <form>\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("\n");
      out.write("                        <label for=\"inputName\">Name</label>\n");
      out.write("\n");
      out.write("                        <input type=\"name\" class=\"form-control\" id=\"inputName\" placeholder=\"Your name..\">\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label for=\"selectbranch\">Branch</label>\n");
      out.write("                        <select class=\"form-control\" id=\"selectbranch\">\n");
      out.write("                            <option>computer science and engineering</option>\n");
      out.write("                            <option>information technology</option>\n");
      out.write("                            <option>electronics and communication</option>\n");
      out.write("                            <option>civil engineering</option>\n");
      out.write("                            <option>mechanical engineering</option>\n");
      out.write("                            <option>electrical engineering</option>\n");
      out.write("                            <option>industrial production and engineering</option>\n");
      out.write("                        </select>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label for=\"selectsem\">Semester</label>\n");
      out.write("                        <select class=\"form-control\" id=\"selectsem\" placeholder=\"Select Semester\">\n");
      out.write("                            <option>Select Semester</option>\n");
      out.write("                            <option>I</option>\n");
      out.write("                            <option>II </option>\n");
      out.write("                            <option>III</option>\n");
      out.write("                            <option>IV</option>\n");
      out.write("                            <option>V</option>\n");
      out.write("                            <option>VI</option>\n");
      out.write("\n");
      out.write("                        </select>\n");
      out.write("\n");
      out.write("                    </div> \n");
      out.write("\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label>email <span class=\"glyphicon glyphicon-envelope\"></span></label>\n");
      out.write("                        <input id=\"email\" type=\"text\" class=\"form-control\" name=\"email\" placeholder=\"Email\">\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <button type=\"submit\" class=\"btn btn-primary\">Register</button>\n");
      out.write("\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        ");

          try{
               String name= request.getParameter("inputName");
               String branch= request.getParameter("selectbranch");
               String sem= request.getParameter("selectsem");
               String email= request.getParameter("email");
                String connectionURL = "jdbc:mysql://localhost:3306/";
                

        // declare a connection by using Connection interface 
                Connection connection = null;

        
               Class.forName("com.mysql.jdbc.Driver");

                /* Create a connection by using getConnection() method that takes parameters of 
        string type connection url, user name and password to connect to database. */
                connection = DriverManager.getConnection(connectionURL, "root", "");
                Statement st= connection.createStatement();
        // check weather connection is established or not by isClosed() method 
                if (!connection.isClosed())
       {
           int i= st.executeUpdate("insert into registration(name,branch,semester,email)values('"+name+"','"+branch+"','"+sem+"','"+email+"')");
          
                out.println("updated successfully");
            connection.close();
        }}
                catch(Exception ex)
                {
                    out.println(ex);
                }
        
      out.write("\n");
      out.write("  \n");
      out.write("\n");
      out.write("</body>\n");
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
