package IT20281564;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/InsertCustomer")
public class InsertCustomer extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String Name = request.getParameter("Name");
		String Address = request.getParameter("Address");
		String Phone = request.getParameter("Phone");
		String Email = request.getParameter("Email");

		boolean isSucess;
		isSucess = AdminDBUtil.InsertCustomer(Name, Address, Phone, Email);

		if (isSucess == true) {

			RequestDispatcher dis = request.getRequestDispatcher("LoginAdmin.jsp");
			dis.forward(request, response);

		}else {
			RequestDispatcher dis2 =request.getRequestDispatcher("InsertCustomer.jsp");
			dis2.forward(request, response);
		}
	}

}
