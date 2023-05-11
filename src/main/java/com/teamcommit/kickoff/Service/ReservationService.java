package com.teamcommit.kickoff.Service;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

public interface ReservationService {

    void insertReservation(Map<String, Object> map, HttpServletRequest request) throws Exception;

    Map<String, Object> selectReservation(Map<String, Object> map) throws Exception;

    /*Map<String, Object> selectMemInfo(Map<String, Object> map) throws Exception;*/

}
