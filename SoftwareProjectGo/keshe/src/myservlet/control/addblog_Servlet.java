package myservlet.control;
import mybean.data.My_Bean; //引入例子2中的Javabean模型
import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class addblog_Servlet extends HttpServlet{
   public void init(ServletConfig config) throws ServletException{
      super.init(config);
   }
   public void doPost(HttpServletRequest request,HttpServletResponse response)
               throws ServletException,IOException{
     try{  Class.forName("com.mysql.jdbc.Driver");
     }
     catch(Exception e){}
     request.setCharacterEncoding("UTF-8");
     String blog_title = request.getParameter("blog_title");
     String blog_text = request.getParameter("blog_text");
     
     HttpSession session=request.getSession(true);
     String username=(String)session.getAttribute("username");  
     if(username==null) {
         fail(request,response,"请先登录");
         return;
      }  
     if(blog_title==null||blog_text.length()==0) {
        fail(request,response,"博客发布失败,博客内容不能为空");
        return;
     }
     Connection con;
     Statement sql; 
     ResultSet rs;
     String user = new String("root");
     String Password =new String("0");
     try{ 
    	 String uri= "jdbc:mysql://127.0.0.1/weiqiluntan"; 
    	 con=DriverManager.getConnection(uri,user,Password);
         sql=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
        		  ResultSet.CONCUR_UPDATABLE);
         rs=sql.executeQuery("SELECT * FROM blog order by Blog_date ");
         rs.beforeFirst();
         int i=0;
         while(rs.next()){
        	 i++; 
         }
         i=i+1;
         String tmp=""+i;
         sql.executeUpdate("INSERT INTO blog VALUES('"+tmp+"','"+blog_title+"','"+blog_text+"',now(),'"+username+"',0,0)");
         sql.executeUpdate("UPDATE chess_user SET user_jifen = user_jifen+1 WHERE user_name = '"+username+"'");

		 RequestDispatcher dispatcher=
	     request.getRequestDispatcher("fabochenggong.jsp");
	     dispatcher.forward(request,response);  //转发
         
         /*
         rs=sql.executeQuery("SELECT * FROM "+tableName);
         ResultSetMetaData metaData = rs.getMetaData();
         int columnCount = metaData.getColumnCount(); //得到结果集的列数
         String []columnName = new String[columnCount];
         for(int i=0;i<columnName.length;i++) {
        	 columnName[i] = metaData.getColumnName(i+1); //得到列名
         }
         resultBean.setColumnName(columnName);   //更新Javabean数据模型
         rs.last();
         int rowNumber=rs.getRow();  //得到记录数
         String [][] tableRecord=resultBean.getTableRecord();
         tableRecord = new String[rowNumber][columnCount];
         rs.beforeFirst();
         int i=0;
         while(rs.next()){
        	 for(int k=0;k<columnCount;k++) 
        		 tableRecord[i][k] = rs.getString(k+1);
        	 i++; 
         }
         resultBean.setTableRecord(tableRecord); //更新Javabean数据模型
         con.close();
         RequestDispatcher dispatcher=
         request.getRequestDispatcher("zhucechenggong.jsp");
         dispatcher.forward(request,response);  //转发
         */
     }
     catch(SQLException e){
          System.out.println("发博失败,请检查是否登录");
          fail(request,response,e.toString());
     }  
   }
   public  void  doGet(HttpServletRequest request,HttpServletResponse response)
           throws ServletException,IOException{
       doPost(request,response);
   }
   
   public void fail(HttpServletRequest request,HttpServletResponse response,
                      String backNews) {
        response.setContentType("text/html;charset=GB2312");
        try {
         PrintWriter out=response.getWriter();
         out.println("<html><body>");
         out.println("<h2>"+backNews+"</h2>") ;
         out.println("<a href =blog_post.jsp>返回</a>");
         out.println("</body></html>");
        }
        catch(IOException exp){} 
    }
    
}
