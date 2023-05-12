package com.teamcommit.kickoff.Service;

import com.teamcommit.kickoff.Do.ReservationDO;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

public interface ReservationService {

    List<ReservationDO> selectReservationList(ReservationDO reservationDO) throws Exception;
    void insertReservation(ReservationDO reservationDO) throws Exception;

    /*void insertReservation(Map<String, Object> map, HttpServletRequest request) throws Exception;*/

/*    Map<String, Object> selectReservationDetail(Map<String, Object> map) throws Exception;*/

    /*Map<String, Object> selectMemInfo(Map<String, Object> map) throws Exception;*/

}
