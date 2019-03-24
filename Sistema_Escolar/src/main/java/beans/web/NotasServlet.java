package beans.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.*;
import javax.servlet.http.*;

@WebServlet("/notas")
public class NotasServlet extends HttpServlet
{
    public void controlAccess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        
    }
    
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        this.controlAccess(request, response);
    }
    
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        this.controlAccess(request, response);
    }
}
