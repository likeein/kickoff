<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, user-scalable=no" />
	<!--[if lte IE 8]><script src="/emp/js/ie/html5shiv.js"></script><![endif]-->
	<link rel="stylesheet" href="/emp/css/main.css" />
	<!--[if lte IE 9]><link rel="stylesheet" href="/emp/css/ie9.css" /><![endif]-->
	<!--[if lte IE 8]><link rel="stylesheet" href="/emp/css/ie8.css" /><![endif]-->
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Kick off: 풋살장 등록 관리</title>

    <!-- Google Font -->
    <link href="https://fonts.googleapis.com/css2?family=Cairo:wght@200;300;400;600;900&display=swap" rel="stylesheet">
	
	<!-- calendar -->
    <script src="https://code.jquery.com/jquery-3.3.1.min.js"></script>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    <script src="https://unpkg.com/gijgo@1.9.14/js/gijgo.min.js" type="text/javascript"></script>
    <link href="https://unpkg.com/gijgo@1.9.14/css/gijgo.min.css" rel="stylesheet" type="text/css" />
	
    <!-- Css Styles 
    <link rel="stylesheet" href="/TeamCommit/resource/emp/css/empFutsal/bootstrap.min.css" type="text/css">-->
    <link rel="stylesheet" href="/emp/css/empFutsal/nice-select.css" type="text/css">
    <link rel="stylesheet" href="/emp/css/empFutsal/style.css" type="text/css">
    <link rel="stylesheet" href="/emp/css/empFutsal/jquery-ui.min.css" type="text/css">
	
     
</head>

