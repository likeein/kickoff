package com.teamcommit.kickoff.Service;


import com.teamcommit.kickoff.Do.BoardDO;
import com.teamcommit.kickoff.Do.EmployerDO;
import com.teamcommit.kickoff.Do.PlaceDO;
import com.teamcommit.kickoff.Do.ReservationDO;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

public interface EmpService {

    EmployerDO info_fix(EmployerDO employerDO);

    List<BoardDO> getList(BoardDO boardDO) throws Exception;

    List<PlaceDO> getList(PlaceDO placeDO);

    void insertFutsal(Map<String, Object> map, HttpServletRequest request) throws Exception;

    List<ReservationDO> getList() throws Exception;
}