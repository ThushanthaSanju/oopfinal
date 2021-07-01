package IT20281564;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/UpdatePackServlet")
public class UpdatePackServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String ID = request.getParameter("PackageID");
		String NAME = request.getParameter("PackageName");
		String PRICE = request.getParameter("PackagePrice");
		String PEAK = request.getParameter("PackagePeak");
		String OFFPEAK = request.getParameter("PackageOffPeak");
		
		boolean isTrue;
		
		isTrue = AdminDBUtil.UpdatePackage(ID, NAME, PRICE, PEAK, OFFPEAK);
		
		if (isTrue == true) {
			
			List<Package> PackDetai = AdminDBUtil.getUpdatedPackageDetails(ID);
			request.setAttribute("PackDetai", PackDetai);
			
			RequestDispatcher dis = request.getRequestDispatcher("PackageAccount.jsp");
			dis.forward(request, response);
			
		}else {
			RequestDispatcher dis = request.getRequestDispatcher("UpdatePackage.jsp");
			dis.forward(request, response);
		}
	}

}
