<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>


<!DOCTYPE html>
<html lang="ko">
<html>
<head>
<meta charset="utf-8" />
<meta name="Keywords" content="게시판 새글쓰기" />
<meta name="Description" content="게시판 새글쓰기" />

<title>${boardnm }</title>

<link rel="stylesheet" href="../../resources/css/screen.css"
    type="text/css" media="screen" />
<link href="../../resources/css/bootstrap.min.css" rel="stylesheet">
<link rel="stylesheet" href="../../resources/css/animate.css">
<link rel="stylesheet" href="../../resources/css/font-awesome.min.css">
<link rel="stylesheet" href="../../resources/css/jquery.bxslider.css">
<link rel="stylesheet" type="text/css"
    href="../../resources/css/normalize.css" />
<link rel="stylesheet" type="text/css"
    href="../../resources/css/demo.css" />
<link rel="stylesheet" type="text/css"
    href="../../resources/css/set1.css" />
<link href="../../resources/css/overwrite.css" rel="stylesheet">
<link href="../../resources/css/style.css" rel="stylesheet">
<script src="../../resources/js/jquery-3.1.1.js"></script>
<script>
	$(document)
			.ready(
					function(evnet) {

						$('#golist')
								.click(
										function(event) {
											location.href = "pj_training/${boardcd}?searchWord=${searchWord}&curPage=${curPage}";/* "articlelist/${boardcd}?searchWord=${searchWord}&curPage=${curPage}" ;*/
										});
					});
</script>
</head>
<body>

    <div id="wrap">

        <div id="header">
            <%@ include file="header.jsp"%>
        </div>

        <%--    <div id="main-menu">
        <%@ include file="../inc/main-menu.jsp" %>
    </div>  --%>

        <div id="container">
            <div id="content" style="min-height: 800px;">
                <div id="url-navi">BBS</div>

                <!-- 본문 시작 -->
                <h1>${boardnm }</h1>
                <div id="bbs">
                    <h2>글쓰기</h2>
                    <form id="writeForm" action="articlewrite"
                        method="post" enctype="multipart/form-data"
                        onsubmit="return check()">
                        <p style="margin: 0; padding: 0;">
                            <input type="hidden" name="boardcd"
                                value="${boardcd }" />
                        </p>
                        <table id="write-form">
                            <tr>
                                <td>제목</td>
                                <td><input type="text" name="title"
                                    size="50" /></td>
                            </tr>
                            <tr>
                                <td colspan="2"><textarea
                                        name="content" rows="17"></textarea>
                                </td>
                            </tr>

                            <tr>
                                <td>파일첨부</td>
                                <td><input type="file"
                                    name="upload" /></td>
                            </tr>
                        </table>
                        <div
                            style="text-align: center; padding-bottom: 15px;">
                            <input type="submit" value="전송" /> <input
                                type="button" value="목록" id="golist" />
                        </div>
                    </form>
                </div>
                <!--  본문 끝 -->

            </div>
            <!-- content 끝 -->

        </div>
        <!--  container 끝 -->

        <div id="sidebar">
            <%@ include file="bbs-menu.jsp"%>
        </div>

        <div id="extra">
            <%@ include file="extra.jsp"%>
        </div>

        <div id="footer">
            <%@ include file="footer.jsp"%>
        </div>

    </div>


</body>
</html>
