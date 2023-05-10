<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no" />
    <meta name="description" content="" />
    <meta name="author" content="" />
    <title>Kick off: 풋살장 예약 목록</title>
    <link href="https://fonts.google.com/noto/specimen/Noto+Sans+KR?subset=korean&noto.script=Kore" rel="stylesheet">
    <!-- Favicon-->
    <link rel="icon" type="image/x-icon" href="/reservation/assets/favicon.ico" />
    <!-- Bootstrap icons-->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.5.0/font/bootstrap-icons.css" rel="stylesheet" />
    <!-- Core theme CSS (includes Bootstrap)-->
    <link rel = "stylesheet" href = "/main/css/vendor/icomoon/style.css">
    <link href="/reservation/css/styles.css" rel="stylesheet" />
    <link href="/includes/css/style.css" rel="stylesheet" />
</head>
<body>
	<div class="header-container">
		<%@include file="/includes/header.jsp"%>
	</div>
	
    <!-- title -->
    <header class="bg-dark py-5">
        <div class="container px-4 px-lg-5 my-5">
            <div class="text-center text-white">
                <h1 class="display-4 fw-bolder">풋살장 예약</h1>
                <p class="lead fw-normal text-white-50 mb-0">원하는 풋살장 쉽고 편리하게 예약하세요</p>
            </div>
        </div>
    </header>
    
    <!-- Section-->
	<section class="py-5">
    	<div class="container px-4 px-lg-5">
      		<div class="card-footer pt-0 border-top-0 bg-transparent">
            	<div class="text-center insert">
              		<a class="court-insert" href="reservationInsert">풋살장 등록</a>
              	</div>
          	</div>
			<div class="row gx-4 gx-lg-5 row-cols-2 row-cols-md-3 row-cols-xl-4 justify-content-center">
            
            	<%-- <c:choose>
            		<c:when test="${fn:length( # ) > 0}">
            			<c:forEach items="${ # }" var="#"> --%>
            			
			                <div class="col mb-5">
			                    <div class="card h-100">
			                        <!-- Product image-->
			                        <img class="card-img-top" src="https://dummyimage.com/450x300/dee2e6/6c757d.jpg" alt="..." />
			                        <!-- Product details-->
			                        <div class="card-body p-4">
			                            <div class="text-center">
			                                <!-- Product name-->
			                                <h5 class="fw-bolder">서울 풋살장(파주)</h5>
			                                <!-- Reservation days -->
			                                2023.04.29 (토) <!-- 예약 가능 날짜 가져오기(오늘 날짜 기준으로) -->
			                                <br>
			                                <!-- Product price-->
			                                50,000원
			                            </div>
			                        </div>
			                        <!-- Product actions-->
			                        <div class="card-footer p-4 pt-0 border-top-0 bg-transparent">
			                            <div class="text-center">
			                            	<a class="btn btn-outline-dark mt-auto" href="#">상세보기</a>
			                            </div>
			                        </div>
			                    </div>
			                </div>
			               <div class="col mb-5">
			                    <div class="card h-100">
			                        <!-- Product image-->
			                        <img class="card-img-top" src="https://dummyimage.com/450x300/dee2e6/6c757d.jpg" alt="..." />
			                        <!-- Product details-->
			                        <div class="card-body p-4">
			                            <div class="text-center">
			                                <!-- Product name-->
			                                <h5 class="fw-bolder">서울 풋살장(파주)</h5>
			                                <!-- Reservation days -->
			                                2023.04.29 (토) <!-- 예약 가능 날짜 가져오기(오늘 날짜 기준으로) -->
			                                <br>
			                                <!-- Product price-->
			                                50,000원
			                            </div>
			                        </div>
			                        <!-- Product actions-->
			                        <div class="card-footer p-4 pt-0 border-top-0 bg-transparent">
			                            <div class="text-center">
			                            	<a class="btn btn-outline-dark mt-auto" href="#">상세보기</a>
			                            </div>
			                        </div>
			                    </div>
			                </div>
	                    <div class="col mb-5">
			                    <div class="card h-100">
			                        <!-- Product image-->
			                        <img class="card-img-top" src="/reservation/images/court2.jpg" />
			                        <!-- Product details-->
			                        <div class="card-body p-4">
			                            <div class="text-center">
			                                <!-- Product name-->
			                                <h5 class="fw-bolder">서울 풋살장(파주)</h5>
			                                <!-- Reservation days -->
			                                2023.04.29 (토) <!-- 예약 가능 날짜 가져오기(오늘 날짜 기준으로) -->
			                                <br>
			                                <!-- Product price-->
			                                100,000원
			                            </div>
			                        </div>
			                        <!-- Product actions-->
			                        <div class="card-footer p-4 pt-0 border-top-0 bg-transparent">
			                            <div class="text-center">
			                            	<a class="btn btn-outline-dark mt-auto" href="/reservationDetail">상세보기</a>
			                            </div>
			                        </div>
			                    </div>
			                </div>
	                    <div class="col mb-5">
			                    <div class="card h-100">
			                        <!-- Product image-->
			                        <img class="card-img-top" src="https://dummyimage.com/450x300/dee2e6/6c757d.jpg" alt="..." />
			                        <!-- Product details-->
			                        <div class="card-body p-4">
			                            <div class="text-center">
			                                <!-- Product name-->
			                                <h5 class="fw-bolder">서울 풋살장(파주)</h5>
			                                <!-- Reservation days -->
			                                2023.04.29 (토) <!-- 예약 가능 날짜 가져오기(오늘 날짜 기준으로) -->
			                                <br>
			                                <!-- Product price-->
			                                50,000원
			                            </div>
			                        </div>
			                        <!-- Product actions-->
			                        <div class="card-footer p-4 pt-0 border-top-0 bg-transparent">
			                            <div class="text-center">
			                            	<a class="btn btn-outline-dark mt-auto" href="#">상세보기</a>
			                            </div>
			                        </div>
			                    </div>
			                </div>
	                    <div class="col mb-5">
			                    <div class="card h-100">
			                        <!-- Product image-->
			                        <img class="card-img-top" src="https://dummyimage.com/450x300/dee2e6/6c757d.jpg" alt="..." />
			                        <!-- Product details-->
			                        <div class="card-body p-4">
			                            <div class="text-center">
			                                <!-- Product name-->
			                                <h5 class="fw-bolder">서울 풋살장(파주)</h5>
			                                <!-- Reservation days -->
			                                2023.04.29 (토) <!-- 예약 가능 날짜 가져오기(오늘 날짜 기준으로) -->
			                                <br>
			                                <!-- Product price-->
			                                50,000원
			                            </div>
			                        </div>
			                        <!-- Product actions-->
			                        <div class="card-footer p-4 pt-0 border-top-0 bg-transparent">
			                            <div class="text-center">
			                            	<a class="btn btn-outline-dark mt-auto" href="#">상세보기</a>
			                            </div>
			                        </div>
			                    </div>
			                </div>
	                    <div class="col mb-5">
			                    <div class="card h-100">
			                        <!-- Product image-->
			                        <img class="card-img-top" src="https://dummyimage.com/450x300/dee2e6/6c757d.jpg" alt="..." />
			                        <!-- Product details-->
			                        <div class="card-body p-4">
			                            <div class="text-center">
			                                <!-- Product name-->
			                                <h5 class="fw-bolder">서울 풋살장(파주)</h5>
			                                <!-- Reservation days -->
			                                2023.04.29 (토) <!-- 예약 가능 날짜 가져오기(오늘 날짜 기준으로) -->
			                                <br>
			                                <!-- Product price-->
			                                50,000원
			                            </div>
			                        </div>
			                        <!-- Product actions-->
			                        <div class="card-footer p-4 pt-0 border-top-0 bg-transparent">
			                            <div class="text-center">
			                            	<a class="btn btn-outline-dark mt-auto" href="#">상세보기</a>
			                            </div>
			                        </div>
			                    </div>
			                </div>
	                    <div class="col mb-5">
			                    <div class="card h-100">
			                        <!-- Product image-->
			                        <img class="card-img-top" src="https://dummyimage.com/450x300/dee2e6/6c757d.jpg" alt="..." />
			                        <!-- Product details-->
			                        <div class="card-body p-4">
			                            <div class="text-center">
			                                <!-- Product name-->
			                                <h5 class="fw-bolder">서울 풋살장(파주)</h5>
			                                <!-- Reservation days -->
			                                2023.04.29 (토) <!-- 예약 가능 날짜 가져오기(오늘 날짜 기준으로) -->
			                                <br>
			                                <!-- Product price-->
			                                50,000원
			                            </div>
			                        </div>
			                        <!-- Product actions-->
			                        <div class="card-footer p-4 pt-0 border-top-0 bg-transparent">
			                            <div class="text-center">
			                            	<a class="btn btn-outline-dark mt-auto" href="#">상세보기</a>
			                            </div>
			                        </div>
			                    </div>
			                </div>
	                    <div class="col mb-5">
			                    <div class="card h-100">
			                        <!-- Product image-->
			                        <img class="card-img-top" src="https://dummyimage.com/450x300/dee2e6/6c757d.jpg" alt="..." />
			                        <!-- Product details-->
			                        <div class="card-body p-4">
			                            <div class="text-center">
			                                <!-- Product name-->
			                                <h5 class="fw-bolder">서울 풋살장(파주)</h5>
			                                <!-- Reservation days -->
			                                2023.04.29 (토) <!-- 예약 가능 날짜 가져오기(오늘 날짜 기준으로) -->
			                                <br>
			                                <!-- Product price-->
			                                50,000원
			                            </div>
			                        </div>
			                        <!-- Product actions-->
			                        <div class="card-footer p-4 pt-0 border-top-0 bg-transparent">
			                            <div class="text-center">
			                            	<a class="btn btn-outline-dark mt-auto" href="#">상세보기</a>
			                            </div>
			                        </div>
			                    </div>
			                </div>
	                    
<%-- 	                    </c:forEach>
	                </c:when>
	                <c:otherwise>
	                	<div class="listNone">
	                		조회된 결과가 없습니다.
	                	</div>
	                </c:otherwise>
                </c:choose> --%>
                
            </div>
        </div>
    </section>
    
    <!-- Footer-->
    <%@include file="/includes/footer.jsp"%>
    
    
    
    <!-- Bootstrap core JS-->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>
    
    <script src="/includes/js/jquery-3.3.1.min.js"></script>
    <script src="/includes/js/jquery.lettering.js"></script>
    <script src="/includes/js/jquery.sticky.js"></script>
    <script src="/includes/js/ScrollMagic.min.js"></script>
    <script src="/includes/js/scrollmagic.animation.gsap.min.js"></script>
    <script src="/includes/js/main.js"></script>
</body>
</html>
