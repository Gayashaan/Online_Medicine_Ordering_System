package projectpackage1;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class empInsert
 */
@WebServlet("/empInsert")
public class empInsert extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public empInsert() {
        super();
        
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
//		String id = request.getParameter("em_id");
		String fname = request.getParameter("first_name");
		String lname = request.getParameter("last_name");
		String dob = request.getParameter("DOB");
		String phone = request.getParameter("mobile_no");
		String gender = request.getParameter("gender");
		String email = request.getParameter("email");
		String pwd = request.getParameter("password");
		String add = request.getParameter("address");
		String job = request.getParameter("title");
		String join = request.getParameter("join_date");
		String insure = request.getParameter("insure");
		String zone = request.getParameter("zone");
		
		boolean isTrue;
		
		isTrue = EmpDBUtil.insertEmp(fname, lname, dob, phone, gender, email, pwd, add, job, join, insure, zone);
		
		if(isTrue == true) {
			
//			List<Employee> empDetails = EmpDBUtil.getEmpDetails(id); 
//			request.setAttribute("empDetail_attr", empDetails);
			
			RequestDispatcher dis = request.getRequestDispatcher("Employee.jsp");
			dis.forward(request, response);
		}else {
			RequestDispatcher dis2 = request.getRequestDispatcher("unsuccess.jsp");
			dis2.forward(request, response);
		}
	}

}
