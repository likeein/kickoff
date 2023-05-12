package com.teamcommit.kickoff.Service;

import com.teamcommit.kickoff.Dao.HelperDAO;
import com.teamcommit.kickoff.Do.HelperDO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.*;

@Service("helperService")
public class HelperServiceImpl implements HelperService {

    @Autowired
    private HelperMapper helperMapper;

   /* @Override
    public void insertHelper(HelperDO helperDO) throws Exception {
        helperDAO.insertHelper(helperDO);
    }

    @Override
    public void deleteHelper(HelperDO helperDO) throws Exception {
        helperDAO.deleteHelper(helperDO);
    }

    @Override
    public Map<String, Object> selectHelperDetail(Map<String, Object> map) throws Exception {
        return helperDAO.selectHelperDetail(map);
    }*/

    @Override
    public List<HelperDO> selectHelper(HelperDO helperDO) throws Exception {
        return helperMapper.selectHelper(helperDO);
    }

    @Override
    public void insertHelper(HelperDO helperDO) {
        helperMapper.insertHelper(helperDO);
    }
}
