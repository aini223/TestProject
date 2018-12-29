<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<script src="https://code.jquery.com/jquery-3.1.1.min.js"></script>
<body>
	<a href="#">click here</a>
	<c:if test="${not empty User}">
		<span>${User.userName  }</span>
	</c:if>
	<form id="form1">
		<table>
			<tr>
				<td>user</td>
				<td><input type="text" id="name" name="name"></td>
			</tr>
			<tr>
				<td>pwd</td>
				<td><input type="password" id="psw" name="psw"></td>
			</tr>
			<tr>
				<td><input type=button value="submit" id="login"></td>
			</tr>
		</table>
		<span id="sp"></span>
	</form>
	
	<input type="button" id="btn" value="按钮">
</body>
<script>
	$("#login").click(function() {
		$.ajax({
			url : "/login",
			data : $('#form1').serialize(),
			type : "get",
			datatype : "json",
	        async: false,
	        cache: false,
	        contentType: false,
	        processData: false,
			success : function(data) {
				if(data != "success"){
					$("#sp").html(data);
				}
				else{
					window.location.reload();
				}
			}
		})
	})
	
	$("#btn").click(function(){
		var v =$("#btn").val();
		if(v == "按钮"){
			$("#btn").val("anniu");
		}else{
			$("#btn").val("按钮");
		}
	})
</script>
</html>