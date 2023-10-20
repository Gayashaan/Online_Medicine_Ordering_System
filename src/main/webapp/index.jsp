<%@page import="projectpackage1.*"%>
<%@page import="com.java.util.*"%>
<%@page import="com.java.model.*"%>
<%@page import="java.util.*"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%

/*	User auth = (User) request.getSession().getAttribute("auth");
	if (auth != null) {
	    request.setAttribute("person", auth);
	}*/
	
	
	String username = (String) session.getAttribute("username");
	if (username == null) {
	    response.sendRedirect("login.jsp");
	}
	
	List<Medicine> medicines = MedicineDBUtil.getMedicineDeteials();
	ArrayList<Cart> cart_list = (ArrayList<Cart>) session.getAttribute("cart-list");
	if (cart_list != null) {
		request.setAttribute("cart_list", cart_list);
	}
%>
<!DOCTYPE html>
<html>
<head>
<%@include file="/includes/head.jsp"%>
<title>E-Commerce Cart</title>
</head>
<body>
	<%@include file="/includes/navbar.jsp"%>

	<div class="container">
		<div class="card-header my-3">All Products</div>
		<div class="row">
			<%
			if (!medicines.isEmpty()) {
				for (Medicine p : medicines) {
			%>
			<div class="col-md-3 my-3">
				<div class="card w-100">
					<img class="card-img-top" src="product-image/<%=p.getId() %>"
						alt="Card image cap">
					<div class="card-body">
						<h5 class="card-title"><%=p.getMedName() %></h5>
						<h6 class="price">Price: $<%=p.getPrice() %></h6>
						<h6 class="category">Category: <%=p.getManufacturer() %></h6>
						<div class="mt-3 d-flex justify-content-between">
							<a class="btn btn-dark" href="add-to-cart?id=<%=p.getId()%>">Add to Cart</a> <a
								class="btn btn-primary" href="order-now?quantity=1&id=<%=p.getId()%>">Buy Now</a>
						</div>
					</div>
				</div>
			</div>
			<%
			}
			} else {
			out.println("There is no proucts");
			}
			%>

		</div>
	</div>

	<%@include file="/includes/footer.jsp"%>
</body>
</html>