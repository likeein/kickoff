package com.teamcommit.kickoff.Service;


import com.teamcommit.kickoff.Do.EmployerDO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface EmpMapper {
    public List<EmployerDO> getList(EmployerDO employerDO);
}
