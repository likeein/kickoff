package com.teamcommit.kickoff.Do;

import java.util.Date;

public class ReservationDO {

	//예약 고유 번호
	private int reservstionNo;
	//예약자 아이디
	private String userId;
	//예약 풋살장 아이디
	private int placeId;
	//예약 날짜
	private Date reservationDate;
	//예약 인원
	private int reservationNumber;
	//예약 상태
	private String reservationStatus;
	//예약 등록 일자
	private Date reservationRegDate;
	//예약 수정 일자
	private Date reservationEditDate;
	//예약 시작 시간
	private String reservationStartTime;
	//예약 종료 시간
	private String reservationEndTime;
	//예약 기타 사항
	private String reservationComment;
	//예약 가격
	private String reservationPrice;
	//경기 형태
	private String reservationGameStyle;
	//코트 이름
	private String reservationCoatName;
	//예약 취소 유무
	private String reservationCancel;
	
	public int getReservstionNo() {
		return reservstionNo;
	}
	public void setReservstionNo(int reservstionNo) {
		this.reservstionNo = reservstionNo;
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
	public Date getReservationDate() {
		return reservationDate;
	}
	public void setReservationDate(Date reservationDate) {
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
	public Date getReservationRegDate() {
		return reservationRegDate;
	}
	public void setReservationRegDate(Date reservationRegDate) {
		this.reservationRegDate = reservationRegDate;
	}
	public Date getReservationEditDate() {
		return reservationEditDate;
	}
	public void setReservationEditDate(Date reservationEditDate) {
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
	public String getReservationPrice() {
		return reservationPrice;
	}
	public void setReservationPrice(String reservationPrice) {
		this.reservationPrice = reservationPrice;
	}
	public String getReservationGameStyle() {
		return reservationGameStyle;
	}
	public void setReservationGameStyle(String reservationGameStyle) {
		this.reservationGameStyle = reservationGameStyle;
	}
	public String getReservationCoatName() {
		return reservationCoatName;
	}
	public void setReservationCoatName(String reservationCoatName) {
		this.reservationCoatName = reservationCoatName;
	}
	public String getReservationCancel() {
		return reservationCancel;
	}
	public void setReservationCancel(String reservationCancel) {
		this.reservationCancel = reservationCancel;
	}
	
}
