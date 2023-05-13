<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Kick Off: 관리자-회원 관리</title>
	<meta name="viewport" content="width=device-width, initial-scale=1, user-scalable=no" />
		<!--[if lte IE 8]><script src="assets/js/ie/html5shiv.js"></script><![endif]-->
		<link rel="stylesheet" href="/admin/css/main.css" />
		
		
		<link rel="stylesheet" href="/admin/css/theme.css" />
		<!--[if lte IE 9]><link rel="stylesheet" href="assets/css/ie9.css" /><![endif]-->
		<!--[if lte IE 8]><link rel="stylesheet" href="assets/css/ie8.css" /><![endif]-->
	
		<!-- Fontfaces CSS-->
		<link href="/admin/vendor/mdi-font/css/material-design-iconic-font.min.css" rel="stylesheet" media="all">

		  <!-- Vendor CSS-->
		 <link href="/admin/vendor/select2/select2.min.css" rel="stylesheet" media="all">
		
		
		
	</head>
	<body>

		<!-- Wrapper -->
			<div id="wrapper">

				<!-- Main -->
					<div id="main">
						<div class="inner">

							<!-- Header -->
								<header id="header">
									<a href="/userManagement" class="logo"><strong>마이 페이지</strong> 관리자 전용</a>
								</header>

							<!-- Banner -->
								<section id="banner">
									<div class="content">
										<header>
											<h1>회원 관리</h1>
										</header>
									</div>
								</section>
								
                            <div class="col-lg-6">
                                <!-- USER DATA-->
                                <div class="user-data m-b-30">
                                    <h3 class="title-3 m-b-30">
                                        <i class="zmdi zmdi-account-calendar"></i>user data</h3>
                                    <div class="filters m-b-45">
                                        <div class="rs-select2--dark rs-select2--md m-r-10 rs-select2--border">
                                            <select class="js-select2" name="property">
                                                <option selected="selected">모두</option>
                                                <option value="">개인 회원</option>
                                                <option value="">개인 회원-팀장</option>
                                                <option value="">업체 회원</option>
                                                <option value="">관리자</option>
                                            </select>
                                            <div class="dropDownSelect2"></div>
                                        </div>
                                        <div class="rs-select2--dark rs-select2--md m-r-10 rs-select2--border">
                                            <select class="js-select2" name="property">
                                                <option selected="selected">모두</option>
                                                <option value="">활동 회원</option>
                                                <option value="">정지 회원</option>
                                            </select>
                                            <div class="dropDownSelect2"></div>
                                        </div>
                                    </div>
                                    <div class="table-responsive table-data">
                                        <table class="table">
                                            <thead>
                                                <tr>
                                                    <td>
                                                        <label class="au-checkbox">
                                                            <input type="checkbox">
                                                            <span class="au-checkmark"></span>
                                                        </label>
                                                    </td>
                                                    <td>이름/이메일</td>
                                                    <td>구분</td>
                                                    <td>취소 횟수</td>
                                                    <td>정지 횟수</td>
                                                    <td>상태</td>
                                                    <td>관리</td>
                                                </tr>
                                            </thead>
                                            <tbody>
                                                <tr>
                                                    <td>
                                                        <label class="au-checkbox">
                                                            <input type="checkbox">
                                                            <span class="au-checkmark"></span>
                                                        </label>
                                                    </td>
                                                    <td>
                                                        <div class="table-data__info">
                                                            <h6>kickoff</h6>
                                                            <span>
                                                                <a>kickoff@gmail.com</a>
                                                            </span>
                                                        </div>
                                                    </td>
                                                    <td>
                                                        <span class="role admin">admin</span>
                                                    </td>
                                                    <td>
                                                        <span class="cancel-number">0</span>
                                                    </td>
                                                    <td>
                                                        <span class="rest-number">0</span>
                                                    </td>
                                                    <td>
                                                        <div class="rs-select2--trans rs-select2--sm">
                                                            <span class="status-active">활동</span>
                                                        </div>
                                                    </td>
                                                    <td>
                                                        <button class="btn-stop">정지</button>
                                                        <button class="btn-out">탈퇴</button>
                                                    </td>
                                                </tr>
                                                    <c:forEach var="list" items="${userList}">
                                                <tr>
                                                    <td>
                                                        <label class="au-checkbox">
                                                            <input type="checkbox">
                                                            <span class="au-checkmark"></span>
                                                        </label>
                                                    </td>
                                                    <td>
                                                        <div class="table-data__info">
                                                            <h6><c:out value="${list.userName}" /></h6>
                                                            <span>
                                                                <a><c:out value="${list.userEmail}" /></a>
                                                            </span>
                                                        </div>
                                                    </td>
                                                    <td>
                                                         <span class="
                                                             <c:choose>
                                                                <c:when test="${list.userClassification == 'Admin'}">role admin</c:when>
                                                                <c:when test="${list.userClassification == 'Master'}">role master</c:when>
                                                                <c:when test="${list.userClassification == 'User'}">role user</c:when>
                                                                <c:when test="${list.userClassification == 'Emp'}">role emp</c:when>
                                                                <c:otherwise>default-role</c:otherwise>
                                                            </c:choose>
                                                         ">
                                                             <c:out value="${list.userClassification}" />
                                                        </span>
                                                    </td>
                                                    <td>
                                                        <span class="cancel-number"><c:out value="${list.userCancelCount}" /></span>
                                                    </td>
                                                    <td>
                                                        <span class="rest-number"><c:out value="${list.userStopCount}" /></span>
                                                    </td>
                                                    <td>
                                                        <div class="rs-select2--trans rs-select2--sm">
                                                            <span class="
                                                             <c:choose>
                                                                <c:when test="${list.userStatus == '활동'}">status-active</c:when>
                                                                <c:when test="${list.userStatus == '정지'}">status-stop</c:when>
                                                            </c:choose>
                                                         ">
                                                             <c:out value="${list.userStatus}" />
                                                        </span>
                                                        </div>
                                                    </td>
                                                    <td>
                                                        <button class="btn-stop">정지</button>
                                                        <button class="btn-out">탈퇴</button>
                                                    </td>
                                                </tr>
                                                    </c:forEach>
                                            </tbody>
                                        </table>
                                    </div>
                                    <!--
                                    <div class="user-data__footer">
                                        <button class="au-btn au-btn-load">load more</button>
                                    </div>
                                    -->
                                </div>
                                <!-- END USER DATA-->
                            </div>

						</div>
					</div>

				<!-- Sidebar -->
					<div id="sidebar">
						<div class="inner">

							<!-- Menu -->
								<nav id="menu">
									<header class="major">
										<h2>Menu</h2>
									</header>
									<ul>
										<li><a href="/userManagement">회원 관리</a></li>
										<li><a href="/boardManagement">신고 게시글 관리</a></li>
									</ul>
								</nav>

						</div>
					</div>

			</div>

		<!-- Scripts -->
			<script src="/admin/js/jquery.min.js"></script>
			<script src="/admin/js/skel.min.js"></script>
			<script src="/admin/js/util.js"></script>
			<!--[if lte IE 8]><script src="assets/js/ie/respond.min.js"></script><![endif]-->
			<script src="/admin/js/main.js"></script>
			
		
   <!-- Jquery JS-->
    <script src="/admin/vendor/jquery-3.2.1.min.js"></script>
    <script src="/admin/vendor/counter-up/jquery.waypoints.min.js"></script>
    <script src="/admin/vendor/counter-up/jquery.counterup.min.js"></script>
    
    
    <!-- Vendor JS       -->
    <script src="/admin/vendor/select2/select2.min.js"></script>
    
    
    </script>
   
 <!-- Main JS-->
    <script src="/admin/js/user.js"></script>

	</body>
</html>