<body>

	<!-- Wrapper -->
			<div id="wrapper">

				<!-- Main -->
					<div id="main">
						<div class="inner">

							<!-- Header -->
								<header id="header">
									<a href="empReservation.jsp" class="logo"><strong>마이 페이지</strong> 업체 회원용</a>									
								</header>
							
							<!-- Begin Page Content -->
			                	<section>
				                	<div class="container-fluid">
				                    <!-- Page Heading -->
				                    <h1 class="h3 mb-2 text-gray-800">풋살장 등록</h1>
				                    
				                	<div class="checkout spad">
								    	<div class="container">
								    	<!-- 이미지 class 추가 -->
								    	<div class="checkout__form">
								    		<div class="futsal">								    		
								        	<form id="frm" name="frm" action="#" method="POST">								            	
								                	<div class="col-lg-8 col-md-6">
								                		<div class="checkout__input">
								                		<div class="filebox bs3-primary preview-image">
											    			<p>풋살장 이미지<span>*</span></p>
						              						<input class="upload-name" value="파일선택" disabled="disabled" style="width: 500px;">
						              						<label for="input_file">업로드</label> 
						              						<input type="file" id="input_file" class="upload-hidden"> 
			       										</div>
														<div class="checkout__input">
							                               <p>풋살장<span>*</span></p>
							                               <input type="text" value="여기에 '풋살장 이름' 가져오기 (입력 비활성화)" readonly>
                               								<!-- readonly: 입력 필드 비활성화되지만 form으로 전송 가능 -->
                           								</div>
                          							<div class="checkout__input">
                                						<p>코트<span>*</span></p>
                                							<select id="courtName" onChange="selectCourt(this)">
							                                	<option value="">코트 선택하기</option>
							                                	<option value="A">A코트</option>
							                                	<option value="B">B코트</option>
							                                	<option value="C">C코트</option>
							                                	<option value="D">D코트</option>
							                                	<option value="E">E코트</option>
							                                </select>
                            						</div>
						                           	<div class="checkout__input">
						                                <p>위치<span>*</span></p>
						                                <input type="text" value="'주소' 정보 가져오기 (입력 비활성화)" readonly>
						                            </div>
						                            <div class="checkout__input">
						                                <p>형태<span>*</span></p>
						                                <label>
						                                	<input type="radio" name="placeForm" value="indoor" onclick='getPlaceForm(event)' />&nbsp실내
						                                </label>
						                                <label>
						                                	<input type="radio" name="placeForm" value="outdoor" onclick='getPlaceForm(event)' />&nbsp실외
						                                </label>
						                            </div>
						                            <div class="checkout__input">
						                                <p>예약 날짜<span>*</span></p>
						                                <input id="setDate" onChange="getDate()" />
						                            </div>
						                            <div class="row">
						                                <div class="col-lg-6">
						                                    <div class="checkout__input">
						                                        <p>시작 시간<span>*</span></p>
						                                        <select id="openTime" name="openTime" onChange="getStartTime(this)">
						                                        	<option value="">시작 시간 선택</option>
						                                        	<c:forEach var="i" begin="1" end="24">
							                                        	<c:choose>
							                                        		<c:when test="${i lt 10}">
							                                        			<option value="0${i}">0${i}:00</option>
							                                        		</c:when>
							                                        		<c:otherwise>
							                                        			<option value="${i}">${i}:00</option>
							                                        		</c:otherwise>
							                                        	</c:choose>
						                                        	</c:forEach>
						                                        </select>
						                                    </div>
						                                </div>
						                                <div class="col-lg-6">
						                                    <div class="checkout__input">
						                                        <p>종료 시간<span>*</span></p>
						                                        <select id="closeTime" name="closeTime" onChange="getEndTime(this)">
						                                        	<option value="">종료 시간 선택</option>
						                                        	<c:forEach var="i" begin="1" end="24">
							                                        	<c:choose>
							                                        		<c:when test="${i lt 10}">
							                                        			<option value="0${i}">0${i}:00</option>
							                                        		</c:when>
							                                        		<c:otherwise>
							                                        			<option value="${i}">${i}:00</option>
							                                        		</c:otherwise>
							                                        	</c:choose>
						                                        	</c:forEach>
						                                        </select>
						                                    </div>
						                                </div>
						                            </div>
						                            <div class="checkout__input">
						                                <p>가격<span>*</span></p>
						                                <input type="number" class="inputPrice" id="inputPrice" onChange="getPrice()" placeholder="ex) 50000">
						                            </div>
						                            <div class="checkout__input">
														<p>기타사항</p>
						                               	<textarea class="etc"></textarea>
						                            </div>
						                        </div>
						                        </div>						                     
				                            </form>
				                            </div>
				                        </div>
				                    	</div>
				                    </div>
				                    </div>
				                    </section>
						        
			                <!-- /.container-fluid -->
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
										<li><a href="empReservation.jsp">예약관리</a></li>
										<li><a href="myBoard.jsp">내 게시글</a></li>
										<li><a href="fixInfo.jsp">회원 정보 수정</a></li>
										<li>
											<!-- opener 에 원래 active 열고 닫게 할 수 있어야 함 -->
											<span class="opener active">풋살장 관리</span>
											<ul>
												<li><a href="empFutsal.jsp">풋살장 등록</a></li>
												<li><a href="empFutsalFix.jsp">풋살장 수정</a></li>												
											</ul>
										</li>										
									</ul>
								</nav>


						</div>
					</div>

			</div>
			
			<script type="text/javascript">
		/* calendar */
		$('#setDate').datepicker({
			format: "yyyy-mm-dd",
		    uiLibrary: 'bootstrap4',
		});
	</script>
	

		<!-- Scripts -->
			<script src="/emp/js/jquery.min.js"></script>
			<script src="/emp/js/skel.min.js"></script>
			<script src="/emp/js/util.js"></script>
			<!--[if lte IE 8]><script src="/emp/js/ie/respond.min.js"></script><![endif]-->
			<script src="/emp/js/main.js"></script>
			<!-- Js Plugins -->
		    <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
		    <script src="/emp/js/empFutsal/jquery-3.3.1.min.js"></script>
		    <script src="/emp/js/empFutsal/bootstrap.min.js"></script>
		    <script src="/emp/js/empFutsal/jquery.nice-select.min.js"></script>
		    <script src="/emp/js/empFutsal/jquery-ui.min.js"></script>
			<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
		    <script src="/emp/js/empFutsal/jquery.slicknav.js"></script>
		    <script src="/emp/js/empFutsal/main.js"></script>
			<script src="/emp/js/empFutsal/common.js"></script>
	</body>
</html>