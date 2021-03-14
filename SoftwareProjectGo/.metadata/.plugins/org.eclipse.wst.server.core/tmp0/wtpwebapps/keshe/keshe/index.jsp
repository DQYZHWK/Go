<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<%-- <jsp:include page= "newspage.jsp"/> --%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>围棋论坛</title>
<link rel="stylesheet" href="css/init.css">
<link rel="stylesheet" href="css/public.css">
<link rel="stylesheet" href="css/index.css">
</head>
<body>
<%! String flag=null;  %>
	<div class="header w">
		<div class="logo">
			<img src="images/logo.jpg" alt="" />
		</div>
		<div class="login">
			<ul>
				<li>				
					<% flag=(String)session.getAttribute("flag");%>						
  					<% if (flag =="0" || flag==null){%>
					    <a href="login.jsp">登录</a>
						<a href="register.jsp">注册</a>
						<br><a href="guanliyuandenglu.jsp">管理员登录</a>	
						<%} %>
					<% if (flag =="1" ){%>
  					<%  String username=(String)session.getAttribute("username");%>
					您好，<%=username %>
					<br><a href="tuichu.jsp">退出</a>				
					<%}%>	
				</li>
			</ul>
		</div>
	</div>
	<!-- 导航栏 -->
	<div class="nav w">
		<div class="container">
			<ul class="left">
		    	<li><a href="index.jsp" >首页</a></li>
		    	<li><a href="blog.jsp" >博客</a></li>
		    	<li><a href="#" >论坛</a></li>
		    	<li><a href="news.jsp" >棋事</a></li>
		    	<li><a href="#" >线上围棋</a></li>
		    	<li><a href="bangzhu.jsp" >帮助</a></li>
		    	<li><a href="chongzhi.jsp" >充值</a></li>
			</ul>
  		</div>
	</div>
	<!-- 第一大板块 -->
	<div class="news  w">
		<div class="newsimg">
			<img src="images/qi.jpg" alt="" />
		</div>
		<div class="newscont">
			<div class="conthead">
				<h2>棋事快报</h2>
				<a href="news.jsp">更多>></a>
			</div>
			<div class="cont">
				<ul>			
					<%  Connection con;
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
				         %>
				         <form action= "newspage.jsp"  method=post>
				         <li><a href="newspage.jsp?id=<%= rs.getString(1) %>" target="_blank">
				         <%  	out.print(rs.getString(2));	%>
				         </a></li>
				         </form>
				         <%		rs.next();
				            }
				            con.close();
				    	}
				    	catch(SQLException e){ 
				            out.print(e);
				      }
					%>							
				</ul>
			</div>
		</div>
	</div>
	<!-- 第2大板块 -->
	<div class="hotpoint w">
		<div class="pointhead">
			<h2>论坛热点</h2>
			<a href="">更多>></a>
		</div>
		<div class="points">
			<ul>
				<li><h3><a href="">·棋书棋具推荐</a></h3>
				<p>欢迎各位棋友在此讨论关于围棋书籍、棋具的话题，包括书籍、棋具交易等</p>
				</li>
				<li><h3><a href="">·棋书棋具推荐</a></h3>
				<p>欢迎各位棋友在此讨论关于围棋书籍、棋具的话题，包括书籍、棋具交易等</p>
				</li>
				<li><h3><a href="">·棋书棋具推荐</a></h3>
				<p>欢迎各位棋友在此讨论关于围棋书籍、棋具的话题，包括书籍、棋具交易等</p>
				</li>
				<li><h3><a href="">·棋书棋具推荐</a></h3>
				<p>欢迎各位棋友在此讨论关于围棋书籍、棋具的话题，包括书籍、棋具交易等</p>
				</li>
			</ul>
		</div>
	</div>
	<div class="footer w">
    	<p>围棋论坛小组 版权所有</p>
	</div>
</body>
</html>