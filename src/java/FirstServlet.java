

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FirstServlet extends HttpServlet {

  
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
     
        String username = request.getParameter("uname");
        String password = request.getParameter("pass");
        //Create cookie for each item you want to save include the key and value
        Cookie userck = new Cookie("uname",username);
        Cookie passck = new Cookie("pass",password);
        //add those cookie into the response
        response.addCookie(userck);
        response.addCookie(passck);
        //print to make the cookie stick to the response
        PrintWriter pw = response.getWriter();
        pw.println();
        //forward the request and response from first servlet to second servlet without changing the URL
        RequestDispatcher rd = request.getRequestDispatcher("/SecondServlet");
        rd.forward(request,response);
        
       
    }
}
