/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.53
 * Generated at: 2020-06-09 11:19:16 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.keshe;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class bangzhu_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
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
      response.setContentType("text/html;charset=gb2312");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"gb2312\">\r\n");
      out.write("<title>帮助界面</title>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/bangzhu.css\">\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("<div id=\"header\">\r\n");
      out.write("  <div class=\"container\">\r\n");
      out.write("\t<ul class=\"left\">\r\n");
      out.write("    \t<li><a href=\"#\" >首页</a></li>\r\n");
      out.write("    \t<li><a href=\"#\" >博客</a></li>\r\n");
      out.write("    \t<li><a href=\"#\" >论坛</a></li>\r\n");
      out.write("    \t<li><a href=\"#\" >棋事</a></li>\r\n");
      out.write("    \t<li><a href=\"xianshangweiqi.jsp\" >线上围棋</a></li>\r\n");
      out.write("    \t<li><a href=\"bangzhu.jsp\" >帮助</a></li>\r\n");
      out.write("    \t<li><a href=\"#\" >充值</a></li>\r\n");
      out.write("\t</ul>\r\n");
      out.write("  </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div id=\"border\">\r\n");
      out.write("\t<div id=\"main\">\r\n");
      out.write("\t    <div class=\"main-content1\">\r\n");
      out.write("\t\t   <p>围棋论坛使用说明</p>\r\n");
      out.write("\t    </div>\r\n");
      out.write("\t    <div class=\"main-content1\">\r\n");
      out.write("\t       <a>一：围棋论坛使用说明</a>\r\n");
      out.write("\t       <br><a>围棋平台是一个为小朋友和围棋初学者打造的围棋学习平台,里面有围棋学习、围棋对弈、围棋入门练习,寓学于乐,可以让少儿轻松快乐学围棋。\r\n");
      out.write("\t       \t\t大家可以看下。最近看到很多朋友在教孩子使用这个“围棋平台”学围棋,我在这里简单帮助一下大家:</a>\r\n");
      out.write("\t       <br><a>1:在首页，我们可以找到棋事模块和论坛热点小模块，用户们可以通过这两个地方的更多超链接进入我们的论坛和棋事大模块。</a>\r\n");
      out.write("\t       <br><a>2:在博客页面，我们可以发表博客文章，与他人进行讨论</a>\r\n");
      out.write("\t       <br><a>3:在论坛页面，用户们可以发帖和回帖，可以在一个问题上进行深刻的讨论，这也是我们围棋论坛的核心</a>\r\n");
      out.write("\t       <br><a>4:在棋事页面，用户们可以找到许许多多关于围棋的最新舆情，我们可以通过这个页面走进围棋，了解围棋</a>\r\n");
      out.write("\t       <br><a>5:在线上围棋页面，用户们可以通过这个页面进入线上围棋页面和线上学习平台页面</a>\r\n");
      out.write("\t       <br><a>6:在充值页面，用户们可以对自己的余额进行充值</a>\r\n");
      out.write("\t       <br><a>7:在首页的右上角，有登陆和注册两个按钮，用户们可以通过注册来成为我们网站的正式用户，并且登陆我们的网站</a>\r\n");
      out.write("\t       <br><a>8:我们的网站秉持着公平公正的信念，也正在朝着更加完善的网站发展，期望可以给用户们一个功能更加完善的围棋平台</a>\r\n");
      out.write("\t    </div>\r\n");
      out.write("\t    \r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
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
