<jsp:useBean id="address" class="com.smartcart.domain.Address" />
<jsp:setProperty property="*" name="adress" />
<%
	request.setAttribute("add", address);
%>
<jsp:forward page="Address/add" />