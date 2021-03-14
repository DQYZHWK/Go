package myservlet.control;
import mybean.data.My_Bean; //引入例子2中的Javabean模型
import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class insertyonghu_Servlet extends HttpServlet{
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
     try{  Class.forName("com.mysql.cj.jdbc.Driver");
     }
     catch(Exception e){} 
     request.setCharacterEncoding("gb2312");
     String dataBase = request.getParameter("dataBase");
     String tableName = request.getParameter("tableName");
     String username=request.getParameter("username");
     String password=request.getParameter("password");
     String phone=request.getParameter("phone");
     String sex=request.getParameter("sex");
     if(username==null||username.length()==0) {
        fail(request,response,"添加记录失败,必须给出记录");
        return;
     }
     Connection con;
     Statement sql; 
     ResultSet rs;
     String user = new String("root");
     String Password =new String("daichongte,123");
     try{ 
    	 String uri= "jdbc:mysql://127.0.0.1/weiqiluntan?serverTimezone=UTC&characterEncoding=utf-8"; 
    	 con=DriverManager.getConnection(uri,user,Password);
          sql=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
        		  ResultSet.CONCUR_UPDATABLE);
          rs=sql.executeQuery("SELECT * FROM "+tableName);
          rs.moveToInsertRow();      //rs的游标移动到插入行
          rs.updateString(1,username); //更新结果集
          rs.updateString(2, password); //更新结果集 
          rs.updateString(3, phone); //更新结果集 
          rs.updateString(5, sex); //更新结果集          
          rs.insertRow();     //向表插入一行记录
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
         out.println("<a href =register.jsp>输入记录</a>");
         out.println("</body></html>");
        }
        catch(IOException exp){} 
    }
}
