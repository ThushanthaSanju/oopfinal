package IT20281564;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/AdminLoginServlet")
public class AdminLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		String Username = request.getParameter("username");
		String Password = request.getParameter("password");
		
		boolean isTrue;
		isTrue = AdminDBUtil.validate(Username, Password);
		
		if (isTrue == true) {
			List<Administrator> AdminDetai = AdminDBUtil.getAdministrator(Username);
			request.setAttribute("AdminDetai", AdminDetai);
			
			RequestDispatcher dispatcher = request.getRequestDispatcher("AdminAccount.jsp");
			dispatcher.forward(request, response);
			
		}else {
			out.println("<script type='text/javascript'>");
			out.println("alert('Credentials invalid');");
			out.println("location='LoginAdmin.jsp'");
			out.println("</script>");
		}
	}

}
