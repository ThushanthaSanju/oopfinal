package IT20281564;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/InsertPackageServlet")
public class InsertPackageServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	  
		String PackageName = request.getParameter("Name");
		String PricePack = request.getParameter("Price");
		String PricePeak = request.getParameter("Peak");
		String PriceOffPeak = request.getParameter("OffPeak");
		
		boolean isSucess;
		isSucess = AdminDBUtil.InsertPackage(PackageName, PricePack, PricePeak, PriceOffPeak);
		
		if (isSucess == true) {
			
			RequestDispatcher dis = request.getRequestDispatcher("package.jsp");
			dis.forward(request, response);
			
		}else {
			RequestDispatcher dis2 =request.getRequestDispatcher("InsertPackage.jsp");
			dis2.forward(request, response);
		}
	}

}
