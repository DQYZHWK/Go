<%@ page contentType="text/html;charset=gb2312" %>
<html>
<head>
<meta charset="gb2312">
<title>ע�����</title>
<link rel="stylesheet" href="css/init.css">
<link rel="stylesheet" href="css/public.css">
<link rel="stylesheet" href="css/regi.css">
</head>
<body>
	<div class="header w">
		<div class="logo">
			<img src="images/logo.jpg" alt="" />
		</div>
		<div class="login">
			<ul>
				<li>
					<a href="login.jsp">��¼</a> |
					<a href="register.jsp">ע��</a>
				</li>
			</ul>
		</div>
	</div>
	<!-- ������ -->
	<div class="nav w">
		<div class="container">
			<ul class="left">
		    	<li><a href="index.jsp" >��ҳ</a></li>
		    	<li><a href="#" >����</a></li>
		    	<li><a href="#" >��̳</a></li>
		    	<li><a href="#" >����</a></li>
		    	<li><a href="xianshangweiqi.jsp" >����Χ��</a></li>
		    	<li><a href="bangzhu.jsp" >����</a></li>
		    	<li><a href="chongzhi.jsp" >��ֵ</a></li>
			</ul>
  		</div>
	</div>
	<div class="main w">
		<div class="border w">ע��Χ���˺�</div>
		<form action="insertServlet?dataBase=weiqiluntan&tableName=chess_user" name="register" method="post">
                <input name="username" type="text" placeholder="�������˺�" class="code">
                <input name="password" data-a="a1" type="password" placeholder="����������" class="code">
                <input name="phone" type="text" placeholder="������绰" class="code">
                <input name="sex" type="text" placeholder="�������Ա�" class="code">
                <div class="lf">
                    <input type="checkbox" checked>
                                                        ���Ķ���ͬ��<a href="">��Χ���˺�ע��Э�顷</a>
                </div>
                <input type="submit" value="����ע��" class="now-register">
         </form>
	</div>
	<div class="footer">
    	<p>Χ����̳С�� ��Ȩ����</p>
	</div>
</body>
</html>