<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!   svcList
</h1>
<div>
	
	<c:forEach items="${svcList}" var="list" >
		<div>
			<c:out value="${list.svcNm}" escapeXml="false"/>
		</div>
	</c:forEach>
</div>
</body>
</html>
