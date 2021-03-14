<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.sql.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>新闻页</title>
<link rel="stylesheet" href="css/init.css">
<link rel="stylesheet" href="css/public.css">
<link rel="stylesheet" href="css/blogp.css">
</head>
<body>
	<div class="header w">
		<div class="logo">
			<img src="images/logo.jpg" alt="" />
		</div>
		<div class="login">
			<ul>
				<li>				
					<% String flag=(String)session.getAttribute("flag");%>						
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
				<li><a href="#">首页</a></li>
				<li><a href="#">博客</a></li>
				<li><a href="#">论坛</a></li>
				<li><a href="#">棋事</a></li>
				<li><a href="#">线上围棋</a></li>
				<li><a href="#">帮助</a></li>
				<li><a href="#">充值</a></li>
			</ul>
		</div>
	</div>
	<div class="n w">
		<%
			String id = new String(request.getParameter("id"));	//其他两个页面传来的
			Connection con;
			Statement sql;
			ResultSet rs;
			Class.forName("com.mysql.jdbc.Driver");
			try {
			String uri = "jdbc:mysql://localhost:3306/weiqiluntan";
			String user = "root";
			String password = "0";
			con = DriverManager.getConnection(uri, user, password);
			sql = con.createStatement();
			String condition = "SELECT * FROM blog WHERE Blog_id ="+id; /* +id */
			rs = sql.executeQuery(condition);
			//rs.next();
			if (rs.next()) {
		%>
		<h1 class="w" style="margin-left: 95px;"> <% out.println(rs.getString("Blog_name"));
		out.print(rs.getString("Blog_text")); %> </h1>
		<h2 class="w" style="margin-left: 95px;">
			<span class="one" style="margin-left: 295px;">作者：<% out.print(rs.getString("Bloger_name")); %></span>
			<span>发布时间：<% out.print(rs.getString("Blog_date")); %></span>
		</h2>
		<%
			}
				con.close();
				} catch (SQLException e) {
					out.print(e);
				}
		%>
	</div>
	<div class="footer w">
		<p>围棋论坛小组 版权所有</p>
	</div>
</body>
</html>