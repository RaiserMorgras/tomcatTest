import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

public class PostParametersServlet extends GenericServlet {
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        try (PrintWriter pw = servletResponse.getWriter()) {
            Enumeration<String> enumeration = servletRequest.getParameterNames();
            while (enumeration.hasMoreElements()) {
                String pname = enumeration.nextElement();
                pw.println(pname + " = " + servletRequest.getParameter(pname));
            }
        }
    }
}
