package com.teamcommit.kickoff.Do;

public class HelperDO {

	//용병 게시글 번호
	private int helperSeqno;
	//사용자 아이디
	private String userId;
	//경기 번호
	private int gameSeqno;
	//메시지 번호
	private int messageSeqno;
	//용병 포지션
	private String helperPosition;
	//용병 상태
	private String helperStatus;
	//참가비
	private int helperPrice;	
	
	public int getHelperSeqno() {
		return helperSeqno;
	}
	public void setHelperSeqno(int helperSeqno) {
		this.helperSeqno = helperSeqno;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public int getGameSeqno() {
		return gameSeqno;
	}
	public void setGameSeqno(int gameSeqno) {
		this.gameSeqno = gameSeqno;
	}
	public int getMessageSeqno() {
		return messageSeqno;
	}
	public void setMessageSeqno(int messageSeqno) {
		this.messageSeqno = messageSeqno;
	}
	public String getHelperPosition() {
		return helperPosition;
	}
	public void setHelperPosition(String helperPosition) {
		this.helperPosition = helperPosition;
	}
	public String getHelperStatus() {
		return helperStatus;
	}
	public void setHelperStatus(String helperStatus) {
		this.helperStatus = helperStatus;
	}
	public int getHelperPrice() {
		return helperPrice;
	}
	public void setHelperPrice(int helperPrice) {
		this.helperPrice = helperPrice;
	}
	
}
