/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.53
 * Generated at: 2020-06-10 15:11:46 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.keshe;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

 String flag=null;  
  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("java.sql");
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
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

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
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

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


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
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>围棋论坛</title>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/init.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/public.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/index.css\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\t<div class=\"header w\">\r\n");
      out.write("\t\t<div class=\"logo\">\r\n");
      out.write("\t\t\t<img src=\"images/logo.jpg\" alt=\"\" />\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"login\">\r\n");
      out.write("\t\t\t<ul>\r\n");
      out.write("\t\t\t\t<li>\t\t\t\t\r\n");
      out.write("\t\t\t\t\t");
 flag=(String)session.getAttribute("flag");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("  \t\t\t\t\t");
 if (flag =="0" || flag==null){
      out.write("\r\n");
      out.write("\t\t\t\t\t    <a href=\"login.jsp\">登录</a>\r\n");
      out.write("\t\t\t\t\t\t<a href=\"register.jsp\">注册</a>\r\n");
      out.write("\t\t\t\t\t\t<br><a href=\"guanliyuandenglu.jsp\">管理员登录</a>\t\r\n");
      out.write("\t\t\t\t\t\t");
} 
      out.write("\r\n");
      out.write("\t\t\t\t\t");
 if (flag =="1" ){
      out.write("\r\n");
      out.write("  \t\t\t\t\t");
  String username=(String)session.getAttribute("username");
      out.write("\r\n");
      out.write("\t\t\t\t\t您好，");
      out.print(username );
      out.write("\r\n");
      out.write("\t\t\t\t\t<br><a href=\"tuichu.jsp\">退出</a>\t\t\t\t\r\n");
      out.write("\t\t\t\t\t");
}
      out.write("\t\r\n");
      out.write("\t\t\t\t</li>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<!-- 导航栏 -->\r\n");
      out.write("\t<div class=\"nav w\">\r\n");
      out.write("\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t<ul class=\"left\">\r\n");
      out.write("\t\t    \t<li><a href=\"index.jsp\" >首页</a></li>\r\n");
      out.write("\t\t    \t<li><a href=\"blog.jsp\" >博客</a></li>\r\n");
      out.write("\t\t    \t<li><a href=\"#\" >论坛</a></li>\r\n");
      out.write("\t\t    \t<li><a href=\"news.jsp\" >棋事</a></li>\r\n");
      out.write("\t\t    \t<li><a href=\"#\" >线上围棋</a></li>\r\n");
      out.write("\t\t    \t<li><a href=\"bangzhu.jsp\" >帮助</a></li>\r\n");
      out.write("\t\t    \t<li><a href=\"chongzhi.jsp\" >充值</a></li>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("  \t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<!-- 第一大板块 -->\r\n");
      out.write("\t<div class=\"news  w\">\r\n");
      out.write("\t\t<div class=\"newsimg\">\r\n");
      out.write("\t\t\t<img src=\"images/qi.jpg\" alt=\"\" />\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"newscont\">\r\n");
      out.write("\t\t\t<div class=\"conthead\">\r\n");
      out.write("\t\t\t\t<h2>棋事快报</h2>\r\n");
      out.write("\t\t\t\t<a href=\"news.jsp\">更多>></a>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"cont\">\r\n");
      out.write("\t\t\t\t<ul>\t\t\t\r\n");
      out.write("\t\t\t\t\t");
  Connection con;
				    	Statement sql; 
				    	ResultSet rs; 
				    	Class.forName("com.mysql.jdbc.Driver");
				    	try {
				    		String uri= "jdbc:mysql://localhost:3306/weiqiluntan";
				            String user="root";
				            String password="0";
				            con=DriverManager.getConnection(uri,user,password);
				            sql=con.createStatement();
				            rs=sql.executeQuery("SELECT * FROM news order by release_time desc");
				            rs.next();
				            for (int i = 0; i < 8; ++i)
				            {
				         
      out.write("\r\n");
      out.write("\t\t\t\t         <form action= \"newspage.jsp\"  method=post>\r\n");
      out.write("\t\t\t\t         <li><a href=\"newspage.jsp?id=");
      out.print( rs.getString(1) );
      out.write("\" target=\"_blank\">\r\n");
      out.write("\t\t\t\t         ");
  	out.print(rs.getString(2));	
      out.write("\r\n");
      out.write("\t\t\t\t         </a></li>\r\n");
      out.write("\t\t\t\t         </form>\r\n");
      out.write("\t\t\t\t         ");
		rs.next();
				            }
				            con.close();
				    	}
				    	catch(SQLException e){ 
				            out.print(e);
				      }
					
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<!-- 第2大板块 -->\r\n");
      out.write("\t<div class=\"hotpoint w\">\r\n");
      out.write("\t\t<div class=\"pointhead\">\r\n");
      out.write("\t\t\t<h2>论坛热点</h2>\r\n");
      out.write("\t\t\t<a href=\"\">更多>></a>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"points\">\r\n");
      out.write("\t\t\t<ul>\r\n");
      out.write("\t\t\t\t<li><h3><a href=\"\">·棋书棋具推荐</a></h3>\r\n");
      out.write("\t\t\t\t<p>欢迎各位棋友在此讨论关于围棋书籍、棋具的话题，包括书籍、棋具交易等</p>\r\n");
      out.write("\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t<li><h3><a href=\"\">·棋书棋具推荐</a></h3>\r\n");
      out.write("\t\t\t\t<p>欢迎各位棋友在此讨论关于围棋书籍、棋具的话题，包括书籍、棋具交易等</p>\r\n");
      out.write("\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t<li><h3><a href=\"\">·棋书棋具推荐</a></h3>\r\n");
      out.write("\t\t\t\t<p>欢迎各位棋友在此讨论关于围棋书籍、棋具的话题，包括书籍、棋具交易等</p>\r\n");
      out.write("\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t<li><h3><a href=\"\">·棋书棋具推荐</a></h3>\r\n");
      out.write("\t\t\t\t<p>欢迎各位棋友在此讨论关于围棋书籍、棋具的话题，包括书籍、棋具交易等</p>\r\n");
      out.write("\t\t\t\t</li>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div class=\"footer w\">\r\n");
      out.write("    \t<p>围棋论坛小组 版权所有</p>\r\n");
      out.write("\t</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
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
