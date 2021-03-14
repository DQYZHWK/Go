package myservlet.control;
import mybean.data.My_Bean; //引入例子2中的Javabean模型
import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.Calendar;
public class insertqishi_Servlet extends HttpServlet{
   public void init(ServletConfig config) throws ServletException{
      super.init(config);
   }
   public void doPost(HttpServletRequest request,HttpServletResponse response)
               throws ServletException,IOException{
	   My_Bean resultBean=null;
      try{  resultBean=(My_Bean)request.getAttribute("resultBean");
            if(resultBean==null){
                resultBean=new My_Bean(); //创建Javabean对象
                request.setAttribute("resultBean",resultBean);
            }
      }
      catch(Exception exp){
            resultBean=new My_Bean();  //创建Javabean对象
            request.setAttribute("resultBean",resultBean);
      } 
     try{  Class.forName("com.mysql.jdbc.Driver");
     }
     catch(Exception e){} 
     request.setCharacterEncoding("gb2312");
     String dataBase = request.getParameter("dataBase");
     String tableName = request.getParameter("tableName");
     String id=request.getParameter("id");
     String title=request.getParameter("title");
     String author=request.getParameter("author");
     String origin=request.getParameter("origin");
     //String time=request.getParameter("time");
     String content=request.getParameter("content");
     /*if(username==null||username.length()==0) {
        fail(request,response,"添加记录失败,必须给出记录");
        return;
     }*/
     Connection con;
     Statement sql; 
     ResultSet rs;
     String user = new String("root");
     String Password =new String("0");
     //Date currentTime = new Date();
     //String time = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(currentTime);
     try{ 
    	 String uri= "jdbc:mysql://127.0.0.1/weiqiluntan"; 
    	 con=DriverManager.getConnection(uri,user,Password);
          sql=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
        		  ResultSet.CONCUR_UPDATABLE);
          rs=sql.executeQuery("SELECT * FROM "+tableName);          
          try{
          sql.executeUpdate("INSERT INTO news values('"+id+"','"+title+"','"+author+"','"+origin+"',now(),'"+content+"')");
          }
          catch(SQLException e){
        	  RequestDispatcher dispatcher=
        	          request.getRequestDispatcher("qishiguanli.jsp");
        	          dispatcher.forward(request,response);  //转发
          }
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
          request.getRequestDispatcher("qishiguanli.jsp");
          dispatcher.forward(request,response);  //转发
     }
     catch(SQLException e){
          System.out.println(e);
          fail(request,response,"添加记录失败:"+e.toString());
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
         out.println("返回");
         out.println("<a href =qishiguanli.jsp>输入记录</a>");
         out.println("</body></html>");
        }
        catch(IOException exp){} 
    }
}
