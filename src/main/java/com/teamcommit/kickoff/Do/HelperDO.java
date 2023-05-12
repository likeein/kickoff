package com.teamcommit.kickoff.Do;

import org.springframework.stereotype.Component;

@Component
public class HelperDO {

	//용병 게시글 번호
	private int helperSeqno;
	//사용자 아이디
	private String HELPER_ID;
	//경기 번호
	private int gameSeqno;
	//메시지 번호
	private int messageSeqno;
	//용병 포지션
	private String HELPER_POSITION;
	//용병 상태
	private String helperStatus;
	//참가비
	private int HELPER_PRICE;

	private String HELPER_MATCH;
	private String HELPER_PLACE;
	private String helperAddress;
	private String HELPER_GENDER;
	private int HELPER_WANT;
	private String HELPER_TIME;
	private String HELPER_TEAMLEVEL;
	private String HELPER_PLACE_NAME;

	public int getHelperSeqno() {
		return helperSeqno;
	}

	public void setHelperSeqno(int helperSeqno) {
		this.helperSeqno = helperSeqno;
	}

	public String getHELPER_ID() {
		return HELPER_ID;
	}

	public void setHELPER_ID(String HELPER_ID) {
		this.HELPER_ID = HELPER_ID;
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

	public String getHELPER_POSITION() {
		return HELPER_POSITION;
	}

	public void setHELPER_POSITION(String HELPER_POSITION) {
		this.HELPER_POSITION = HELPER_POSITION;
	}

	public String getHelperStatus() {
		return helperStatus;
	}

	public void setHelperStatus(String helperStatus) {
		this.helperStatus = helperStatus;
	}

	public int getHELPER_PRICE() {
		return HELPER_PRICE;
	}

	public void setHELPER_PRICE(int HELPER_PRICE) {
		this.HELPER_PRICE = HELPER_PRICE;
	}

	public String getHELPER_MATCH() {
		return HELPER_MATCH;
	}

	public void setHELPER_MATCH(String HELPER_MATCH) {
		this.HELPER_MATCH = HELPER_MATCH;
	}

	public String getHELPER_PLACE() {
		return HELPER_PLACE;
	}

	public void setHELPER_PLACE(String HELPER_PLACE) {
		this.HELPER_PLACE = HELPER_PLACE;
	}

	public String getHelperAddress() {
		return helperAddress;
	}

	public void setHelperAddress(String helperAddress) {
		this.helperAddress = helperAddress;
	}

	public String getHELPER_GENDER() {
		return HELPER_GENDER;
	}

	public void setHELPER_GENDER(String HELPER_GENDER) {
		this.HELPER_GENDER = HELPER_GENDER;
	}

	public int getHELPER_WANT() {
		return HELPER_WANT;
	}

	public void setHELPER_WANT(int HELPER_WANT) {
		this.HELPER_WANT = HELPER_WANT;
	}

	public String getHELPER_TIME() {
		return HELPER_TIME;
	}

	public void setHELPER_TIME(String HELPER_TIME) {
		this.HELPER_TIME = HELPER_TIME;
	}

	public String getHELPER_TEAMLEVEL() {
		return HELPER_TEAMLEVEL;
	}

	public void setHELPER_TEAMLEVEL(String HELPER_TEAMLEVEL) {
		this.HELPER_TEAMLEVEL = HELPER_TEAMLEVEL;
	}

	public String getHELPER_PLACE_NAME() {
		return HELPER_PLACE_NAME;
	}

	public void setHELPER_PLACE_NAME(String HELPER_PLACE_NAME) {
		this.HELPER_PLACE_NAME = HELPER_PLACE_NAME;
	}

	/*public String selectValue(String what) {
		String result = "";

		if (what.equals("t")) {
			for (String str : this.getHelperTeamLevel()) {
				result = str;
			}
		}
		else if (what.equals("p")) {
			for (String str : this.getHelperPosition()) {
				result = str;
			}
		}
		else if (what.equals("m")) {
			for (String str : this.getHelperMatch()) {
				result = str;
			}
		}
		return result;
	}*/
}
