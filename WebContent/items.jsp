<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Items</title>
</head>
<body>
<c:forEach var="itm" items="${requestScope.items}">
<a href="${pageContext.request.contextPath}/item/ItemDtl?itemId=${itm.itemId}">${itm.itemName}</a>
<br />
</c:forEach>
</body>
</html>