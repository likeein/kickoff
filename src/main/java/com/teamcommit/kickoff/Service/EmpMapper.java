package com.teamcommit.kickoff.Service;


import com.teamcommit.kickoff.Do.BoardDO;
import com.teamcommit.kickoff.Do.EmployerDO;
import com.teamcommit.kickoff.Do.PlaceDO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface EmpMapper {
    public List<EmployerDO> getList(EmployerDO employerDO);

    public List<PlaceDO> getList(PlaceDO placeDO);

    EmployerDO info_fix(EmployerDO employerDO);

    List<BoardDO> getList(BoardDO boardDO);
}
