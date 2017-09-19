/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author user
 */
public class bill extends HttpServlet {

   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, ClassNotFoundException, SQLException {
        response.setContentType("text/html;charset=UTF-8");
        HttpSession ses=request.getSession();
        Integer i=(Integer)ses.getAttribute("ino");
        Integer q=(Integer)ses.getAttribute("pqty");
        
        try (PrintWriter out = response.getWriter()) {
            
        
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
       pst.setInt(1, i);
       ResultSet rs=pst.executeQuery();
          if(rs.next())
          {
              int p = rs.getInt(1);
              Integer total= q*p;
            out.println("<body>");
            out.println("Item no. =" + i);
            out.println("Total Payment =" + total);
            out.println("</body>");
            out.println("</html>");
        }
          else
          {
              out.println("Error");
          }
          con.close();
        }
          catch(Exception e)
          {
              System.out.println(e);
          }
    }

    
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(bill.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(bill.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

   
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(bill.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(bill.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
