package EchoServlet;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.*;

/**
 *
 * @author mthoming
 */
public class EchoServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet EchoServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet EchoServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
   @Override
   public void doGet(HttpServletRequest request, HttpServletResponse response)
               throws IOException, ServletException {
      // Set the response message's MIME type
      response.setContentType("text/html; charset=UTF-8");
      // Allocate a output writer to write the response message into the network socket
      PrintWriter out = response.getWriter();
 
      // Write the response message, in an HTML page
      try {
         out.println("<!DOCTYPE html>");
         out.println("<html><head>");
         out.println("<meta http-equiv='Content-Type' content='text/html; charset=UTF-8'>");
         out.println("<title>Echo Servlet</title></head>");
         out.println("<body><h2>You have entered: </h2>");
 
         // Retrieve the value of the query parameter "VIN_Number" (from text field)
         String vin_number = request.getParameter("vin_number");
         // Get null if the parameter is missing from query string.
         // Get empty string or string of white spaces if user did not fill in
         if (vin_number == null
               || (vin_number = htmlFilter(vin_number.trim())).length() == 0) {
            out.println("<p>VIN: MISSING</p>");
         } else {
            out.println("<p>VIN: " + vin_number + "</p>");
         }
 
         // Retrieve the value of the query parameter "Year" (from radio button)
         String year = request.getParameter("year");
         // Get null if the parameter is missing from query string.
         if (year == null) {
            out.println("<p>Model Year: MISSING</p>");
         } else if (year.equals("2019")) {
            out.println("<p>Model Year: 2019</p>");   
         } else if (year.equals("2018")) {
            out.println("<p>Model Year: 2018</p>");
         } else if (year.equals("2017")) {
            out.println("<p>Model Year: 2017</p>");   
         } else if (year.equals("2016")) {
            out.println("<p>Model Year: 2016</p>");
         } else if (year.equals("2015")) {
            out.println("<p>Model Year: 2015</p>");   
         } else if (year.equals("2014")) {
            out.println("<p>Model Year: 2014</p>");
         } else if (year.equals("2013")) {
            out.println("<p>Model Year: 2013</p>");   
         } else if (year.equals("2012")) {
            out.println("<p>Model Year: 2012</p>");
         } else if (year.equals("2011")) {
            out.println("<p>Model Year: 2011</p>");   
         } else if (year.equals("2010")) {
            out.println("<p>Model Year: 2010</p>");
         } else if (year.equals("2009")) {
            out.println("<p>Model Year: 2009</p>");
         } else if (year.equals("2008")) {
            out.println("<p>Model Year: 2008</p>");   
         } else if (year.equals("2007")) {
            out.println("<p>Model Year: 2007</p>");
         } else if (year.equals("2006")) {
            out.println("<p>Model Year: 2006</p>");   
         } else if (year.equals("2005")) {
            out.println("<p>Model Year: 2005</p>");
         } else if (year.equals("2004")) {
            out.println("<p>Model Year: 2004</p>");   
         } else if (year.equals("2003")) {
            out.println("<p>Model Year: 2003</p>");
         }         
            else {
            out.println("<p>Model Model Year: 2002</p>");
         }

         // Retrieve the value of the query parameter "Make" (from text field)
         String make = request.getParameter("make");
         // Get null if the parameter is missing from query string.
         // Get empty string or string of white spaces if user did not fill in
         if (make == null
               || (make = htmlFilter(make.trim())).length() == 0) {
            out.println("<p>Make: MISSING</p>");
         } else {
            out.println("<p>Make: " + make + "</p>");
         }

         // Retrieve the value of the query parameter "Model" (from text field)
         String model = request.getParameter("model");
         // Get null if the parameter is missing from query string.
         // Get empty string or string of white spaces if user did not fill in
         if (model == null
               || (model = htmlFilter(model.trim())).length() == 0) {
            out.println("<p>Model: MISSING</p>");
         } else {
            out.println("<p>Model: " + model + "</p>");
         }         
         
         // Retrieve the value of the query parameter "bodystyle" (from radio button)
         String bodystyle = request.getParameter("bodystyle");
         // Get null if the parameter is missing from query string.
         if (bodystyle == null) {
            out.println("<p>Body Style: MISSING</p>");
         } else if (bodystyle.equals("c")) {
            out.println("<p>Body Style: Coupe</p>");
         } else if (bodystyle.equals("s")) {
            out.println("<p>Body Style: Sedan</p>");
         } else if (bodystyle.equals("t")) {
            out.println("<p>Body Style: Truck</p>");
         } else if (bodystyle.equals("u")) {
            out.println("<p>Body Style: SUV</p>");
         } else if (bodystyle.equals("v")) {
            out.println("<p>Body Style: Van</p>");
         } else if (bodystyle.equals("m")) {
            out.println("<p>Body Style: Mini-Van</p>");
         } else {
            out.println("<p>Body Style: Compact</p>");
         }

         // Retrieve the value of the query parameter "language" (from checkboxes).
         // Multiple entries possible.
         // Use getParameterValues() which returns an array of String.
         String[] conditions = request.getParameterValues("condition");
         // Get null if the parameter is missing from query string.
         if (conditions == null || conditions.length == 0) {
            out.println("<p>Conditions: NONE</p>");
         } else {
            out.println("<p>Conditions: ");
            for (String condition : conditions) {
               if (condition.equals("good")) {
                  out.println("Good, ");
               } else if (condition.equals("fair")) {
                  out.println("Fair, ");
               } else if (condition.equals("poor")) {
                  out.println("Poor");
               }
            }
            out.println("</p>");
         }
 
         // Retrieve the value of the query parameter "instruction" (from text area)
         String instruction = request.getParameter("instruction");
         // Get null if the parameter is missing from query string.
         if (instruction == null
              || (instruction = htmlFilter(instruction.trim())).length() == 0
              || instruction.equals("Enter your instruction here...")) {
            out.println("<p>Instruction: NONE</p>");
         } else {
            out.println("<p>Instruction: " + instruction + "</p>");
         }
 
         // Get all the names of request parameters
         Enumeration names = request.getParameterNames();
         out.println("<p>Request Parameter Names are: ");
         if (names.hasMoreElements()) {
            out.print(htmlFilter(names.nextElement().toString()));
         }
         do {
            out.print(", " + htmlFilter(names.nextElement().toString()));
         } while (names.hasMoreElements());
         out.println(".</p>");
 
         // Hyperlink "BACK" to input page
         out.println("<a href='form_input.html'>BACK</a>");
 
         out.println("</body></html>");
      } finally {
         out.close();  // Always close the output writer
      }
   }
 
   // Redirect POST request to GET request.
   @Override
   public void doPost(HttpServletRequest request, HttpServletResponse response)
               throws IOException, ServletException {
      doGet(request, response);
   }
 
   // Filter the string for special HTML characters to prevent
   // command injection attack
   private static String htmlFilter(String message) {
      if (message == null) return null;
      int len = message.length();
      StringBuffer result = new StringBuffer(len + 20);
      char aChar;
 
      for (int i = 0; i < len; ++i) {
         aChar = message.charAt(i);
         switch (aChar) {
             case '<': result.append("&lt;"); break;
             case '>': result.append("&gt;"); break;
             case '&': result.append("&amp;"); break;
             case '"': result.append("&quot;"); break;
             default: result.append(aChar);
         }
      }
      return (result.toString());
   }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
