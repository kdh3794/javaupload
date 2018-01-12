<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
 <form method="post" action="/el/el02sub" >
 <label for="userid"> 아이디 : </label>
 <input type="text" name="id" id="userid"><br>
 <label for="userpwd"> 암 &nbsp; 호 : </label>
 <input type ="password" name="pwd" id="userpwd"><br>

 <label for="usernumber"> 주민 번호 : </label>  
 <input type="text" name="num" id="usernember"> -  <input type="text" name="num2" id="usernember"><br>
  <input type="submit" value="로그인">
 </form>
</body>
</html>
