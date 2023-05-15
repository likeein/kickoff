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

    <!-- Google Font
    <link href="https://fonts.googleapis.com/css2?family=Cairo:wght@200;300;400;600;900&display=swap" rel="stylesheet">
	-->
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
									<a href="/empReservation" class="logo"><strong>마이 페이지</strong> 업체 회원용</a>
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
												<input type="hidden" id="placeId" name="placeId" value="${empFutsalInsert.placeId}" />
								                	<div class="col-lg-8 col-md-6">
								                		<div class="checkout__input">
								                		<div class="filebox bs3-primary preview-image">
											    			<p>풋살장 이미지<span>*</span></p>
						              						<input class="upload-name" value="파일선택" disabled="disabled"style="width: 500px;">
						              						<label for="input_file">업로드</label> 
						              						<input type="file" id="input_file" class="upload-hidden"> 
			       										</div>
														<div class="checkout__input">
							                               <p>풋살장<span>*</span></p>
							                               <textarea class="etc" name="placeName" value="${empFutsalInsert.placeName}"></textarea>
                           								</div>
                          							<div class="checkout__input">
                                						<p>바닥 형태<span>*${empFutsalInsert.placeGround}</span></p>
                                							<select id="courtName" onChange="selectCourt(this)">
							                                	<option value="">바닥 선택하기</option>
																<option value="A" <c:if test="${empFutsalInsert.placeGround == '인조잔디'}">selected</c:if>>인조잔디</option>
							                                	<option value="B" <c:if test="${empFutsalInsert.placeGround == '피치플로어'}">selected</c:if>>피치플로어</option>
							                                	<option value="C" <c:if test="${empFutsalInsert.placeGround == '천연잔디'}">selected</c:if>>천연잔디</option>
							                                </select>
                            						</div>
						                           	<div class="checkout__input">
						                                <p>위치<span>*</span></p>
						                                <input type="text" value="'주소' 정보 가져오기 (입력 비활성화)" readonly>
						                            </div>
						                            <div class="checkout__input">
						                                <p>풋살장 형태<span>*</span></p>
						                                <label>
															<input type="radio" name="placeForm" value="indoor" onclick='getPlaceForm(event)' <c:if test="${empFutsalInsert.placeForm eq 'indoor'}">checked="checked"</c:if>/>&nbsp실내
						                                </label>
						                                <label>
						                                	<input type="radio" name="placeForm" value="outdoor" onclick='getPlaceForm(event)' <c:if test="${empFutsalInsert.placeForm eq 'outdoor'}">checked="checked"</c:if>/> />&nbsp실외
						                                </label>
						                            </div>
						                            <div class="checkout__input">
						                                <p>개방 일수<span>*</span></p>
						                                <input id="setDate" onChange="getDate()" />
						                            </div>
						                            <div class="row">
						                                <div class="col-lg-6">
						                                    <div class="checkout__input">
						                                        <p>대여 시간<span>*</span></p>
						                                        <select id="openTime" name="openTime" onChange="getStartTime(this)">
						                                        	<option value="">대여 시간 선택</option>
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
														<div class="checkout__input">
															<p>조명<span>*</span></p>
															<label>
																<input type="radio" name="placeLight" value="Y" onclick='getPlaceLight(event)' <c:if test="${empFutsalInsert.placeLight eq 'Y'}">checked="checked"</c:if>/>&nbsp있음
															</label>
															<label>
																<input type="radio" name="placeLight" value="N" onclick='getPlaceLight(event)' <c:if test="${empFutsalInsert.placeLight eq 'N'}">checked="checked"</c:if>/>&nbsp없음
															</label>
														</div>
														<div class="checkout__input">
															<p>주차장<span>*</span></p>
															<label>
																<input type="radio" name="placeParking" value="Y" onclick='getPlaceParking(event)' <c:if test="${empFutsalInsert.placeParking eq 'Y'}">checked="checked"</c:if>/>&nbsp있음
															</label>
															<label>
																<input type="radio" name="placeParking" value="N" onclick='getPlaceParking(event)' <c:if test="${empFutsalInsert.placeParking eq 'N'}">checked="checked"</c:if>/>&nbsp없음
															</label>
														</div>
						                            </div>
						                            <div class="checkout__input">
						                                <p>가격<span>*</span></p>
						                                <input type="number" class="inputPrice" id="inputPrice" value="${empFutsalInsert.placePrice}" onChange="getPrice()" placeholder="ex) 50000">
						                            </div>
						                            <div class="checkout__input">
														<p>기타사항</p>
						                               	<textarea class="etc" value="${empFutsalInsert.placeOther}"></textarea>
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
										<li><a href="/empReservation">예약관리</a></li>
										<li><a href="/myBoard">내 게시글</a></li>
										<li><a href="/fixInfo">회원 정보 수정</a></li>
										<li>
											<!-- opener 에 원래 active 열고 닫게 할 수 있어야 함 -->
											<span class="opener active">풋살장 관리</span>
											<ul>
												<li><a href="/empFutsal">풋살장 등록</a></li>
												<li><a href="/empFutsalFix">풋살장 목록</a></li>
											</ul>
										</li>										
									</ul>
								</nav>


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