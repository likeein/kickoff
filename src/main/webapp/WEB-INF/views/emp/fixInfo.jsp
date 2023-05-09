<%@ page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Insert title here</title>
	<meta name="viewport" content="width=device-width, initial-scale=1, user-scalable=no" />
		<!--[if lte IE 8]><script src="assets/js/ie/html5shiv.js"></script><![endif]-->
		<link rel = "stylesheet" href = "/kickoff/resource/emp/css/fixInfo.css">
		<link rel="stylesheet" href="/kickoff/resource/emp/css/main.css" />
		<!--[if lte IE 9]><link rel="stylesheet" href="assets/css/ie9.css" /><![endif]-->
		<!--[if lte IE 8]><link rel="stylesheet" href="assets/css/ie8.css" /><![endif]-->
	</head>
	<body>
		<!-- Wrapper -->
			<div id="wrapper">

				<!-- Main -->
					<div id="main">
						<div class="inner">

							<!-- Header -->
								<header id="header">
									<a href="myBoard.jsp" class="logo"><strong>마이 페이지</strong> 업체 회원용</a>									
								</header>
							
							<!-- Begin Page Content -->
			                	<section>
				                	<div class="container-fluid">										
										    <form action="#">
										      <h1>회원정보 수정</h1>
										      <br />
										      <br />
										      <div class="signupform" style="overflow:visible; width:980px; height:auto; border-radius: 10px;">
										      	<input type="text" placeholder="아이디 나중에 값 불러오기" />
										      	<input type="password" placeholder="비밀번호" />
										      	<input type="password" placeholder="비밀번호확인" />
										      	<input type="text" placeholder="업체 이름" />
										      	<input type="text" placeholder="업체 번호" />
										      	<input type="text" placeholder="업체 주소" />
										      	<input type="email" placeholder="이메일" />
										      	<input type="date" placeholder="업체 등록일" />
										      	<input type="text" placeholder="사업자 번호" />
										      	<button>사업자 번호 인증</button>
										      </div>
										      <br />
										      <button>수정하기</button>
										      <br/>
										      <a href="/TeamCommit/viewex/main/main.jsp">회원 탈퇴</a>
										    </form>									     
										 </div>
				                 			                                  
			                <!-- /.container-fluid -->
								</section>

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
										<a href="empReservation.jsp">예약관리</a>
										<li><a href="myBoard.jsp">내 게시글</a></li>
										<li><a href="fixInfo.jsp">회원 정보 수정</a></li>
										<li>
											<!-- opener 에 원래 active 열고 닫게 할 수 있어야 함 -->
											<span class="opener">풋살장 관리</span>
											<ul>
												<li><a href="empFutsal.jsp">풋살장 등록</a></li>
												<li><a href="empFutsalFix.jsp">풋살장 수정</a></li>												
											</ul>
										</li>										
									</ul>
								</nav>

							<!-- Section -->
								<section>
									<header class="major">
										<h2>Get in touch</h2>
									</header>
									<p>Sed varius enim lorem ullamcorper dolore aliquam aenean ornare velit lacus, ac varius enim lorem ullamcorper dolore. Proin sed aliquam facilisis ante interdum. Sed nulla amet lorem feugiat tempus aliquam.</p>
									<ul class="contact">
										<li class="fa-envelope-o"><a href="#">information@untitled.tld</a></li>
										<li class="fa-phone">(000) 000-0000</li>
										<li class="fa-home">1234 Somewhere Road #8254<br />
										Nashville, TN 00000-0000</li>
									</ul>
								</section>

							<!-- Footer -->
								<footer id="footer">
									<p class="copyright">&copy; Untitled. All rights reserved. Demo Images: <a href="https://unsplash.com">Unsplash</a>. Design: <a href="https://html5up.net">HTML5 UP</a>.</p>
								</footer>

						</div>
					</div>

			</div>

		<!-- Scripts -->
			<script src = "/kickoff/resource/login/js/login.js"></script>
			<script src="/kickoff/resource/emp/js/jquery.min.js"></script>
			<script src="/kickoff/resource/emp/js/skel.min.js"></script>
			<script src="/kickoff/resource/emp/js/util.js"></script>
			<!--[if lte IE 8]><script src="assets/js/ie/respond.min.js"></script><![endif]-->
			<script src="/kickoff/resource/emp/js/main.js"></script>

	</body>
</html>