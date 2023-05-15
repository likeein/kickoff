package com.teamcommit.kickoff.Service;


import com.teamcommit.kickoff.Do.BoardDO;
import com.teamcommit.kickoff.Do.EmployerDO;
import com.teamcommit.kickoff.Do.PlaceDO;
import com.teamcommit.kickoff.Do.ReservationDO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface EmpMapper {
    public List<EmployerDO> getList(EmployerDO employerDO);

    EmployerDO info_fix(EmployerDO employerDO);

    List<BoardDO> getList(BoardDO boardDO);

    List<ReservationDO> selectReservation(ReservationDO reservationDO);

    public PlaceDO empFutsalInsert(PlaceDO placeDO);

    public void updateFutsal(PlaceDO placeDO);
}
