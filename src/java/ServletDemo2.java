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


@WebServlet("/ServletDemo2")
public class ServletDemo2 extends HttpServlet {
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
        out.println("<html>\n" +
"  <head>\n" +
"    <title>Required Qualifications</title>\n" +
"    <link href=\"https://fonts.googleapis.com/css?family=Roboto:300,400,500,700\" rel=\"stylesheet\">\n" +
"    <link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.4.1/css/all.css\" integrity=\"sha384-5sAR7xN1Nv6T6+dT2mhtzEpVJvfS3NScPQTrOxhwjIuvcA67KV2R5Jz6kr4abQsz\" crossorigin=\"anonymous\">\n" +
"    <style>\n" +
"      html, body {\n" +
"      display: flex;\n" +
"      justify-content: center;\n" +
"      height: 100%;\n" +
"      }\n" +
"      body, div, h1, form, input, p { \n" +
"      padding: 0;\n" +
"      margin: 0;\n" +
"      outline: none;\n" +
"      font-family: Roboto, Arial, sans-serif;\n" +
"      font-size: 16px;\n" +
"      color: #666;\n" +
"      }\n" +
"      h1 {\n" +
"      padding: 10px 0;\n" +
"      font-size: 32px;\n" +
"      font-weight: 300;\n" +
"      text-align: center;\n" +
"      }\n" +
"      p {\n" +
"      font-size: 12px;\n" +
"      }\n" +
"      hr {\n" +
"      color: #a9a9a9;\n" +
"      opacity: 0.3;\n" +
"      }\n" +
"      .main-block {\n" +
"      max-width: 340px; \n" +
"      min-height: 250px; \n" +
"      padding: 10px 0;\n" +
"      margin: auto;\n" +
"      border-radius: 5px; \n" +
"      border: solid 1px #ccc;\n" +
"      box-shadow: 1px 2px 5px rgba(0,0,0,.31); \n" +
"      background: #ebebeb; \n" +
"      }\n" +
"      form {\n" +
"      margin: 0 30px;\n" +
"      }\n" +
"      \n" +
"      input[type=radio] {\n" +
"      display: none;\n" +
"      }\n" +
"      label#icon {\n" +
"      margin: 0;\n" +
"      border-radius: 5px 0 0 5px;\n" +
"      }\n" +
"      input[type=text], input[type=password] {\n" +
"      width: calc(100% - 57px);\n" +
"      height: 36px;\n" +
"      margin: 13px 0 0 -5px;\n" +
"      padding-left: 10px; \n" +
"      border-radius: 0 5px 5px 0;\n" +
"      border: solid 1px #cbc9c9; \n" +
"      box-shadow: 1px 2px 5px rgba(0,0,0,.09); \n" +
"      background: #fff; \n" +
"      }\n" +
"     \n" +
"      #icon {\n" +
"      display: inline-block;\n" +
"      padding: 9.3px 15px;\n" +
"      box-shadow: 1px 2px 5px rgba(0,0,0,.09); \n" +
"      background: #1c87c9;\n" +
"      color: #fff;\n" +
"      text-align: center;\n" +
"      }\n" +
"      .btn-block {\n" +
"      margin-top: 10px;\n" +
"      text-align: center;\n" +
"      }\n" +
"      button {\n" +
"      width: 100%;\n" +
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
"      }\n" +
"    </style>\n" +
"  </head>\n" +
"  <body>\n" +
"    <div class=\"main-block\">\n" +
"      <h1>Qualification</h1>\n" +
"      <form action=\"ServletDemo3\">\n" +
"        <hr>\n" +
"        <label id=\"icon\" for=\"name\"><i class=\"fas fa-user-graduate\"></i></label>\n" +
"        <input type=\"text\" name=\"qualification\" id=\"name\" placeholder=\"Qualification\" />\n" +
                "<input type=\"hidden\" name='mail' value="+mail+"/>"+
                "<input type='hidden' name='uname' value="+uname+"/>"
                + "<input type='hidden' name='pass' value="+pass+"/>"
                + "<input type='hidden' name='fname' value="+fname+"/>"
                + "<input type='hidden' name='lname' value="+lname+"/>"
                + "<input type='hidden' name='num' value="+num+"/>"+
"        \n" +
"        <hr>\n" +
"        <div class=\"btn-block\">\n" +
"          <button type=\"submit\">Submit</button>\n" +
"        </div>\n" +
"      </form>\n" +
"    </div>\n" +
"  </body>\n" +
"</html>");
      
    }
}
