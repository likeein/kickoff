package com.teamcommit.kickoff.Service;

import com.teamcommit.kickoff.Do.HelperDO;

import java.util.*;

public interface HelperService {

    void insertHelper(HelperDO helperDO) throws Exception;

    void deleteHelper(HelperDO helperDO) throws Exception;

    Map<String, Object> selectHelperDetail(Map<String, Object> map) throws Exception;

    List<HelperDO> selectHelper() throws Exception;


}
