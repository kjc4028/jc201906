<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<html>
<head>
	<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!   svcinsert
</h1>
<div>
	
	<form:form action="/svc/insert" method="post" commandName="svcVo">
		<form:input path="svcNm"  type="text"/>
		<form:input path="svcCts"  type="text"/>
		<button>서비스등록</button>
	</form:form>
</div>
</body>
</html>
