package com.teamcommit.kickoff.Service;

import com.teamcommit.kickoff.Do.EmployerDO;
import com.teamcommit.kickoff.Do.PlaceDO;
import com.teamcommit.kickoff.Do.ReservationDO;
import com.teamcommit.kickoff.Do.UserDO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ReservationMapper {

    public List<ReservationDO> selectReservationList(ReservationDO reservationDO);

    public void insertReservation(ReservationDO reservationDO);

    public ReservationDO selectReservationDetail(int reservationNo);

    public void updateReservation(ReservationDO reservationDO);

    public PlaceDO selectPlaceInfo(int placeId);
}
