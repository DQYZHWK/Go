<%@ page contentType="text/html;charset=gb2312" %>
<%@ page import="java.sql.*" %>
<html><body bgcolor = white >
<head>
<title>Χ����̳��̨����ϵͳ</title>	
<link rel="stylesheet" href="css/zengjiaqishi.css" />

</head>
<body>	
	<div class="left">	
		<div class="bigTitle">Χ����̳��̨����ϵͳ</div>
		<div class="lines">
			<div onclick="pageClick(this)" ><a href = "qishiguanli.jsp">����</a>
			</div>
			<div onclick="pageClick(this)"><a href = "#">����������Ϣ</a></div>										
		</div>	
	</div>
	<div class="top">			
	<div class="leftTiyle" id="flTitle">
	</div>	
	<div class="thisLogin"><a href = "tuichu.jsp">�˳���¼</a>
	</div>		
	<div class="thisUser">��ã�����Ա
	</div>	
	<div class="content">
		<form action="insertqishiServlet?dataBase=weiqiluntan&tableName=news" name="register" method="post">
				<br><input name="id" type="text" placeholder="������������" class="code" >
                <br><input name="title" type="text" placeholder="���������" class="code" >
                <br><input name="author" type="text" placeholder="����������" class="code">
                <br><input name="origin" type="text" placeholder="���������" class="code">
                <br><input name="content" type="text" placeholder="�������ı�" class="code">                              
                <br><input type="submit" value="���" class="now-register">
         </form>
	</div>		
	</div>	
					
	<div style="text-align:center;"></div>
		
	</body>

</html>