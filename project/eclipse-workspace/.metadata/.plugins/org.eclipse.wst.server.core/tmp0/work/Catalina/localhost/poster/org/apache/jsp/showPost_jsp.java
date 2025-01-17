/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/10.1.24
 * Generated at: 2024-06-01 14:37:50 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.jsp.*;
import jakarta.servlet.http.*;
import jakarta.servlet.*;
import java.io.*;
import java.sql.*;

public final class showPost_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports,
                 org.apache.jasper.runtime.JspSourceDirectives {

  private static final jakarta.servlet.jsp.JspFactory _jspxFactory =
          jakarta.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.LinkedHashSet<>(5);
    _jspx_imports_packages.add("java.sql");
    _jspx_imports_packages.add("jakarta.servlet");
    _jspx_imports_packages.add("java.io");
    _jspx_imports_packages.add("jakarta.servlet.http");
    _jspx_imports_packages.add("jakarta.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile jakarta.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public boolean getErrorOnELNotFound() {
    return false;
  }

  public jakarta.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final jakarta.servlet.http.HttpServletRequest request, final jakarta.servlet.http.HttpServletResponse response)
      throws java.io.IOException, jakarta.servlet.ServletException {

    if (!jakarta.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final jakarta.servlet.jsp.PageContext pageContext;
    jakarta.servlet.http.HttpSession session = null;
    final jakarta.servlet.ServletContext application;
    final jakarta.servlet.ServletConfig config;
    jakarta.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    jakarta.servlet.jsp.JspWriter _jspx_out = null;
    jakarta.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <title>Show Posts</title>\r\n");
      out.write("    <script src=\"https://cdn.tailwindcss.com\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("    ");

        HttpSession ses = request.getSession(false);
        if (ses == null || ses.getAttribute("email") == null) {
            response.sendRedirect("login.jsp");
            return;
        }
    
      out.write("\r\n");
      out.write("    <div class=\"min-h-full\">\r\n");
      out.write("      <nav class=\"bg-gray-800\">\r\n");
      out.write("            <div class=\"mx-auto max-w-7xl px-4 sm:px-6 lg:px-8\">\r\n");
      out.write("                <div class=\"flex h-16 items-center justify-between\">\r\n");
      out.write("                    <div class=\"flex items-center\">\r\n");
      out.write("                        <div class=\"flex-shrink-0\">\r\n");
      out.write("                            <img class=\"h-8 w-8\" src=\"https://tailwindui.com/img/logos/mark.svg?color=indigo&shade=500\" alt=\"Your Company\">\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"hidden md:block\">\r\n");
      out.write("                            <div class=\"ml-10 flex items-baseline space-x-4\">\r\n");
      out.write("                            	<a href=\"index.jsp\" class=\"bg-gray-900 text-white rounded-md px-3 py-2 text-sm font-medium\" aria-current=\"page\">Home</a>\r\n");
      out.write("                                <a href=\"simpleDashboard.jsp\" class=\"bg-gray-900 text-white rounded-md px-3 py-2 text-sm font-medium\" aria-current=\"page\">Dashboard</a>\r\n");
      out.write("                                <a href=\"showPost.jsp\" class=\"text-gray-300 hover:bg-gray-700 hover:text-white rounded-md px-3 py-2 text-sm font-medium\">Posts</a>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"hidden md:block\">\r\n");
      out.write("                        <a href=\"Logout\" class=\"text-gray-300 hover:bg-gray-700 hover:text-white rounded-md px-3 py-2 text-sm font-medium\">Logout</a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </nav>\r\n");
      out.write("        \r\n");
      out.write("        <header class=\"bg-white shadow\">\r\n");
      out.write("            <div class=\"mx-auto max-w-7xl px-4 py-6 sm:px-6 lg:px-8\">\r\n");
      out.write("                <h1 class=\"text-3xl font-bold tracking-tight text-gray-900\">Posts</h1>\r\n");
      out.write("                <a href=\"createPost.jsp\" class=\"mt-2 inline-flex items-center px-4 py-2 border border-transparent text-sm font-medium rounded-md shadow-sm text-white bg-indigo-600 hover:bg-indigo-700 focus:outline-none focus:ring-2 focus:ring-offset-2 focus:ring-indigo-500\">Create New Post</a>\r\n");
      out.write("                \r\n");
      out.write("                <!-- Search Form -->\r\n");
      out.write("                <form action=\"searchPost.jsp\" method=\"GET\" class=\"mt-2\">\r\n");
      out.write("                    <div class=\"flex items-center\">\r\n");
      out.write("                        <input type=\"text\" name=\"title\" class=\"px-3 py-2 border rounded-md shadow-sm focus:ring-indigo-500 focus:border-indigo-500 sm:text-sm\" placeholder=\"Search by title\">\r\n");
      out.write("                        <button type=\"submit\" class=\"ml-2 inline-flex items-center px-4 py-2 border border-transparent text-sm font-medium rounded-md shadow-sm text-white bg-indigo-600 hover:bg-indigo-700 focus:outline-none focus:ring-2 focus:ring-offset-2 focus:ring-indigo-500\">Search</button>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </form>\r\n");
      out.write("            </div>\r\n");
      out.write("        </header>\r\n");
      out.write("        \r\n");
      out.write("        <main>\r\n");
      out.write("            <div class=\"mx-auto max-w-7xl py-6 sm:px-6 lg:px-8\">\r\n");
      out.write("                <!-- Fetch and display posts -->\r\n");
      out.write("                ");

                    Connection con = null;
                    Statement st = null;
                    ResultSet rs = null;
                    String email = (String) ses.getAttribute("email");
                    String role = (String) ses.getAttribute("role");
                    try {
                        Class.forName("com.mysql.jdbc.Driver");
                        String url = "jdbc:mysql://127.0.0.1/poster";
                        con = DriverManager.getConnection(url, "root", "");
                        st = con.createStatement();
                        String query = "SELECT post.id, post.title, post.description, user.email FROM post INNER JOIN user ON post.user_id = user.id";
                        rs = st.executeQuery(query);
                        
                        while (rs.next()) {
                            int postId = rs.getInt("id");
                            String title = rs.getString("title");
                            String description = rs.getString("description");
                            String authorEmail = rs.getString("email");
                
      out.write("\r\n");
      out.write("                            <div class=\"bg-white shadow overflow-hidden sm:rounded-lg my-6\">\r\n");
      out.write("                                <div class=\"px-4 py-5 sm:px-6\">\r\n");
      out.write("                                    <h3 class=\"text-lg leading-6 font-medium text-gray-900\">");
      out.print( title );
      out.write("</h3>\r\n");
      out.write("                                    <p class=\"mt-1 max-w-2xl text-sm text-gray-500\">by ");
      out.print( authorEmail );
      out.write("</p>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"border-t border-gray-200\">\r\n");
      out.write("                                    <dl>\r\n");
      out.write("                                        <div class=\"bg-gray-50 px-4 py-5 sm:px-6\">\r\n");
      out.write("                                            <dt class=\"text-sm font-medium text-gray-500\">Description</dt>\r\n");
      out.write("                                            <dd class=\"mt-1 text-sm text-gray-900\">");
      out.print( description );
      out.write("</dd>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <div class=\"bg-white px-4 py-5 sm:px-6 flex justify-between\">\r\n");
      out.write("                                            <div></div>\r\n");
      out.write("                                            <div class=\"flex space-x-4\">\r\n");
      out.write("                                                ");
 if (email.equals(authorEmail) || "admin".equals(role)) { 
      out.write("\r\n");
      out.write("                                                    <a href=\"editPost.jsp?id=");
      out.print( postId );
      out.write("\" class=\"text-indigo-600 hover:text-indigo-900\">Edit</a>\r\n");
      out.write("                                                    <a href=\"DeletePost?id=");
      out.print( postId );
      out.write("\" class=\"text-red-600 hover:text-red-900\">Delete</a>\r\n");
      out.write("                                                ");
 } 
      out.write("\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </dl>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                ");

                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    } finally {
                        if (rs != null) try { rs.close(); } catch (SQLException ignore) {}
                        if (st != null) try { st.close(); } catch (SQLException ignore) {}
                        if (con != null) try { con.close(); } catch (SQLException ignore) {}
                    }
                
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("        </main>\r\n");
      out.write("    </div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof jakarta.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
