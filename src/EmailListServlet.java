import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by dch67 on 4/19/2017.
 */
@WebServlet(name = "EmailListServlet", urlPatterns = ("/test"))
public class EmailListServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String url = "/index.html";

        String anyAction = request.getParameter("action");
        if(anyAction==null){
            anyAction="join";
        }

        if(anyAction.equals("join")){
            url= "/index.html";
        }
        else if (anyAction.equals("add")){
            String firstName = request.getParameter("firstName");
            String lastName = request.getParameter("lastName");
            String email = request.getParameter("email");

            User myUser = new User(firstName, lastName, email);

            request.setAttribute("anyUser", myUser);
            url = "/thanks.jsp";
        }

        getServletContext().getRequestDispatcher(url).forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
