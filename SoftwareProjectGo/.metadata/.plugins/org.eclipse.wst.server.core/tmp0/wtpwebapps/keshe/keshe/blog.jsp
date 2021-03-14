<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>博客页面</title>
<link rel="stylesheet" href="css/init.css">
<link rel="stylesheet" href="css/public.css">
<link rel="stylesheet" href="css/blog.css">
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
		    	<li><a href="index.jsp" >首页</a></li>
		    	<li><a href="blog.jsp" >博客</a></li>
		    	<li><a href="luntan.jsp" >论坛</a></li>
		    	<li><a href="qishi.jsp" >棋事</a></li>
		    	<li><a href="xianshangweiqi.jsp" >线上围棋</a></li>
		    	<li><a href="bangzhu.jsp" >帮助</a></li>
		    	<li><a href="chongzhi.jsp" >充值</a></li>
			</ul>
  		</div>
	</div>
	<div class="big w">
		<div class="self">
			<h4>我的</h4>
			<button onclick="window.location.href = 'blog_post.jsp' "> 我要发博</button><br>
			<button onclick="window.location.href = 'myblog.jsp' "> 我的博文</button><br>
			<div class="info">
				<p>个人积分：
				<%
				Connection con;
		    	Statement sql; 
		    	ResultSet rs; 
		    	Class.forName("com.mysql.jdbc.Driver");
		    	try
				{
					String uri= "jdbc:mysql://localhost:3306/weiqiluntan";
		            String user="root";
		            String password="0";
		            con=DriverManager.getConnection(uri,user,password);
		            sql=con.createStatement();
		            String username=(String)session.getAttribute("username");
		            rs=sql.executeQuery("SELECT user_jifen FROM chess_user WHERE user_name = '"+username+"'");
		            rs.next();
		            out.print(rs.getString("user_jifen"));
			    	con.close();
				}
				catch(SQLException e){ 
					out.print("请先登录");
				}
		        %>
		        </p>
			</div>
		</div>
		<div class="blogg">
			<h4>博文</h4>
			<div class="cont">
			<%
		    	Class.forName("com.mysql.jdbc.Driver");
		    	try
				{
					String uri= "jdbc:mysql://localhost:3306/weiqiluntan";
		            String user="root";
		            String password="0";
		            con=DriverManager.getConnection(uri,user,password);
		            sql=con.createStatement();
		            rs=sql.executeQuery("SELECT * FROM blog order by Blog_date desc");
		            while(rs.next())
		            {
		     %>
				         <li><a href="blogpage.jsp?id=<%= rs.getString("Blog_id") %>" target="_blank">
						<h2><%	out.print(rs.getString("Blog_name"));	%></h2>
						<span class="people"> <%= rs.getString("Blog_replies") %> 回复 | <%= rs.getString("Blog_agreements")%> 点赞</span>
			<%
					}
				    con.close();
				}
				catch(SQLException e){ 
					out.print(e);
				}
			%>
			</div>
		</div>
	</div>
</body>
</html>