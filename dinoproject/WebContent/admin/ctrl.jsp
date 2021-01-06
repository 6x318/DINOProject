<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import ="vo.*" %>
<%@ page import ="java.util.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%
 //admin 로그인할때 session 저장해서 그 값으로 접근검사

 ArrayList<AdminInfo> adminList = (ArrayList<AdminInfo>)request.getAttribute("adminList");
if (adminList == null ){
	out.println("<scrtip>");
	out.println("alert('잘못된 접근입니다.')");
	out.println("lcation.href='admin_login.jsp';");
	out.println("</scrtip>");
}

%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>관리자 항목</title>
<style>
</style>
</head>
<body>
<header></header>
<main>
<table width="1000px">
	<tr>
		<th width="20%"></th><th width="40%"></th><th width="30%"></th><th width="10%"></th>
	</tr>
	<% for (int i = 0 ; i < adminList.size() ; i++ ) {%>
	<tr id="admin<%=i%>" onclick="openPop();">
		<td><a><%=adminList.get(i).getAl_id() %></a></td>
		<td><%=adminList.get(i).getAl_date() %></td>
		<td><%=adminList.get(i).getAl_status() %></td>
		<td><%=adminList.get(i).getAl_grade() %></td>
	</tr>
	<%} %>
</table>
</main>
<script>
function openPop(){
	var w = (screen.width -300) /2;
	var h = (screen.height -200)/2;
	var win = window.open("admin_view.ctrl", "" , "width=600, height=600, left=" + w + " ," + "top =" +h);
}

</script>
</body>
</html>