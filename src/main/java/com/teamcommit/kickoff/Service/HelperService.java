package com.teamcommit.kickoff.Service;

import com.teamcommit.kickoff.Do.HelperDO;
import com.teamcommit.kickoff.Do.HelperInsertDO;

import javax.servlet.http.HttpServletRequest;
import java.util.*;

public interface HelperService {

    void insertHelper(HelperInsertDO helperInsertDO) throws Exception;

    void deleteHelper(HelperDO helperDO) throws Exception;

    Map<String, Object> selectHelperDetail(Map<String, Object> map) throws Exception;

    List<HelperDO> selectHelper() throws Exception;


}
