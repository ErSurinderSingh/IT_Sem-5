
import MyBean.HelloWorldBean;
import java.io.*;
import javax.ejb.EJB;
import javax.servlet.*;
import javax.servlet.http.*;

public class HelloServlet extends HttpServlet {

    @EJB
    HelloWorldBean mybean;

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
//        processRequest(req, res); 
        PrintWriter out = res.getWriter();
        try {
            String name = req.getParameter("name");
            
            mybean.setName(name);
            out.println(mybean.sayHello());
            
            
            out.println("Hello " + mybean.getUName());
        } catch (Exception e) {
            //out.println(e.toString());
        }

    }
}
