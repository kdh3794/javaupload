<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Personal Page</title>
<meta charset="utf-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1, user-scalable=no" />
       
        <link rel="stylesheet" href="../../resources/assets/css/main.css" />
      

<link href="../../resources/css/styles.css" rel="stylesheet" type="text/css" />
</head>

<body>


<div id="rightPan">

<div id="links">

<ul>
    <h1>Login</h1>
  <form id="loginForm" action="login" method="post" enctype="application/x-www-form-urlencoded">
                <p style="margin: 0; padding: 0;">
                    <input type="hidden" name="url" value="${url }" />
                </p>
                <table>
                    <tr>
                        <td style="width: 200px;">아이디</td>
                        <td style="width: 390px"><input type="text" name="userid" style="width: 99%;" /></td>
                    </tr>
                    <tr>
                        <td>비밀번호(Password)</td>
                        <td><input type="password" name="passwd" style="width: 99%;" /></td>
                    </tr>
                </table>
                <div style="text-align: center;padding: 15px 0;">
                    <input type="submit" value="확인" />
                    <input type="button" value="회원 가입" onclick="location.href='./register'" />
                </div>
            </form>
    <!-- <p>Forgot your password? <a href="">Click here to reset it.</a></p> -->
   

</ul>
</div>


<!-- <div id="archive"><p><a href="#">news archive</a></p></div>
</div>

<div class="clear">

</div>

</div>

<div id="footer">
<p><a href="home">HOME</a> | <a href="#">ABOUT</a> | <a href="#">ALBUMS</a> | <a href="#">CONCERTS</a> | <a href="#">NEWS &amp; EVENTS</a> | <a href="#">CONTACTS</a><br/>
Copyright &copy; Your Company Name</p>
</div>
</div> -->
<!-- Footer -->
                    <footer id="footer">
                        <div class="inner">
                            <ul class="icons">
                                <li><a href="#" class="icon alt fa-twitter"><span class="label">Twitter</span></a></li>
                                <li><a href="#" class="icon alt fa-facebook"><span class="label">Facebook</span></a></li>
                                <li><a href="#" class="icon alt fa-instagram"><span class="label">Instagram</span></a></li>
                                <li><a href="#" class="icon alt fa-github"><span class="label">GitHub</span></a></li>
                                <li><a href="#" class="icon alt fa-linkedin"><span class="label">LinkedIn</span></a></li>
                            </ul>
                            <ul class="copyright">
                                <li>&copy; Untitled</li><li>Design: <a href="https://html5up.net">HTML5 UP</a></li>
                            </ul>
                        </div>
                    </footer>

</body>
</html>
