<jsp:useBean id="customer" class="com.smartcart.domain.Customer" />
<jsp:setProperty property="*" name="customer" />
<%
	request.setAttribute("cust", customer);
%>
<jsp:forward page="customer/add" />