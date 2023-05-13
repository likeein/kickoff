package com.teamcommit.kickoff.Do;

import java.util.Date;

public class ReservationDO {

	//예약 고유 번호
	private int RESERVATION_NO;
	//예약자 아이디
	private String USER_ID;
	//예약 풋살장 아이디
	private int PLACE_ID;
	//예약 날짜
	private String RESERVATION_DATE;
	//예약 인원
	private int RESERVATION_NUMBER;
	//예약 상태
	private String RESERVATION_STATUS;
	//예약 등록 일자
	private String RESERVATION_REG_DATE;
	//예약 수정 일자
	private String RESERVATION_EDIT_DATE;
	//예약 시작 시간
	private String RESERVATION_START_TIME;
	//예약 종료 시간
	private String RESERVATION_END_TIME;
	//예약 기타 사항
	private String RESERVATION_COMMENT;
	//예약 가격
	private String RESERVATION_PRICE;
	//경기 형태
	private String RESERVATION_GAME_STYLE;
	//코트 이름
	private String RESERVATION_COURT_NAME;
	//코트 형태
	private String RESERVATION_COURT_FORM;
	//예약 취소 유무
	private String RESERVATION_CANCEL;

	public ReservationDO() {

	}

	public int getRESERVATION_NO() {
		return RESERVATION_NO;
	}

	public void setRESERVATION_NO(int RESERVATION_NO) {
		this.RESERVATION_NO = RESERVATION_NO;
	}

	public String getUSER_ID() {
		return USER_ID;
	}

	public void setUSER_ID(String USER_ID) {
		this.USER_ID = USER_ID;
	}

	public int getPLACE_ID() {
		return PLACE_ID;
	}

	public void setPLACE_ID(int PLACE_ID) {
		this.PLACE_ID = PLACE_ID;
	}

	public String getRESERVATION_DATE() {
		return RESERVATION_DATE;
	}

	public void setRESERVATION_DATE(String RESERVATION_DATE) {
		this.RESERVATION_DATE = RESERVATION_DATE;
	}

	public int getRESERVATION_NUMBER() {
		return RESERVATION_NUMBER;
	}

	public void setRESERVATION_NUMBER(int RESERVATION_NUMBER) {
		this.RESERVATION_NUMBER = RESERVATION_NUMBER;
	}

	public String getRESERVATION_STATUS() {
		return RESERVATION_STATUS;
	}

	public void setRESERVATION_STATUS(String RESERVATION_STATUS) {
		this.RESERVATION_STATUS = RESERVATION_STATUS;
	}

	public String getRESERVATION_REG_DATE() {
		return RESERVATION_REG_DATE;
	}

	public void setRESERVATION_REG_DATE(String RESERVATION_REG_DATE) {
		this.RESERVATION_REG_DATE = RESERVATION_REG_DATE;
	}

	public String getRESERVATION_EDIT_DATE() {
		return RESERVATION_EDIT_DATE;
	}

	public void setRESERVATION_EDIT_DATE(String RESERVATION_EDIT_DATE) {
		this.RESERVATION_EDIT_DATE = RESERVATION_EDIT_DATE;
	}

	public String getRESERVATION_START_TIME() {
		return RESERVATION_START_TIME;
	}

	public void setRESERVATION_START_TIME(String RESERVATION_START_TIME) {
		this.RESERVATION_START_TIME = RESERVATION_START_TIME;
	}

	public String getRESERVATION_END_TIME() {
		return RESERVATION_END_TIME;
	}

	public void setRESERVATION_END_TIME(String RESERVATION_END_TIME) {
		this.RESERVATION_END_TIME = RESERVATION_END_TIME;
	}

	public String getRESERVATION_COMMENT() {
		return RESERVATION_COMMENT;
	}

	public void setRESERVATION_COMMENT(String RESERVATION_COMMENT) {
		this.RESERVATION_COMMENT = RESERVATION_COMMENT;
	}

	public String getRESERVATION_PRICE() {
		return RESERVATION_PRICE;
	}

	public void setRESERVATION_PRICE(String RESERVATION_PRICE) {
		this.RESERVATION_PRICE = RESERVATION_PRICE;
	}

	public String getRESERVATION_GAME_STYLE() {
		return RESERVATION_GAME_STYLE;
	}

	public void setRESERVATION_GAME_STYLE(String RESERVATION_GAME_STYLE) {
		this.RESERVATION_GAME_STYLE = RESERVATION_GAME_STYLE;
	}

	public String getRESERVATION_COURT_NAME() {
		return RESERVATION_COURT_NAME;
	}

	public void setRESERVATION_COURT_NAME(String RESERVATION_COURT_NAME) {
		this.RESERVATION_COURT_NAME = RESERVATION_COURT_NAME;
	}

	public String getRESERVATION_COURT_FORM() {
		return RESERVATION_COURT_FORM;
	}

	public void setRESERVATION_COURT_FORM(String RESERVATION_COURT_FORM) {
		this.RESERVATION_COURT_FORM = RESERVATION_COURT_FORM;
	}

	public String getRESERVATION_CANCEL() {
		return RESERVATION_CANCEL;
	}

	public void setRESERVATION_CANCEL(String RESERVATION_CANCEL) {
		this.RESERVATION_CANCEL = RESERVATION_CANCEL;
	}




}
