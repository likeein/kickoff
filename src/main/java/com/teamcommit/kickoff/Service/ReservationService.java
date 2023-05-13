package com.teamcommit.kickoff.Service;

import com.teamcommit.kickoff.Do.EmployerDO;
import com.teamcommit.kickoff.Do.PlaceDO;
import com.teamcommit.kickoff.Do.ReservationDO;

import java.util.List;

public interface ReservationService {

    List<ReservationDO> selectReservationList(ReservationDO reservationDO) throws Exception;
    void insertReservation(ReservationDO reservationDO) throws Exception;

    ReservationDO selectReservationDetail(int reservationNO) throws Exception;

    void updateReservation(ReservationDO reservationDO) throws Exception;

    PlaceDO selectPlaceInfo(int placeId) throws Exception;

    /*    Map<String, Object> selectReservationDetail(Map<String, Object> map) throws Exception;*/

    /*Map<String, Object> selectMemInfo(Map<String, Object> map) throws Exception;*/

}
