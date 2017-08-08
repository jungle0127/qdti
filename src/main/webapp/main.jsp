<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<script type="text/javascript" src="js/jquery-3.2.1.min.js"></script>
<script type="text/javascript" src="js/bootstrap.min.js"></script>
<link href="css/bootstrap.min.css" rel="stylesheet">
<title>Insert title here</title>
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
		<h3>来，我们带你回家</h3>
		<img src="imgs/huijia.png" class="img-circle" alt="bus">
		<div class="input-group">
			<span class="glyphicon glyphicon-search input-group-addon">查询</span>
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