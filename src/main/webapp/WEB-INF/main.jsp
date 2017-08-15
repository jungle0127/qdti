<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<fmt:setBundle basename="i18n/facade/main"/>
<fmt:setLocale value="zh_CN"/>   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/css/bootstrap.min.css" integrity="sha384-/Y6pD6FV/Vv2HJnA6t+vslU6fwYXjCFtcEpHbNJ0lyAFsXTsjBbfaDjzALeQsN6M" crossorigin="anonymous">
	<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.11.0/umd/popper.min.js" integrity="sha384-b/U6ypiBEHpOf/4+1nzFpr53nxSS+GLCkfwBdFNTxtclqqenISfwAzpKaMNFNmj4" crossorigin="anonymous"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/js/bootstrap.min.js" integrity="sha384-h0AbiXch4ZDo7tp9hKZ4TsHbi047NrKGLO3SEJAg45jXxnGIfYzk4Si90RDIqNm1" crossorigin="anonymous"></script>
	<title><fmt:message key="main.page.title"/> </title>
	<style>
		.bg-1 {
			background-color: #1abc9c; /* Green */
			color: #ffffff;
		}
		  .bg-2 {
		      background-color: #474e5d; /* Dark Blue */
		      color: #ffffff;
		  }
		  .bg-3 {
		      background-color: #ffffff; /* White */
		      color: #555555;
		  }
		.container-fluid {
			padding-top: 70px;
			padding-bottom: 70px;
		}
	</style>
</head>
<body>
	<div class="container-fluid bg-1 text-center">
		<h3><fmt:message key="main.propoganda"/></h3>
		<img src="imgs/huijia.png" class="img-circle" alt="bus">
		<div class="input-group">
			<span class="glyphicon glyphicon-search input-group-addon"><fmt:message key="man.search"/></span>
			<input type="text" class="form-control text-lg" placeholder="请输入目的城市">
		</div>
	</div>
	<div class="container-fluid bg-3 text-center">
		<h3>联系我们</h3>
		<p>Lorem ipsum..</p>
	</div>
	<div class="container-fluid bg-2 text-center">
		<h3>我们是谁</h3>
		<p>Lorem ipsum..</p>
	</div>

</body>
</html>