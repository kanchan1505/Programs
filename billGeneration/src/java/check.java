

import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.ResultSet;
import java.sql.*;
import java.util.*;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class check extends HttpServlet {

   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
         
      String i=request.getParameter("ino");
      String q=request.getParameter("pqty");
      HttpSession ses;
        try {
            PrintWriter out = response.getWriter();
            Class.forName("com.mysql.jdbc.Driver");
           Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/kanchan","root","");
            if(con!=null)
                {
                    out.print("connected");
                }
                else
                {
                    out.print("Not connected");
                }
        PreparedStatement pst=con.prepareStatement("select * from item where no=?;");
       pst.setString(1, i);
       ResultSet rs=pst.executeQuery();
        if(rs.next())
                { ses=request.getSession();
                    String qu=rs.getString(2);
                   
                    
                    if(Integer.valueOf(qu)>=Integer.valueOf(q))
                    {
                       
                        ses.setAttribute("ino", Integer.valueOf(i));
                        ses.setAttribute("pqty", Integer.valueOf(q));
                        response.sendRedirect("bill");
                        
                    }
                    else
                    {
                        out.print("Unavailable Quantity");
                        RequestDispatcher rd = request.getRequestDispatcher("index.html");
                        rd.include(request,response);
                    }
                }
                else
                {
                    out.print("Item specified is invalid");
                    
                    RequestDispatcher rd = request.getRequestDispatcher("index.html");
                    rd.include(request,response);
                }
              
              }
             
            
       
        
     catch(Exception e)
        {
     System.out.println(e.getMessage());       
        }
   
    }

    
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    
  
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
