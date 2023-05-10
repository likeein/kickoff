<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>


<!doctype html>
<html>
<head>
<meta charset="UTF-8" />
<title>Kick Off: 자유게시판 글 수정</title>
<!-- include할 문서에 스타일, js -->
 <link rel="stylesheet" href="/includes/css/style.css">
 <link rel = "stylesheet" href = "/main/css/vendor/icomoon/style.css">
    
    <script src="/includes/js/jquery-3.3.1.min.js"></script>

    <script src="/includes/js/jquery.lettering.js"></script>
    <script src="/includes/js/jquery.sticky.js"></script>


    <script src="/includes/js/ScrollMagic.min.js"></script>
    <script src="/includes/js/scrollmagic.animation.gsap.min.js"></script>


    <script src="/includes/js/main.js"></script>
<!-- 여기까지 복붙하기 -->    

<link rel = "stylesheet" href = "/board/css/boardInsertstyle.css" />

</head>
<body>
<%@include file="/includes/header.jsp"%>
<!-- Header -->
    <div class="bg-dark py-5">
        <div class="container px-4 px-lg-5 my-5">
            <div class="text-center text-white">
                <h1 class="display-4 fw-bolder">자유게시판 게시글 수정</h1>
                <p class="lead fw-normal text-white-50 mb-0">풋살 관련 이야기할 주제들을 자유롭게 게시해주세요.</p>
            </div>
        </div>
    </div>

<br>
<br>
<form role="form" action="/board/create_action" method="post">
<h4>게시글 수정</h4>
<div class="table-responsive">
		
		<div class="board_title">
		<span class="formInline">
		<label for="board_title">제목</label>
		<input type="text" id="board_title" name="board_title" class="form-control">
		</span>
		</div>
		
		<div class="writer">
		<span id="boardWriter" class="formWriter">
		<label for="board_writer" class="writer">작성자</label>
		</span>
		</div>
		
		<div class="filebox bs3-primary preview-image">
              <input class="upload-name" value="파일선택" disabled="disabled" style="width: 200px;">

              <label for="input_file">업로드</label> 
              <input type="file" id="input_file" class="upload-hidden"> 
        </div>
		
		<div class="content">
		<label for="board_content">내용</label><br>
			<textarea id="board_content" name="board_content" cols="100" rows="20" class="form-content"></textarea>
		</div>
		
		<div class="btn_board">
		<button type="reset" class="btn_reset" onclick="location.href='/board/boardDetail.jsp';">취소</button>
		<button type="submit" class="btn_submit">수정</button>
		</div>
</div>	
</form>

</body>
</html>

