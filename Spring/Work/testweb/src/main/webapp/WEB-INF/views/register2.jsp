<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Personal Page</title>
<link href="../../resources/assets/css/styles.css" rel="stylesheet" type="text/css" />
<meta charset="utf-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1, user-scalable=no" />
        <!--[if lte IE 8]><script src="assets/js/ie/html5shiv.js"></script><![endif]-->
        <link rel="stylesheet" href="../../resources/assets/css/main.css" />
        <!--[if lte IE 9]><link rel="stylesheet" href="assets/css/ie9.css" /><![endif]-->
        <!--[if lte IE 8]><link rel="stylesheet" href="assets/css/ie8.css" /><![endif]-->

<link href="../../resources/assets/css/styles.css" rel="stylesheet" type="text/css" />
</head>

<body>

<div id="container">

<!-- HEADER -->

<div id="header">

<div id="logo"><a href="home" title="Personal Page" >첫 화면</a></div>


</div>

<!-- CONTENT -->

<div id="content">

<div id="leftPan">

<div id="post">
    <form action="home" method="get">

        <h2>회원 가입</h2>
        <table border="1" width="500px">
            <tr>
                <th colspan="2">기본 정보 입력</th>
            </tr>
            <tr>
                <td>이름</td>
                <td id=""><input type="text" name="name" size="10"></td>
            </tr>
            <tr>
                <td>주민번호</td>
                <td><input type="number" name="pri1" min="000000" max ="999999" >
                    -
                    <input type="number" name="pri2" min="1000000" max="2999999" >
                </td>
            </tr>
            <tr>
                <td>아이디</td>
                <td>
                    <input type="text" name="email" size="10">
                    @naver.com
                    <input type="button" name="중복" value="중복체크">
                    <br>
                    영문으로 시작하는 4~10자리의 영문, 숫자 조합만 가능합니다.
                </td>
            </tr>
            <tr>
                <td>별명</td>
                <td><input type="text" name="nickname" size="6"></td>
            </tr>
            <tr>
                <td>비밀번호</td>
                <td>
                    <input type="password" name="password" size="16">
                    <br>
                    <input type="password" name="repassword" size="16">
                    확인을 위해 한번 더 입력해 주세요
                </td>
            </tr>
            <tr>
                <td>비밀번호 힌트</td>
                <td>
                    <select>
                        <option value="reborn">다시 태어나면 되고 싶은 것은?</option>
                        <option value="school">내가 다녔던 초등학교 이름은?</option>
                    </select>
                    <br>
                    <input type="text" name="hint" placeholder="답을 입력하세요">
                </td>
            </tr>
            <tr>
                <td>생년월일</td>
                <td>
                    <input type="number" name="birthy" min="0000" max="2999" >
                    <select>
                        <option value="1m">1</option>
                        <option value="2m">2</option>
                        <option value="3m">3</option>
                        <option value="4m">4</option>
                        <option value="5m">5</option>
                        <option value="6m">6</option>
                        <option value="7m">7</option>
                        <option value="8m">8</option>
                        <option value="9m">9</option>
                        <option value="10m">10</option>
                        <option value="11m">11</option>
                        <option value="12m">12</option>
                    </select>
                    <select >
                        <option value="1">1</option>
                        <option value="2">2</option>
                        <option value="3">3</option>
                    </select>
                    <input type="radio" name="bir">양
                    <input type="radio" name="bir">음
                </td>
            </tr>
            <tr>
                <td>핸드폰</td>
                <td>
                    <select>
                        <option value="010">010</option>
                        <option value="011">011</option>
                        <option value="019">019</option>
                    </select>
                    <input type="number" name="phon1" min="0000" max="9999">
                    -
                    <input type="number" name="phon2" min="0000" max="9999">
                    <input type="radio" name="tel"> SKT
                    <input type="radio" name="tel"> KTF
                    <input type="radio" name="tel"> LGT
                </td>
            </tr>
            <tr>
                <td>주로쓰는 메일</td>
                <td>
                    <input type="text" name="mail" size="20">
                    <input type="checkbox" name="navermail">
                    네이버 메일 사용
                </td>
            </tr>
            <tr>
                <td>거주지</td>
                <td>
                    <select>
                        <option value="서울">서울</option>
                        <option value="경기">경기</option>
                        <option value="강원">강원</option>
                        <option value="부산">부산</option>
                    </select>
                </td>
            </tr>
            <tr>
                <td>메일 수신 여부</td>
                <td>
                    <input type="checkbox" name="navernews"> 네이버 뉴스레터 <br>
                    <input type="checkbox" name="productmail"> 상품정보 메일 <br>
                    <input type="checkbox" name="cashmail"> 캐쉬정보 메일 <br>
                    <input type="checkbox" name="gamemail"> 게임정보 메일 <br>
                    <input type="checkbox" name="sms"> sms 정보 수신
                </td>
            </tr>
        </table>
        <input id="submit" type="submit" name="submit" value="확인">
    </form>
</div>


</div>

<div id="rightPan">

<div id="links">

<ul>
</ul>
</div>




<div class="clear"></div>

</div>

<div id="footer">
<p><a href="#">HOME</a> | <a href="#">ABOUT</a> | <a href="#">ALBUMS</a> | <a href="#">CONCERTS</a> | <a href="#">NEWS &amp; EVENTS</a> | <a href="#">CONTACTS</a><br/>
Copyright &copy; Your Company Name</p>
</div>
</div>

</body>
</html>
