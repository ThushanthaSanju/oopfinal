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


@WebServlet("/PackageInfo")
public class PackageInfo extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		PrintWriter out = response.getWriter();
		response.setContentType("text/html");

		String PackageName = request.getParameter("packagename");

		boolean isTrue;
		isTrue = AdminDBUtil.packageValidate(PackageName);

		if (isTrue == true) {
			List<Package> PackDetai = AdminDBUtil.getPackageDetails(PackageName);
			request.setAttribute("PackDetai", PackDetai);

			RequestDispatcher dispatcher = request.getRequestDispatcher("PackageAccount.jsp");
			dispatcher.forward(request, response);

		}else {
			out.println("<script type='text/javascript'>");
			out.println("alert('No package available in this name');");
			out.println("location='package.jsp'");
			out.println("</script>");
		}
	}
}


