<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div class="container">
		<h1>revise department</h1>
		<form:form action="update" method="post" modelAttribute="emp">
			<div class="form-group">
				<lable> empno </lable>
				<form:input path="empno" disabled="true" value="${emp.empno }" />
			</div>
			<div class="form-group">
				<lable> ename </lable>
				<form:input path="ename" value="${emp.ename }" />
			</div>
			<div class="form-group">
				<lable> job </lable>
				<form:input path="job" value="${emp.job }" />
			</div>
			<div class="form-group">
				<lable> mgr </lable>
				<form:input path="mgr" value="${emp.mgr }" />
			</div>
			<div class="form-group">
				<lable> hiredate </lable>
				<form:input path="hiredate" value="${emp.hiredate }" />
			</div>
			<div class="form-group">
				<lable> sal </lable>
				<form:input path="sal" value="${emp.sal }" />
			</div>
			<div class="form-group">
				<lable> deptno </lable>
				<form:input path="deptno" disabled="true" value="${emp.deptno }" />
			</div>
			<form:button>add</form:button>

		</form:form>
	</div>
	<script src="https://code.jquery.com/jquery-3.4.1.slim.min.js"
		integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n"
		crossorigin="anonymous"></script>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.15.0/umd/popper.min.js"
		integrity="sha384-L2pyEeut/H3mtgCBaUNw7KWzp5n9+4pDQiExs933/5QfaTh8YStYFFkOzSoXjlTb"
		crossorigin="anonymous"></script>
	<script
		src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"
		integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"
		crossorigin="anonymous"></script>
</body>
</html>