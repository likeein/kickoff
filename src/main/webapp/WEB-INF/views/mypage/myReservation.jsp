<%@ page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Kick Off: 마이페이지</title>
<meta name="viewport"
	content="width=device-width, initial-scale=1, user-scalable=no" />
<!--[if lte IE 8]><script src="assets/js/ie/html5shiv.js"></script><![endif]-->
<link href="/myPage/css/main.css" rel="stylesheet" />
<!--[if lte IE 9]><link rel="stylesheet" href="assets/css/ie9.css" /><![endif]-->
<!--[if lte IE 8]><link rel="stylesheet" href="assets/css/ie8.css" /><![endif]-->

<!-- Bootstrap CSS-->
<link href="vendor/bootstrap-4.1/bootstrap.min.css" rel="stylesheet" media="all">

<!-- Vendor CSS-->
<link href="/myPage/vendor/select2/select2.min.css" rel="stylesheet" media="all">
<link href="/myPage/vendor/mdi-font/material-design-iconic-font.min.css" rel="stylesheet" media="all">

<!-- Main CSS-->
<link href="/myPage/css/theme.css" rel="stylesheet" media="all">
<link href="/myPage/css/myReservation.css" rel="stylesheet" media="all">

</head>
<body>
	<!-- Wrapper -->
	<div id="wrapper">

		<!-- Main -->
		<div id="main">
			<div class="inner">

				<!-- Header -->
				<header id="header">
					<input type="button" onclick="location.href='main'" class="kickoff-logo" value="Kick Off"/>
					<br>
					<a href="/myReservation" class="logo"><strong>예약 내역</strong></a>
				</header>

				<section>
					<div class="container-fluid">
						<div class="container reservation-container">
							<div class="container p-0">
								<div class="root-content">
									<div class="container">
										<div class="facility-content">
											<div class="image-wrap">
												<img class="image"
													src="/reservation/images/court.jpg" />
											</div>
											<div class="facility-wrap">
												<h2>4조 풋살장</h2>
												<p class="info">
													예약날짜<span>5월 5일</span>
												</p>
												<p class="info">
													예약시간<span>20:00~22:00</span>
												</p>
												<p class="info">
													위치<span>울산광역시 중구 손골길3</span>
												</p>
												<p class="info">
													전화번호<span>02-234-5678</span>
												</p>
											</div>
										</div>
									</div>

									<div class="container">
										<div class="map-wrap">
											<h4 class="title">
												구장위치<span>*</span>
											</h4>
											<div class="map-container">
												<div id="map">지도지도 카카오 API 자리</div>
											</div>
										</div>
									</div>
									<!-- button -->
									<div class="btn-container">
										<a href="#this" id="cancle" class="cancle">예약 취소</a>
									</div>
								</div>
							</div>
						</div>


					</div>
					<!-- END DATA TABLE -->
				</section>
			</div>
		</div>
		<!-- Sidebar -->
		<div id="sidebar">
			<div class="inner">

				<!-- Menu -->
				<nav id="menu">
					<header class="major">
						<h2>MyPage</h2>
					</header>
					<ul>
						<li><a href="/myReservation">예약 내역</a></li>
						<li><a href="/myBoardList">내 게시글</a></li>
						<li><a href="/myInfo">회원 정보 수정</a></li>
						<li><a href="/myTeam">팀</a></li>
						<li><a href="/myMessage">메시지</a></li>
						<li><a href="/myHelper">용병</a></li>
					</ul>
				</nav>

				<!-- Section -->


				<!-- Footer -->

			</div>
		</div>

	</div>

	<!-- Scripts -->
	<script src="/myPage/js/jquery.min.js"></script>
	<script src="/myPage/js/skel.min.js"></script>
	<script src="/myPage/js/util.js"></script>
	<!--[if lte IE 8]><script src="assets/js/ie/respond.min.js"></script><![endif]-->
	<script src="/myPage/js/main.js"></script>
	<!-- Jquery JS-->
	<script src="/myPage/vendor/jquery-3.2.1.min.js"></script>
	<!-- Bootstrap JS-->
	<script src="/myPage/vendor/bootstrap-4.1/popper.min.js"></script>
	<script src="/myPage/vendor/bootstrap-4.1/bootstrap.min.js"></script>
	<!-- Vendor JS       -->
	<script src="/myPage/vendor/select2/select2.min.js"></script>

	<!-- Main JS-->
	<script src="/myPage/js/reservationMain.js"></script>


</body>
</html>