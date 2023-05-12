package com.teamcommit.kickoff.Service;

import com.teamcommit.kickoff.Do.HelperDO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface HelperMapper {
    List<HelperDO> selectHelper(HelperDO helperDO);

    public void insertHelper(HelperDO helperDO);

}
