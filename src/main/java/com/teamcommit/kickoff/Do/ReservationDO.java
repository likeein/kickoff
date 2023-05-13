package com.teamcommit.kickoff.Do;

import java.util.Date;

public class ReservationDO {

	//예약 고유 번호
	private int reservationNo;
	//예약자 아이디
	private String userId;
	//예약 풋살장 아이디
	private int placeId;
	//예약 풋살장 이름
	private String reservationPlaceName;
	//예약 풋살장 위치
	private String reservationPlaceAddress;
	//예약 날짜
	private String reservationDate;
	//예약 인원
	private int reservationNumber;
	//예약 상태
	private String reservationStatus;
	//예약 등록 일자
	private String reservationRegDate;
	//예약 수정 일자
	private String reservationEditDate;
	//예약 시작 시간
	private String reservationStartTime;
	//예약 종료 시간
	private String reservationEndTime;
	//예약 기타 사항
	private String reservationComment;
	//예약 가격
	private Long reservationPrice;
	//경기 형태
	private String reservationGameStyle;
	//코트 이름
	private String reservationCourtName;
	//코트 형태
	private String reservationCourtForm;
	//예약 취소 유무
	private String reservationCancel;

	public ReservationDO() {

	}

	public ReservationDO(int reservationNo) {
		this.reservationNo = reservationNo;
	}

	public int getReservationNo() {
		return reservationNo;
	}

	public void setReservationNo(int reservationNo) {
		this.reservationNo = reservationNo;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public int getPlaceId() {
		return placeId;
	}

	public void setPlaceId(int placeId) {
		this.placeId = placeId;
	}

	public String getReservationDate() {
		return reservationDate;
	}

	public void setReservationDate(String reservationDate) {
		this.reservationDate = reservationDate;
	}

	public int getReservationNumber() {
		return reservationNumber;
	}

	public void setReservationNumber(int reservationNumber) {
		this.reservationNumber = reservationNumber;
	}

	public String getReservationStatus() {
		return reservationStatus;
	}

	public void setReservationStatus(String reservationStatus) {
		this.reservationStatus = reservationStatus;
	}

	public String getReservationRegDate() {
		return reservationRegDate;
	}

	public void setReservationRegDate(String reservationRegDate) {
		this.reservationRegDate = reservationRegDate;
	}

	public String getReservationEditDate() {
		return reservationEditDate;
	}

	public void setReservationEditDate(String reservationEditDate) {
		this.reservationEditDate = reservationEditDate;
	}

	public String getReservationStartTime() {
		return reservationStartTime;
	}

	public void setReservationStartTime(String reservationStartTime) {
		this.reservationStartTime = reservationStartTime;
	}

	public String getReservationEndTime() {
		return reservationEndTime;
	}

	public void setReservationEndTime(String reservationEndTime) {
		this.reservationEndTime = reservationEndTime;
	}

	public String getReservationComment() {
		return reservationComment;
	}

	public void setReservationComment(String reservationComment) {
		this.reservationComment = reservationComment;
	}

	public Long getReservationPrice() {
		return reservationPrice;
	}

	public void setReservationPrice(Long reservationPrice) {
		this.reservationPrice = reservationPrice;
	}

	public String getReservationGameStyle() {
		return reservationGameStyle;
	}

	public void setReservationGameStyle(String reservationGameStyle) {
		this.reservationGameStyle = reservationGameStyle;
	}

	public String getReservationCourtName() {
		return reservationCourtName;
	}

	public void setReservationCourtName(String reservationCourtName) {
		this.reservationCourtName = reservationCourtName;
	}

	public String getReservationCourtForm() {
		return reservationCourtForm;
	}

	public void setReservationCourtForm(String reservationCourtForm) {
		this.reservationCourtForm = reservationCourtForm;
	}

	public String getReservationCancel() {
		return reservationCancel;
	}

	public void setReservationCancel(String reservationCancel) {
		this.reservationCancel = reservationCancel;
	}

	public String getReservationPlaceName() {
		return reservationPlaceName;
	}

	public void setReservationPlaceName(String reservationPlaceName) {
		this.reservationPlaceName = reservationPlaceName;
	}

	public String getReservationPlaceAddress() {
		return reservationPlaceAddress;
	}

	public void setReservationPlaceAddress(String reservationPlaceAddress) {
		this.reservationPlaceAddress = reservationPlaceAddress;
	}

}
