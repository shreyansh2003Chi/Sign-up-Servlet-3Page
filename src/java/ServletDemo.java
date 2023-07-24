/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author SHREYANSH
 */
import jakarta.servlet.http.*;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import java.io.*;
//import java.sql.*;
//@WebServlet(urlPattern={"/ServletDemo"})
@WebServlet("/ServletDemo")
public class ServletDemo extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException
    {
//        response.setContentType("text/html");
        PrintWriter out=response.getWriter();
        String email=request.getParameter("mail");
        String username=request.getParameter("uname");
        String pass=request.getParameter("pass");
        out.println("<!--<html>\n" +
"    <head>\n" +
"        <meta charset=\"UTF-8\">\n" +
"        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
"    </head>\n" +
"    <body>\n" +
"        <form action=\"ServletDemo\" method=\"GET\">\n" +
"            <input type=\"text\" name=\"txt\" placeholder=\"name\"/> name \n" +
"            <button name=\"btn\" type=\"submit\">GO</button>\n" +
"        </form></body>\n" +
"</html>-->\n" +
"<html>\n" +
"  <head>\n" +
"    <title>Simple registration form</title>\n" +
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
"      min-height: 460px; \n" +
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
"      .account-type, .gender {\n" +
"      margin: 15px 0;\n" +
"      }\n" +
"      input[type=radio] {\n" +
"      display: none;\n" +
"      }\n" +
"      label#icon {\n" +
"      margin: 0;\n" +
"      border-radius: 5px 0 0 5px;\n" +
"      }\n" +
"      label.radio {\n" +
"      position: relative;\n" +
"      display: inline-block;\n" +
"      padding-top: 4px;\n" +
"      margin-right: 20px;\n" +
"      text-indent: 30px;\n" +
"      overflow: visible;\n" +
"      cursor: pointer;\n" +
"      }\n" +
"      label.radio:before {\n" +
"      content: \"\";\n" +
"      position: absolute;\n" +
"      top: 2px;\n" +
"      left: 0;\n" +
"      width: 20px;\n" +
"      height: 20px;\n" +
"      border-radius: 50%;\n" +
"      background: #1c87c9;\n" +
"      }\n" +
"      label.radio:after {\n" +
"      content: \"\";\n" +
"      position: absolute;\n" +
"      width: 9px;\n" +
"      height: 4px;\n" +
"      top: 8px;\n" +
"      left: 4px;\n" +
"      border: 3px solid #fff;\n" +
"      border-top: none;\n" +
"      border-right: none;\n" +
"      transform: rotate(-45deg);\n" +
"      opacity: 0;\n" +
"      }\n" +
"      input[type=radio]:checked + label:after {\n" +
"      opacity: 1;\n" +
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
"      input[type=password] {\n" +
"      margin-bottom: 15px;\n" +
"      }\n" +
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
"      <h1>Personal Details</h1>\n" +
"      <form action=\"ServletDemo2\">\n" +
"        \n" +
"        <hr>\n" +
"        <label id=\"icon\" for=\"name\"><i class=\"fas fa-user\"></i></label>\n" +
"        <input type=\"text\" name=\"fname\" id=\"name\" placeholder=\"First Name\" required/>\n" +
"        <label id=\"icon\" for=\"name\"><i class=\"fas fa-user\"></i></label>\n" +
"        <input type=\"text\" name=\"lname\" id=\"name\" placeholder=\"Last name\" required/>\n" +
"        <label id=\"icon\" for=\"name\"><i class=\"fas fa-mobile\"></i></label>\n" +
"        <input type='text'name='num' id=\"name\" placeholder=\"Mobile Number\" />\n" +
                "<input type='hidden' name='mail' value='  "+email +" '>"+
                        "<input type='hidden' name='uname' value='"+ username +" '>"+
                "<input type='hidden' name='pass' value='" + pass + "'>"+
"        <hr>\n" +
"        \n" +
"        <hr>\n" +
"        <div class=\"btn-block\">\n" +
"          <button type=\"submit\" href=\"ServletDemo2\">Submit</button>\n" +
"        </div>\n" +
"      </form>\n" +
"    </div>\n" +
"  </body>\n" +
"</html>");
//       
    }
}
