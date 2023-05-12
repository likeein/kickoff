package com.teamcommit.kickoff.Service;

import com.teamcommit.kickoff.Do.ReservationDO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ReservationMapper {

    public List<ReservationDO> selectReservationList(ReservationDO reservationDO);

}
