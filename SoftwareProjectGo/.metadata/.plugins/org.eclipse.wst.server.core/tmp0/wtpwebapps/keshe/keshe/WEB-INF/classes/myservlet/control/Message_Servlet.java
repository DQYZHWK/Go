package myservlet;
import mybean.Message_Bean;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class Message_Servlet extends HttpServlet{
   public void init(ServletConfig config) throws ServletException{
      super.init(config);
   }
   public void doPost(HttpServletRequest request,HttpServletResponse response)
               throws ServletException,IOException{
	  Message_Bean digitBean=null;
      HttpSession session=request.getSession(true);
      try{  digitBean=(Message_Bean)session.getAttribute("digitBean");
            if(digitBean==null){
                digitBean=new Message_Bean(); //����Javabean����
                 //��digitBean�洢��session������: 
                session.setAttribute("digitBean",digitBean);
            }
      }
      catch(Exception exp){
            digitBean=new Message_Bean();  //����Javabean����
            session.setAttribute("digitBean",digitBean);//digitBean�洢��session��
      } 
      String str1=request.getParameter("username");
      String str2=request.getParameter("text");
      if(str1==null||str2==null)
         return;
      if(str1.length()==0||str2.length()==0)
         return;
      
      digitBean.setUsername(str1);     //�����ݴ洢��digitBean�� 
      digitBean.setText(str2);
      response.sendRedirect("Check_jsp.jsp");  //�ض���
   } 
   public  void  doGet(HttpServletRequest request,HttpServletResponse response) 
                        throws ServletException,IOException{
       doPost(request,response);
   }
}
