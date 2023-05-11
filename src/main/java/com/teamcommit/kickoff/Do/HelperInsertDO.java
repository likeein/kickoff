package com.teamcommit.kickoff.Do;

import org.springframework.stereotype.Component;

@Component
public class HelperInsertDO {
    private String[] helperTeamLevel;
    private String helperPlaceName;
    private String helperPlace;
    private String helperTime;
    private String[] helperMatch;
    private String userId;
    private int helperWant;
    private String helperGender;
    private String[] helperPosition;
    private int helperPrice;

    public String[] getHelperTeamLevel() {
        return helperTeamLevel;
    }

    public void setHelperTeamLevel(String[] helperTeamLevel) {
        this.helperTeamLevel = helperTeamLevel;
    }

    public String getHelperPlaceName() {
        return helperPlaceName;
    }

    public void setHelperPlaceName(String helperPlaceName) {
        this.helperPlaceName = helperPlaceName;
    }

    public String getHelperPlace() {
        return helperPlace;
    }

    public void setHelperPlace(String helperPlace) {
        this.helperPlace = helperPlace;
    }

    public String getHelperTime() {
        return helperTime;
    }

    public void setHelperTime(String helperTime) {
        this.helperTime = helperTime;
    }

    public String[] getHelperMatch() {
        return helperMatch;
    }

    public void setHelperMatch(String[] helperMatch) {
        this.helperMatch = helperMatch;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public int getHelperWant() {
        return helperWant;
    }

    public void setHelperWant(int helperWant) {
        this.helperWant = helperWant;
    }

    public String getHelperGender() {
        return helperGender;
    }

    public void setHelperGender(String helperGender) {
        this.helperGender = helperGender;
    }

    public String[] getHelperPosition() {
        return helperPosition;
    }

    public void setHelperPosition(String[] helperPosition) {
        this.helperPosition = helperPosition;
    }

    public int getHelperPrice() {
        return helperPrice;
    }

    public void setHelperPrice(int helperPrice) {
        this.helperPrice = helperPrice;
    }

    public String selectBox(String select) {
        String result = "";

        if (select.equals("position")) {
            for (String str : this.getHelperPosition()) {
                result = str;
            }
        }
        else if (select.equals("match")) {
            for (String str : this.getHelperMatch()) {
                result = str;
            }
        }
        else if (select.equals("level")) {
            for (String str : this.getHelperTeamLevel()) {
                result = str;
            }
        }

        return result;
    }
}
