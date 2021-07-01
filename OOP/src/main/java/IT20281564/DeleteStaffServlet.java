package IT20281564;

import java.io.IOException;
import java.io.PrintWriter;

//import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/DeleteStaffServlet")
public class DeleteStaffServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		String StaffID = request.getParameter("StaffID");
		
		boolean isTrue;
		
		isTrue = AdminDBUtil.DeleteStaff(StaffID);
		
		if (isTrue == true) {
//			RequestDispatcher dis = request.getRequestDispatcher("AdminAccount.jsp");
//			dis.forward(request, response);
			
			out.println("<script type='text/javascript'>");
			out.println("alert('Delete Successful Please Reloggin');");
			out.println("location='LoginAdmin.jsp'");
			out.println("</script>");
			
		}else {
			out.println("<script type='text/javascript'>");
			out.println("alert('Delete Unsuccessful');");
			out.println("location='DeleteStaff.jsp'");
			out.println("</script>");
		}
	}

}
