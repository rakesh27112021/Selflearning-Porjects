<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Learners Academy</title>
<style><%@include file="/WEB-INF/lib/css/style.css"%></style>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
</head>
<body>

<div class="header">
  <a href="#default" class="logo ">Learners Academy</a>
  <div class="header-right">
    <a id="listclasses" class="active" href="<%=request.getContextPath()%>/dashboard">Home</a>
    <a id="listclasses" href="<%=request.getContextPath()%>/listclasses" >Classes</a>
	<a id="liststudents" href="<%=request.getContextPath()%>/liststudents" >Students</a>
	<a id="listteachers" href="<%=request.getContextPath()%>/listteachers" >Teachers</a>
	<a id="listsubjects" href="<%=request.getContextPath()%>/listsubjects" >Subjects</a>
	<a id="listsubjects" href="<%=request.getContextPath()%>/logout" ><i class="fa fa-sign-out" aria-hidden="true" ></i></a>
  </div>
</div>

</body>
</html>