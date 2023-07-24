/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/ServletDemo3")
public class ServletDemo3 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out=response.getWriter();
        
         String mail=request.getParameter("mail");
        String uname=request.getParameter("uname");
        String pass=request.getParameter("pass");
        String fname=request.getParameter("fname");
        String lname=request.getParameter("lname");
        String num=request.getParameter("num");
        String quali=request.getParameter("qualification");
        
         out.println("<html><head><style>.btn-block {\n" +
"      margin-top: 10px;\n" +
"      text-align: center;\n" +
"      }\n" +
"      button {\n" +
"      width: 20%;\n" +
"      padding: 10px 0;\n" +
"      margin: 10px auto;\n" +
"      border-radius: 5px; \n" +
"      border: none;\n" +
"      background: #1c87c9; \n" +
"      font-size: 14px;\n" +
"      font-weight: 600;\n" +
"      color: #fff;\n" +
"      }\n" +
"      button:hover {\n" +
"      background: #26a9e0;\n" +
"      }</style></head><body><center><h1>Your Data<h1>");
        out.println("<h3> Email : "+mail+"</h3>");
        out.println("<h3> UserName : "+uname+"</h3>");
        out.println("<h3> Password : "+pass+"</h3>");
        out.println("<h3> First Name : "+fname+"</h3>");
        out.println("<h3> Last Name : "+lname+"</h3>");
        out.println("<h3> Mobile Number : "+num+"</h3>");
        out.println("<h3> Qualification : "+quali+"</h3><br><div class='btn-block'><button type='submit'>Go Back</button></div></center></body></html>");
        out.println();
       
        
       
        out.println();
        // try
//        {
//            Class.forName("com.mysql.cj.driver.Driver");
//            Connection c=DriverManager.getConnection("jdbc:mysql://localhost/mydata","root","");
//            Statement st=c.createStatement();
//            st.executeUpdate("create table testServletdata(name varchar(20));");
//            st.executeUpdate("insert into testservletdata values("+str+");");
//            
//            
//        }
//        catch(SQLException | ClassNotFoundException se)
//        {
//            se.printStackTrace();
//        }
        
    }
    }