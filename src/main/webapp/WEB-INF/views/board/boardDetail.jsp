<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>


<!doctype html>
<html>
<head>
<meta charset="UTF-8" />
<title>Kick Off: 자유게시판 글 상세보기</title>
<!-- include할 문서에 스타일, js -->
<link rel="stylesheet" href="/includes/css/style.css">
<link rel = "stylesheet" href = "/includes/css/footer.css" />
<link rel = "stylesheet" href = "/main/css/vendor/icomoon/style.css">

<script src="/includes/js/jquery-3.3.1.min.js"></script>

<script src="/includes/js/jquery.lettering.js"></script>
<script src="/includes/js/jquery.sticky.js"></script>


<script src="/includes/js/ScrollMagic.min.js"></script>
<script src="/includes/js/scrollmagic.animation.gsap.min.js"></script>


<script src="/includes/js/main.js"></script>
<!-- 여기까지 복붙하기 -->

<link rel="stylesheet" href="/board/css/boardDetail.css" />
</head>
<body>
	<%@include file="/includes/header.jsp"%>
	<!-- Header -->
	<div class="bg-dark py-5">
		<div class="container px-4 px-lg-5 my-5">
			<div class="text-center text-white">
				<h1 class="display-4 fw-bolder">게시글 제목</h1>
				<p class="lead fw-normal text-white-50 mb-0">작성자</p>
			</div>
		</div>
	</div>
	<form role="form" action="/board/create_action" method="post">
		<div class="container">
			<div class="table-responsive">
				<table class="board_detail">
					<colgroup>
						<col width="20%" />
						<col width="35%" />
						<col width="15%" />
						<col width="35%" />
					</colgroup>
					<tbody>
						<tr>
							<th scope="row">글 번호</th>
							<td>글번호</td>
							<th scope="row">조회수</th>
							<td>조회수</td>
						</tr>
						<tr>
							<th scope="row">작성자</th>
							<td>작성자</td>
							<th scope="row">작성일</th>
							<td>작성일</td>
						</tr>
						<tr>
							<th scope="row">제목</th>
							<td colspan="3"><input type="text" id="title" name="title"
								value="제목제목" /></td>
						</tr>
						<tr>
							<td colspan="4" class="view_text"><textarea title="내용"
									id="contents" name="contents" value="내용내용"></textarea></td>
						</tr>
					</tbody>
				</table>
			</div>
			<br />
			<hr>
			
			<!-- 댓글 -->
			<div class="reply">
				<table id="tblListComment" class="table table-bordered">

					<c:if test="${ clist.size() == 0 }">
						<tr>
							<td colspan="2">댓글이 없습니다.</td>
						</tr>
					</c:if>

					<c:forEach items="${ clist }" var="cdto">
						<tr>
							<td>${ cdto.content } <span>${ cdto.name }. ${ cdto.regdate }</span>
							</td>
							<td><input type="button" value="삭제하기" class="btn btn-default"
								onclick="location.href='/myapp/board/delcomment.do?seq=${ cdto.seq }&pseq=${ dto.seq }';" />
							</td>
						</tr>
					</c:forEach>
				</table>

				<form method="POST" action="/myapp/board/addcomment.do">
					<table id="tblAddComment" class="table table-bordered">
						<tr>
							<td>
								<input type="text" name="content" id="content" class="form-control" required placeholder="댓글을 작성하세요. " />
							</td>
							<td>
								<input type="button" id="btn btn-primary" class="btn btn-primary" value="댓글쓰기">
							</td>
						</tr>
					</table>
					<input type="hidden" name="pseq" value="${ dto.seq }" />
				</form>
			</div>

			<div class="btn_boarddetail">
				<button type="reset" class="btn_reset" onclick="location.href='/board';">목록</button>
				<button class="btn_delete" onclick="location.href='/boardReport';">신고</button>
			</div>
		</div>
	</form>
	
   <%@include file="/includes/footer.jsp"%>
</body>
</html>

