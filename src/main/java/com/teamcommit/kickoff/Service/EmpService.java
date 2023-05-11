package com.teamcommit.kickoff.Service;


import com.teamcommit.kickoff.Do.EmployerDO;

import java.util.List;

public interface EmpService {

    List<EmployerDO> getList(EmployerDO employerDO);

}