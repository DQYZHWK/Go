<%@ page contentType="text/html;charset=gb2312" %>
<%@ page import="mybean.data.Liuyanban" %>
<jsp:useBean id="liuyan" class="mybean.data.Liuyanban" scope="session" />
<HTML><body bgcolor=cyan>
 <form action="liuyanban" method="post" name="form">
   �������֣�<input  type="text" name="peopleName">
   <br>�������⣺<input  type="text"  name="title">
   <br>���ݣ�<br> <textArea name="messages" rows="10" cols=36 
                   wrap="physical"></textArea>
   <br><input type="submit" value="����" name="submit">
 </form>
 <a href="Message_wall.jsp">�鿴���԰�</a>
 
 <br>
 <%
	try 
	{
		int sum = (int)application.getAttribute("sum");
			for (int i = 1;i <= sum;++i)
			{
				String temp = "";
				temp+=i;
				Liuyanban message_wall = (Liuyanban)application.getAttribute(temp);
				out.println("��"+i+"��<br>");
				out.println("�ǳƣ�"+message_wall.getname()+"<br>");
				out.println("�������⣺"+message_wall.getTitle()+"<br>");
				out.println("�������ݣ�"+message_wall.getMessage()+"<br>");
				out.print("--------------<br>");
			}
	}
	catch (Exception e)
	{
		out.println("���԰���û������!");
	}
%>
 
</body></HTML>
