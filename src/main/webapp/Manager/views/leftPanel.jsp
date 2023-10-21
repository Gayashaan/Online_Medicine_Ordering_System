<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<div class="left_panel">
	<div class="logo">
		<img src="../main/images/favpng_ferry-ship-boat-tour.png" alt="logo">
	</div>

	<ul>
		<li><a href="managerDashboard.jsp"><i class="material-icons"
				style="font-size: 25px; color: white">dashboard</i>DashBoard</a></li>
		<li><a href="ManageMedicine.jsp"><i class="fa fa-safari"
				style="font-size: 25px; color: white"></i>Manage Medicines</a></li>

		<li>
			<form action="ManagerOrderServlet" method="post"
				style="display: inline;">
				<input type="hidden" name="username"
					value="<%=session.getAttribute("username")%>">
				<button type="submit"
					style="background: none; border: none; color: white; font-size: 15px; cursor: pointer;">
					<i class="fa fa-user" style="font-size: 25px;"></i> Manage Orders
				</button>
			</form>
		</li>


		<li><a href="manageEnquiry.php"><i class="material-icons"
				style="font-size: 25px; color: white">question_answer</i>Manage
				Enquiries</a></li>
		<li id="logout"><a href="logout"><i class="fa fa-sign-out"
				style="font-size: 25px; color: white"></i>Log Out</a></li>
	</ul>
</div>
