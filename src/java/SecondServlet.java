/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author A2A Town
 */
public class SecondServlet extends HttpServlet {

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //get a print writer to print
        PrintWriter pw = response.getWriter();
        //get cookies from request result in array of cookies
        Cookie[] ck = request.getCookies();
        //assign each ck to ck1
        for(Cookie ck1:ck)
        {
            //print cookie.name : cookie.value
            pw.println(ck1.getName()+" : "+ck1.getValue());
        }
        
       
    }

}
