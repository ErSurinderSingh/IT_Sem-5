
import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import MyBean.Addition;
import javax.ejb.EJB;

public class ArithOpServlet extends HttpServlet {

    @EJB
    Addition add;
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        PrintWriter out = response.getWriter();
        
        int i = Integer.parseInt(request.getParameter("t1"));
        int j = Integer.parseInt(request.getParameter("t2"));
        
        add.setI(i);
        add.setJ(j);
        
        add.add();
        out.println("Addition: " + add.getK());
        
        add.subtract();
        out.println("Difference: " + add.getK());
        
        add.multiply();
        out.println("Product: " + add.getK());
        
        add.divide();
        out.println("Quotient: " + add.getK());
        
        add.modulus();
        out.println("Remainder: " + add.getK());
    }

}