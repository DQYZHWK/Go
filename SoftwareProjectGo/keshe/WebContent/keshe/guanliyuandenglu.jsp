<%@ page contentType="text/html;charset=gb2312" %>
<html>
<head>
<meta charset="gb2312">
<title>�ǽ���</title>
<link rel="stylesheet" href="css/init.css">
<link rel="stylesheet" href="css/public.css">
<link rel="stylesheet" href="css/login.css">
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
<div class="border w">
	<div class="main w">
	  <div class="main-content1">
		<p>��¼Χ���˺ſ����ܸ������</p>
	  </div>
	<div class="inp">
			<form action="gdengluServlet?dataBase=warehouse&tableName=guanliyuan" name="register" method="post">
                <div class="main-content2">
                    <input name="username" type="text" placeholder="�������ֻ�����/����/�û���" value="" class="text" >
                </div>
                <div class="main-content3">
                    <input name="password" type="password" placeholder="�������˺�����" value="" class="text" >
                </div>
                <div class="main-content4 ">
                    <a href="#" class="safes">�һ�����</a>
                    <span class="safe">|</span>
                    <a href="#" class="safes">�˺�����</a>
                </div>
            <input type="submit" value="��½" class="main-content5">
            </form>
      </div>
      
     </div>
</div>
<div class="footer w">
    <p>Χ����̳С�� ��Ȩ����</p>
</div>
</body>
</html>