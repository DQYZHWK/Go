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
			<div onclick="pageClick(this)"><a href = "#">ɾ��������Ϣ</a></div>										
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
		<form action="deleteqishiServlet?dataBase=weiqiluntan&tableName=news" name="register" method="post">
				<br><input name="id" type="text" placeholder="������ɾ�������" class="code" >                            
                <br><input type="submit" value="ɾ��" class="now-register">
         </form>
	</div>		
	</div>	
					
	<div style="text-align:center;"></div>
		
	</body>

</html>