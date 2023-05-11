package com.teamcommit.kickoff.Dao;

import com.teamcommit.kickoff.Common.AbstractDAO;
import com.teamcommit.kickoff.Do.HelperDO;
import com.teamcommit.kickoff.Do.HelperInsertDO;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository("helperDAO")
public class HelperDAO extends AbstractDAO {

    @SuppressWarnings("unchecked")
    public List<HelperDO> selectHelper() throws Exception {
        return (List<HelperDO>) selectList("helper.selectHelper");
    }

    public void insertHelper(HelperInsertDO helperInsertDO) throws Exception {
        insert("helper.insertHelper", helperInsertDO);
    }

    @SuppressWarnings("unchecked")
    public Map<String, Object> selectHelperDetail(Map<String, Object> map) throws Exception {
        return (Map<String, Object>) selectOne("helper.selectHelperDetail", map);
    }

    public void deleteHelper(HelperDO helperDO) throws Exception {
        delete("helper.deleteHelper", helperDO);
    }
}
